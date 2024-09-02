package com.fizzware.dramaticdoors.forge.addons.blockcarpentry;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFrameDoorBlock;

import mod.pianomanu.blockcarpentry.block.DoorFrameBlock;
import mod.pianomanu.blockcarpentry.block.IFrameBlock;
import mod.pianomanu.blockcarpentry.tileentity.FrameBlockTile;
import mod.pianomanu.blockcarpentry.tileentity.LockableFrameTile;
import mod.pianomanu.blockcarpentry.util.BlockAppearanceHelper;
import mod.pianomanu.blockcarpentry.util.BlockModificationHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.IPlantable;

public class ShortForgeFrameDoorBlock extends ShortFrameDoorBlock implements EntityBlock, IFrameBlock
{

	public ShortForgeFrameDoorBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(CONTAINS_BLOCK, false).setValue(ShortDoorBlock.FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)).setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.valueOf(false)).setValue(LIGHT_LEVEL, 0));
	}

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    	super.createBlockStateDefinition(builder);
        builder.add(DoorFrameBlock.CONTAINS_BLOCK, DoorFrameBlock.LIGHT_LEVEL);
    }
	
	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new LockableFrameTile(pos, state);
	}

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitresult) {
        return frameUse(state, level, pos, player, hand, hitresult);
    }

    @Override
    public InteractionResult frameUseServer(BlockState state, Level level, BlockPos pos, Player player, ItemStack itemStack, BlockHitResult hitresult) {
        convertOutdatedTile(state, level, pos, player);
        if (shouldCallFrameUse(state, itemStack))
            return IFrameBlock.super.frameUseServer(state, level, pos, player, itemStack, hitresult);
        if (lockRedstoneSignal(state, level, pos, player, itemStack) || lockOpenClose(state, level, pos, player, itemStack))
            return InteractionResult.CONSUME;
        if (state.getValue(CONTAINS_BLOCK)) {
            return doorBehavior(state, level, pos, player, hitresult);
        }
        return InteractionResult.FAIL;
    }

    private InteractionResult doorBehavior(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitresult) {
        BlockEntity tileEntity = level.getBlockEntity(pos);
        if (tileEntity instanceof LockableFrameTile doorTileEntity) {
            if (doorTileEntity.canBeOpenedByPlayers()) {
                super.use(state, level, pos, player, InteractionHand.MAIN_HAND, hitresult);
                level.levelEvent(null, state.getValue(OPEN) ? 1012 : 1006, pos, 0);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.CONSUME;
    }

    private void convertOutdatedTile(BlockState state, Level level, BlockPos pos, Player player) {
        BlockEntity tileEntity = level.getBlockEntity(pos);
        if (!(tileEntity instanceof LockableFrameTile) && (tileEntity instanceof FrameBlockTile)) {
            LockableFrameTile newTile = (LockableFrameTile) newBlockEntity(pos, state);
            if (newTile != null) {
                newTile.addFromOutdatedTileEntity((FrameBlockTile) tileEntity);
                level.setBlockEntity(newTile);
                player.displayClientMessage(Component.translatable("message.blockcarpentry.converting_outdated_block"), true);
            }
        }
    }

    private boolean lockRedstoneSignal(BlockState state, Level level, BlockPos pos, Player player, ItemStack itemStack) {
        if (itemStack.getItem() == Items.REDSTONE) {
            BlockEntity tileEntity = level.getBlockEntity(pos);
            if (tileEntity instanceof LockableFrameTile doorTileEntity) {
                if (doorTileEntity.canBeOpenedByRedstoneSignal()) {
                    player.displayClientMessage(Component.translatable("message.blockcarpentry.redstone_off"), true);
                } else {
                    player.displayClientMessage(Component.translatable("message.blockcarpentry.redstone_on"), true);
                }
                doorTileEntity.setCanBeOpenedByRedstoneSignal(!doorTileEntity.canBeOpenedByRedstoneSignal());
            } else {
                convertOutdatedTile(state, level, pos, player);
            }
            return true;
        }
        return false;
    }

    private boolean lockOpenClose(BlockState state, Level level, BlockPos pos, Player player, ItemStack itemStack) {
        if (itemStack.getItem() == Items.IRON_INGOT) {
            BlockEntity tileEntity = level.getBlockEntity(pos);
            if (tileEntity instanceof LockableFrameTile doorTileEntity) {
                if (doorTileEntity.canBeOpenedByPlayers()) {
                    player.displayClientMessage(Component.translatable("message.blockcarpentry.lock"), true);
                } else {
                    player.displayClientMessage(Component.translatable("message.blockcarpentry.unlock"), true);
                }
                doorTileEntity.setCanBeOpenedByPlayers(!doorTileEntity.canBeOpenedByPlayers());
            } else {
                convertOutdatedTile(state, level, pos, player);
            }
            return true;
        }
        return false;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onRemove(BlockState state, Level levelIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            dropContainedBlock(levelIn, pos);

            super.onRemove(state, levelIn, pos, newState, isMoving);
        }
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return IFrameBlock.getLightEmission(state);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos pos2, boolean update) {
        BlockEntity tileEntity = level.getBlockEntity(pos);
        if (tileEntity instanceof LockableFrameTile doorTileEntity && doorTileEntity.canBeOpenedByRedstoneSignal()) {
            super.neighborChanged(state, level, pos, block, pos2, update);
        }
    }

    @Override
    public boolean isCorrectTileInstance(BlockEntity blockEntity) {
        return blockEntity instanceof LockableFrameTile;
    }

    public void fillBlockEntity(Level levelIn, BlockPos pos, BlockState state, BlockState handBlock, BlockEntity blockEntity) {
        LockableFrameTile frameBlockEntity = (LockableFrameTile) blockEntity;
        frameBlockEntity.clear();
        frameBlockEntity.setMimic(handBlock);
        levelIn.setBlock(pos, state.setValue(CONTAINS_BLOCK, Boolean.TRUE), 2);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return IFrameBlock.super.canSustainPlant(state, world, pos, facing);
    }

    @Override
    public boolean executeModifications(BlockState state, Level level, BlockPos pos, Player player, ItemStack itemStack) {
        return BlockAppearanceHelper.setAll(itemStack, state, level, pos, player) || getTile(level, pos) != null && BlockModificationHelper.setAll(itemStack, getTile(level, pos), player, true, false);
    }
}
