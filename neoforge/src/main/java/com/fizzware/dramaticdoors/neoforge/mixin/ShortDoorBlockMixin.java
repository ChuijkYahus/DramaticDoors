package com.fizzware.dramaticdoors.neoforge.mixin;

import org.spongepowered.asm.mixin.Mixin;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringDoorBlock;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

@Mixin(ShortDoorBlock.class)
public class ShortDoorBlockMixin extends Block
{
	public ShortDoorBlockMixin(Properties properties) {
		super(properties); // Not used.
	}

	@Override
	public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility toolAction, boolean simulate) {
		if (ItemAbilities.AXE_WAX_OFF == toolAction && !simulate) {
            return ShortWeatheringDoorBlock.getUnwaxed(state).orElse(null);
		}
		return super.getToolModifiedState(state, context, toolAction, simulate);
	}
}
