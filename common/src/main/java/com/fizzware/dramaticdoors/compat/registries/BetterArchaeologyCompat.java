package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class BetterArchaeologyCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN, DDNames.SHORT_ROTTEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterarcheology", "rotten_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"), "tall_wooden_door");
	}
}
