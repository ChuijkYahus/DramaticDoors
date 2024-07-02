package com.fizzware.dramaticdoors.neoforge.mixin;

import org.spongepowered.asm.mixin.Mixin;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringDoorBlock;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

@Mixin(ShortWeatheringDoorBlock.class)
public class ShortCopperDoorBlockMixin extends ShortDoorBlock
{
	public ShortCopperDoorBlockMixin(BlockSetType blockset, Block from) {
		super(blockset, from); // Not used.
	}

	@Override
	public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility toolAction, boolean simulate) {
		if (ItemAbilities.AXE_SCRAPE == toolAction && !simulate) {
            return ShortWeatheringDoorBlock.getPrevious(state).orElse(null);
		}
		return super.getToolModifiedState(state, context, toolAction, simulate);
	}
	
}
