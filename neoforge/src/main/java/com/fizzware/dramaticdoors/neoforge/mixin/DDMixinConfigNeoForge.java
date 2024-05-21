package com.fizzware.dramaticdoors.neoforge.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.neoforge.config.DDConfigNF;

import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.fml.loading.LoadingModList;

public class DDMixinConfigNeoForge implements IMixinConfigPlugin
{

	@Override
	public void onLoad(String mixinPackage) {
		DDConfigNF.loadConfig(DDConfigNF.CONFIG, FMLPaths.CONFIGDIR.get().resolve("dramaticdoors-common.toml"));
	}

	@Override
	public String getRefMapperConfig() {
		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		if (mixinClassName.equals("com.fizzware.dramaticdoors.neoforge.common.mixin.DoorBlockMixin")) {
			return DDConfigNF.waterloggableDoors.get();
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.neoforge.forge.mixin.JapaneseDoorBlockMixinForge")) {
			return DDConfigNF.waterloggableDoors.get() && LoadingModList.get().getModFileById("mcwdoors") != null;
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.neoforge.common.mixin.FenceGateBlockMixin")) {
			return DDConfigNF.waterloggableFenceGates.get();
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
