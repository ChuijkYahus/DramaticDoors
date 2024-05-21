package com.fizzware.dramaticdoors.neoforge.mixin;

import org.spongepowered.asm.mixin.Mixin;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringCopperDoorBlock;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.common.ToolAction;
import net.neoforged.neoforge.common.ToolActions;

@Mixin(ShortWeatheringCopperDoorBlock.class)
public class ShortCopperDoorBlockMixin extends ShortDoorBlock
{
	public ShortCopperDoorBlockMixin(BlockSetType blockset, Block from) {
		super(blockset, from); // Not used.
	}

	@Override
	public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
		if (ToolActions.AXE_SCRAPE == toolAction && !simulate) {
            return ShortWeatheringCopperDoorBlock.getPrevious(state).orElse(null);
		}
		return super.getToolModifiedState(state, context, toolAction, simulate);
	}
}
