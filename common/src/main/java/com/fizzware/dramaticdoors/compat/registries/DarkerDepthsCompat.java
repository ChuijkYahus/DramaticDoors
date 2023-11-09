package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class DarkerDepthsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PETRIFIED, DDNames.SHORT_PETRIFIED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("darkerdepths", "petrified_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"), "tall_wooden_door");
	}
}
