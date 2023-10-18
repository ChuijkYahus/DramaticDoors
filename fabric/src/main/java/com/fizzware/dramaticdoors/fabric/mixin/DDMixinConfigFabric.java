package com.fizzware.dramaticdoors.fabric.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.fabric.config.DDConfigFabric;

import net.fabricmc.loader.api.FabricLoader;

public class DDMixinConfigFabric implements IMixinConfigPlugin
{
	private boolean waterloggableDoors = true;
	private boolean waterloggableFenceGates = true;

	@Override
	public void onLoad(String mixinPackage) {
		DDConfigFabric.initializeConfigs();
		waterloggableDoors = DDConfigFabric.CONFIG.getOrDefault("dramaticdoors.waterloggable_doors", true);
		waterloggableFenceGates = DDConfigFabric.CONFIG.getOrDefault("dramaticdoors.waterloggable_fence_gates", true);
	}

	@Override
	public String getRefMapperConfig() {
		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		if (mixinClassName.equals("com.fizzware.dramaticdoors.fabric.mixin.DoorBlockMixin")) {
			return waterloggableDoors && !FabricLoader.getInstance().isModLoaded("fluidlogged");
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.fabric.mixin.JapaneseDoorBlockMixinFabric")) {
			return waterloggableDoors && FabricLoader.getInstance().isModLoaded("mcwdoors") && (!FabricLoader.getInstance().isModLoaded("forge"));
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.fabric.mixin.forge.JapaneseDoorBlockMixinForge")) {
			return waterloggableDoors && FabricLoader.getInstance().isModLoaded("mcwdoors") && FabricLoader.getInstance().isModLoaded("forge");
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.fabric.mixin.FenceGateBlockMixin")) {
			return waterloggableFenceGates && !FabricLoader.getInstance().isModLoaded("fluidlogged");
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
	}

	@Override
	public List<String> getMixins() {
		return null;
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
	}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
	}

}
