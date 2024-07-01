package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SnowySpiritCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GINGERBREAD, DDNames.SHORT_GINGERBREAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("snowyspirit", "gingerbread_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GINGERBREAD, ResourceLocation.fromNamespaceAndPath("snowyspirit", "gingerbread_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GINGERBREAD, ResourceLocation.fromNamespaceAndPath("snowyspirit", "gingerbread_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GINGERBREAD, ResourceLocation.fromNamespaceAndPath("snowyspirit", "gingerbread_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GINGERBREAD, ResourceLocation.fromNamespaceAndPath("snowyspirit", "gingerbread_door"), "tall_wooden_door");
	}
}
