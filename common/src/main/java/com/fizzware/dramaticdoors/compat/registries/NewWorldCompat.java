package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class NewWorldCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FIR, DDNames.SHORT_FIR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("newworld", "fir_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FIR, new ResourceLocation("newworld", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FIR, new ResourceLocation("newworld", "fir_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FIR, new ResourceLocation("newworld", "fir_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FIR, new ResourceLocation("newworld", "fir_door"), "tall_wooden_door");
	}
}
