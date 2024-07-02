package com.fizzware.dramaticdoors.neoforge.mixin;

import org.spongepowered.asm.mixin.Mixin;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringDoorBlock;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

@Mixin(TallDoorBlock.class)
public class TallDoorBlockMixin extends Block
{
	public TallDoorBlockMixin(Properties properties) {
		super(properties); // Not used.
	}

	@Override
	public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility toolAction, boolean simulate) {
		if (ItemAbilities.AXE_WAX_OFF == toolAction && !simulate) {
            return TallWeatheringDoorBlock.getUnwaxed(state).orElse(null);
		}
		return super.getToolModifiedState(state, context, toolAction, simulate);
	}
}
