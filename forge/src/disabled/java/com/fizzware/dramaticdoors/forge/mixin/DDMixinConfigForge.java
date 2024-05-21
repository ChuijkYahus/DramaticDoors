package com.fizzware.dramaticdoors.forge.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.forge.config.DDConfigForge;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.loading.LoadingModList;

public class DDMixinConfigForge implements IMixinConfigPlugin
{

	@Override
	public void onLoad(String mixinPackage) {
		DDConfigForge.loadConfig(DDConfigForge.CONFIG, FMLPaths.CONFIGDIR.get().resolve("dramaticdoors-common.toml"));
	}

	@Override
	public String getRefMapperConfig() {
		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		if (mixinClassName.equals("com.fizzware.dramaticdoors.forge.mixin.DoorBlockMixin")) {
			return DDConfigForge.waterloggableDoors.get();
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.forge.mixin.JapaneseDoorBlockMixinForge")) {
			return DDConfigForge.waterloggableDoors.get() && LoadingModList.get().getModFileById("mcwdoors") != null;
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.forge.mixin.FenceGateBlockMixin")) {
			return DDConfigForge.waterloggableFenceGates.get();
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

	@Override
	public List<String> getMixins() {
		return null; 
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

}
