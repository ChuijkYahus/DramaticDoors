package com.fizzware.dramaticdoors.tags;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class DDItemTags
{
	public static final TagKey<Item> SHORT_DOORS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "short_doors"));
	public static final TagKey<Item> SHORT_WOODEN_DOORS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "short_wooden_doors"));

	public static final TagKey<Item> TALL_DOORS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "tall_doors"));
	public static final TagKey<Item> TALL_WOODEN_DOORS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "tall_wooden_doors"));

	public static final TagKey<Item> KEY = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("supplementaries", "key"));
}
