package com.fizzware.dramaticdoors.blocks;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.Orientation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShortFleshDoorBlock extends ShortDoorBlock
{
	public static final EnumProperty<Orientation> ORIENTATION = DDBlockStateProperties.ORIENTATION;
	public static final int USE_UPDATE_FLAG = Block.UPDATE_CLIENTS | Block.UPDATE_IMMEDIATE; // 10
	
	protected static final int THICKNESS = 2;
	protected static final int CLOSED_SHAPE_INDEX = 0;
	protected static final int OPEN_SHAPE_INDEX = 1;
	protected static final VoxelShape[] X_NEG_AABB = createClosedAndOpenShape(0, 0, 0, THICKNESS, 16, 16);
	protected static final VoxelShape[] X_NONE_AABB = createClosedAndOpenShape(8d - THICKNESS / 2d, 0, 0, 8d + THICKNESS / 2d, 16, 16);
	protected static final VoxelShape[] X_POS_AABB = createClosedAndOpenShape(16d - THICKNESS, 0, 0, 16, 16, 16);
	protected static final VoxelShape[] Z_NEG_AABB = createClosedAndOpenShape(0, 0, 0, 16, 16, THICKNESS);
	protected static final VoxelShape[] Z_NONE_AABB = createClosedAndOpenShape(0, 0, 8d - THICKNESS / 2d, 16, 16, 8d + THICKNESS / 2d);
	protected static final VoxelShape[] Z_POS_AABB = createClosedAndOpenShape(0, 0, 16d - THICKNESS, 16, 16, 16);

	public ShortFleshDoorBlock(Block from) {
		super(from);
		registerDefaultState(defaultBlockState().setValue(ORIENTATION, Orientation.X_MIDDLE));
	}

	private static VoxelShape[] createClosedAndOpenShape(double x0, double y0, double z0, double x1, double y1, double z1) {
		VoxelShape closedShape = Block.box(x0, y0, z0, x1, y1, z1);

		boolean caseX = x0 == 0 && x1 == 16;
		boolean caseZ = z0 == 0 && z1 == 16;
		double offset = 2;
		double xA = caseX ? x0 + offset : x0;
		double zA = caseZ ? z0 + offset : z0;
		double xB = caseX ? x1 - offset : x1;
		double zB = caseZ ? z1 - offset : z1;
		VoxelShape openShape = Shapes.join(closedShape, Block.box(xA, y0 + offset, zA, xB, y1 - offset, zB), BooleanOp.NOT_SAME);
		VoxelShape openShapeForCollision = Shapes.join(closedShape, Block.box(xA, y0, zA, xB, y1, zB), BooleanOp.NOT_SAME);

		return new VoxelShape[]{closedShape, openShape, openShapeForCollision};
	}
	
	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockPos pos = context.getClickedPos();
		Level level = context.getLevel();
		if (pos.getY() >= level.getMaxBuildHeight() || !level.getBlockState(pos).canBeReplaced(context)) {
			return null;
		}

		BlockState state = defaultBlockState();
		if (!context.replacingClickedOnBlock()) {
			Orientation orientation = Orientation.getXZOrientationFrom(context);
			state = state.setValue(ORIENTATION, orientation);
		}
		else {
			boolean isXAxis = context.getHorizontalDirection().getAxis() == Direction.Axis.X;
			state = state.setValue(ORIENTATION, isXAxis ? Orientation.X_MIDDLE : Orientation.Z_MIDDLE);
		}

		if (level.hasNeighborSignal(pos) || level.hasNeighborSignal(pos.above())) {
			state = state.setValue(OPEN, true).setValue(POWERED, true);
		}
		// Normally irrelevant but it's there for double doors mod compatibility.
		if (context.getHorizontalDirection().getAxis() == Axis.X) {
			state = state.setValue(FACING, Direction.EAST); 
		}
		else if (context.getHorizontalDirection().getAxis() == Axis.Z) {
			state = state.setValue(FACING, Direction.NORTH);
		}
		// Set hinge. Flip if necessary depending on which way you face.
		state = state.setValue(HINGE, getHinge(context));
		if (context.getHorizontalDirection() == Direction.WEST || context.getHorizontalDirection() == Direction.SOUTH) {
			state = state.cycle(HINGE);
		}
		if (level.getFluidState(pos).getType() == Fluids.WATER) {
			state = state.setValue(WATERLOGGED, true);
		}
		return state;
	}

	@Override
	public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
		super.setPlacedBy(level, pos, state, placer, stack);
	}

	protected DoorHingeSide getHinge(BlockPlaceContext pContext) {
		return super.getHinge(pContext);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		int offset = 0;
		int idx = isOpen(state) ? OPEN_SHAPE_INDEX + offset : CLOSED_SHAPE_INDEX;

		return switch (state.getValue(ORIENTATION)) {
			case X_POSITIVE -> X_POS_AABB[idx];
			case X_MIDDLE -> X_NONE_AABB[idx];
			case X_NEGATIVE -> X_NEG_AABB[idx];
			case Z_POSITIVE -> Z_POS_AABB[idx];
			case Z_MIDDLE -> Z_NONE_AABB[idx];
			case Z_NEGATIVE -> Z_NEG_AABB[idx];
			default -> Shapes.block();
		};
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		int idx = isOpen(state) ? OPEN_SHAPE_INDEX + 1 : CLOSED_SHAPE_INDEX;

		return switch (state.getValue(ORIENTATION)) {
			case X_POSITIVE -> X_POS_AABB[idx];
			case X_MIDDLE -> X_NONE_AABB[idx];
			case X_NEGATIVE -> X_NEG_AABB[idx];
			case Z_POSITIVE -> Z_POS_AABB[idx];
			case Z_MIDDLE -> Z_NONE_AABB[idx];
			case Z_NEGATIVE -> Z_NEG_AABB[idx];
			default -> Shapes.block();
		};
	}
	
	@Override
	public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
		return switch (type) {
			case LAND, AIR -> isOpen(state);
			case WATER -> false;
		};
	}

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(ORIENTATION);
    }
	
	@Override
	public BlockState rotate(BlockState state, Rotation rotationDirection) {
		//Note: the Create Mod does not call IForgeBlock#rotate and calls this method directly (Create Train/Contraption disassembly)
		Orientation orientation = state.getValue(ORIENTATION);
		return state.setValue(ORIENTATION, orientation.rotate(rotationDirection));
	}

	@Override
	public BlockState mirror(BlockState state, Mirror mirror) {
		Orientation orientation = state.getValue(ORIENTATION);
		return state.setValue(ORIENTATION, orientation.mirror(mirror));
	}

}
