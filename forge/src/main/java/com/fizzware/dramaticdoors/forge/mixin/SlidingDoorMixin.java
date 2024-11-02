package com.fizzware.dramaticdoors.forge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.alexander8vkhz.slidingdoors.door.Slidingdoorconfig;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

@Mixin(Slidingdoorconfig.class)
public class SlidingDoorMixin 
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;Lnet/minecraft/world/level/block/state/properties/BlockSetType;)V")
	private void enhanceConstructor(BlockBehaviour.Properties properties, BlockSetType blocksettype, CallbackInfo callback) {
		((Slidingdoorconfig)(Object)this).registerDefaultState(((Slidingdoorconfig)(Object)this).defaultBlockState().setValue(WATERLOGGED, false));
	}
	
	@Inject(at = @At("TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V")
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		builder.add(WATERLOGGED);
	}
}
