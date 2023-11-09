package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class SnowySpiritCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GINGERBREAD, DDNames.SHORT_GINGERBREAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("snowyspirit", "gingerbread_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"), "tall_wooden_door");
	}
}
