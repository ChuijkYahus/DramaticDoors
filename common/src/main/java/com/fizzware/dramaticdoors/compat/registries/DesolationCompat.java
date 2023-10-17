package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class DesolationCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHARRED, DDNames.SHORT_CHARRED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("desolation", "charred_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHARRED, new ResourceLocation("desolation", "charred_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHARRED, new ResourceLocation("desolation", "charred_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHARRED, new ResourceLocation("desolation", "charred_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHARRED, new ResourceLocation("desolation", "charred_door"), "tall_wooden_door");
	}
}
