package com.fizzware.dramaticdoors.forge.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.rk.thingamajigs.xtrablock.LockableDoor;

@Mixin(value = LockableDoor.class, remap = true)
public class LockableDoorMixin extends DoorBlock
{
	public LockableDoorMixin(Properties properties, BlockSetType blockset) {
		super(properties, blockset); // Not used...		
	}
	
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean waterfilled = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(LockableDoor.LOCKED, false).setValue(BlockStateProperties.WATERLOGGED, waterfilled);
	}
}
