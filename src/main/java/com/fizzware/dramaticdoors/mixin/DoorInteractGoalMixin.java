package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.DoorInteractGoal;
import net.minecraft.world.level.block.state.BlockState;

@Mixin(DoorInteractGoal.class)
public class DoorInteractGoalMixin
{
	@Shadow
	protected boolean hasDoor;
	@Shadow
	protected Mob mob;
	@Shadow
    protected BlockPos doorPos = BlockPos.ZERO;

	@Inject(method = "isOpen()Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", shift = Shift.AFTER), cancellable = true)
	private void injectIsDoorOpen(CallbackInfoReturnable<Boolean> cir) {
        BlockState blockStateDD = this.mob.level.getBlockState(this.doorPos);
        if (this.hasDoor && blockStateDD.getBlock() instanceof TallDoorBlock) {
            cir.setReturnValue(blockStateDD.getValue(TallDoorBlock.OPEN));
        }
	}
	
	@Inject(method = "setOpen(Z)V", at = @At("TAIL"))
	private void injectSetDoorOpen(boolean open, CallbackInfo ci) {
		BlockState tallDoorBlockState;
        if (this.hasDoor && (tallDoorBlockState = this.mob.level.getBlockState(this.doorPos)).getBlock() instanceof TallDoorBlock) {
            ((TallDoorBlock)tallDoorBlockState.getBlock()).setOpen(this.mob, this.mob.level, tallDoorBlockState, this.doorPos, open);
        }
	}

	@Inject(method = "canUse()Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/DoorBlock;isWoodenDoor(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", shift = At.Shift.AFTER), cancellable = true)
	private void injectCanStart(CallbackInfoReturnable<Boolean> ci) {
		this.hasDoor = TallDoorBlock.isWoodenDoor(this.mob.level, this.doorPos);
		if (this.hasDoor) {
			ci.setReturnValue(true);
		}
	}

}
