package com.fizzware.dramaticdoors.forge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

import org.dawnoftimebuilder.block.templates.DoorBlockDoTB;

@Mixin(DoorBlockDoTB.class)
public class DoTBDoorBlockMixin 
{
	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/DoorBlock;createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", shift = Shift.AFTER), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", cancellable = true)
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		if (callback.isCancellable()) {
			callback.cancel();
		}
	}
}
