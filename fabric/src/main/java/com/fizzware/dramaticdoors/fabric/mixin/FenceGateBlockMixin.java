package com.fizzware.dramaticdoors.fabric.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

@Mixin(FenceGateBlock.class)
public class FenceGateBlockMixin extends Block implements SimpleWaterloggedBlock
{
	public FenceGateBlockMixin(Properties properties) {
		super(properties); // Not used
	}

	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)V")
	private void enhanceConstructor(BlockBehaviour.Properties properties, CallbackInfo callback) {
		if (((FenceGateBlock)(Object)this).defaultBlockState().hasProperty(WATERLOGGED)) {
			((FenceGateBlock)(Object)this).registerDefaultState(((FenceGateBlock) (Object) this).defaultBlockState().setValue(WATERLOGGED, false));
		}
	}

	@Inject(at = @At("TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V")
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		if (!FabricLoader.getInstance().isModLoaded("fixedwaterlogging") && !FabricLoader.getInstance().isModLoaded("statement")) {
			builder.add(WATERLOGGED);
		}
	}

	@Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
	private void injectPlacementState(BlockPlaceContext context, CallbackInfoReturnable<BlockState> callback) {
		if (((FenceGateBlock)(Object)this).defaultBlockState().hasProperty(WATERLOGGED)) {
			BlockPos blockpos = context.getClickedPos();
			Level level = context.getLevel();
			boolean flag = level.hasNeighborSignal(blockpos);
			boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER;
			Direction direction = context.getHorizontalDirection();
			Direction.Axis direction$axis = direction.getAxis();
			boolean flag1 = direction$axis == Direction.Axis.Z && (((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.west())) || ((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.east()))) || direction$axis == Direction.Axis.X && (((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.north())) || ((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.south())));
			callback.setReturnValue(((FenceGateBlock)(Object)this).defaultBlockState().setValue(FenceGateBlock.FACING, direction).setValue(FenceGateBlock.OPEN, Boolean.valueOf(flag)).setValue(FenceGateBlock.POWERED, Boolean.valueOf(flag)).setValue(FenceGateBlock.IN_WALL, Boolean.valueOf(flag1)).setValue(WATERLOGGED, waterfilled));
			callback.cancel();
		}
	}
	
	public FluidState getFluidState(BlockState state) {
		if (state.hasProperty(WATERLOGGED)) {
			return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
		}
		else {
			return Fluids.EMPTY.defaultFluidState();
		}
	}
	
}
