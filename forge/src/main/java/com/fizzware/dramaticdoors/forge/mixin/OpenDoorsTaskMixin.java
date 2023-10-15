package com.fizzware.dramaticdoors.forge.mixin;

import java.util.Iterator;
import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.tags.DDBlockTags;

import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;

// Ported from Fabric version of Dramatic Doors.
@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin
{
	
	// Part 1 of inject, upper checks.
	@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;rememberDoorToClose(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;)V", ordinal = 0, shift = Shift.BY, by = 2), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void injectStartP1(ServerLevel world, LivingEntity entity, long time, CallbackInfo ci, Path path, Node node, Node node1, BlockPos blockpos, BlockState blockstate) {
		if (blockstate.is(DDBlockTags.TALL_WOODEN_DOORS, (localblockstate) -> {
			return localblockstate.getBlock() instanceof TallDoorBlock;
		})) {
			TallDoorBlock talldoorblock = (TallDoorBlock)blockstate.getBlock();
			if (!talldoorblock.isOpen(blockstate)) {
				talldoorblock.setOpen(entity, world, blockstate, blockpos, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockpos);
		}
		if (blockstate.is(DDBlockTags.SHORT_WOODEN_DOORS, (localblockstate) -> {
			return localblockstate.getBlock() instanceof ShortDoorBlock;
		})) {
			ShortDoorBlock shortdoorblock = (ShortDoorBlock)blockstate.getBlock();
			if (!shortdoorblock.isOpen(blockstate)) {
				shortdoorblock.setOpen(entity, world, blockstate, blockpos, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockpos);
		}
	}
	
	// Part 2 of inject, lower checks.
	@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V", shift = Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void injectStartP2(ServerLevel world, LivingEntity entity, long time, CallbackInfo ci, Path path, Node node, Node node1) {
		BlockPos blockPosDD2 = node1.asBlockPos();
		BlockState blockstateDD2 = world.getBlockState(blockPosDD2);
		if (blockstateDD2.is(DDBlockTags.TALL_WOODEN_DOORS, (localblockstate) -> {
			return localblockstate.getBlock() instanceof TallDoorBlock;
		})) {
			TallDoorBlock talldoorblock = (TallDoorBlock)blockstateDD2.getBlock();
			if (!talldoorblock.isOpen(blockstateDD2)) {
				talldoorblock.setOpen(entity, world, blockstateDD2, blockPosDD2, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockPosDD2);
		}
		if (blockstateDD2.is(DDBlockTags.SHORT_WOODEN_DOORS, (localblockstate) -> {
			return localblockstate.getBlock() instanceof ShortDoorBlock;
		})) {
			ShortDoorBlock shortdoorblock = (ShortDoorBlock)blockstateDD2.getBlock();
			if (!shortdoorblock.isOpen(blockstateDD2)) {
				shortdoorblock.setOpen(entity, world, blockstateDD2, blockPosDD2, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockPosDD2);
		}
	}
	
	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, CallbackInfo ci, Brain<?> brain, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
        if (blockStateDD.is(DDBlockTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
        if (blockStateDD.is(DDBlockTags.SHORT_WOODEN_DOORS, state -> state.getBlock() instanceof ShortDoorBlock)) {
        	ShortDoorBlock shortDoorBlock = (ShortDoorBlock)blockStateDD.getBlock();
        	shortDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
	}
}
