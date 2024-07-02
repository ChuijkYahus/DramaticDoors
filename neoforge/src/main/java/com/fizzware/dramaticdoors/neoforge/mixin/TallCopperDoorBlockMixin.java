package com.fizzware.dramaticdoors.neoforge.mixin;

import org.spongepowered.asm.mixin.Mixin;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringDoorBlock;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

@Mixin(TallWeatheringDoorBlock.class)
public class TallCopperDoorBlockMixin extends TallDoorBlock
{
	public TallCopperDoorBlockMixin(BlockSetType blockset, Block from) {
		super(blockset, from); // Not used.
	}

	@Override
	public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility toolAction, boolean simulate) {
		if (ItemAbilities.AXE_SCRAPE == toolAction && !simulate) {
            return TallWeatheringDoorBlock.getPrevious(state).orElse(null);
		}
		return super.getToolModifiedState(state, context, toolAction, simulate);
	}
}
