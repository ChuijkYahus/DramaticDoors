package com.fizzware.dramaticdoors.neoforge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fizzware.dramaticdoors.blocks.ShortWeatheringDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringDoorBlock;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

@Mixin(HoneycombItem.class)
public class HoneycombItemMixin
{
	@Inject(at = @At(value = "HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
	private void injectUse(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        Level levelDD = context.getLevel();
        BlockPos blockposDD = context.getClickedPos();
        BlockState blockstateDD = levelDD.getBlockState(blockposDD);
		if (blockstateDD.getBlock() instanceof ShortWeatheringDoorBlock || blockstateDD.getBlock() instanceof TallWeatheringDoorBlock) {
			BlockState newstate = null;
			if (ShortWeatheringDoorBlock.getWaxed(blockstateDD).isPresent()) {
        		newstate = ShortWeatheringDoorBlock.getWaxed(blockstateDD).get();
			}
			if (TallWeatheringDoorBlock.getWaxed(blockstateDD).isPresent()) {
        		newstate = TallWeatheringDoorBlock.getWaxed(blockstateDD).get();
			}
			if (newstate != null) {
	            Player player = context.getPlayer();
	            ItemStack itemstack = context.getItemInHand();
	            if (context.getPlayer() instanceof ServerPlayer) {
	                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockposDD, itemstack);
	            }
	            levelDD.setBlock(blockposDD, newstate, 11);
	            levelDD.gameEvent(GameEvent.BLOCK_CHANGE, blockposDD, GameEvent.Context.of(player, newstate));
	            levelDD.levelEvent(player, 3003, blockposDD, 0);
	    		itemstack.shrink(1);
	    		cir.setReturnValue(InteractionResult.sidedSuccess(levelDD.isClientSide()));
			}
		}
	}
}
