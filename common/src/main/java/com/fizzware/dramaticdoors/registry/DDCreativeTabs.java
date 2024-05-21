package com.fizzware.dramaticdoors.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class DDCreativeTabs 
{
	public static final ResourceKey<CreativeModeTab> MAIN_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "main_tab"));
	public static final ResourceKey<CreativeModeTab> CHIPPED_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "chipped_tab"));
	public static final ResourceKey<CreativeModeTab> MACAW_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "macaw_tab"));
	public static final ResourceKey<CreativeModeTab> MANYIDEAS_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "manyideas_tab"));
}
