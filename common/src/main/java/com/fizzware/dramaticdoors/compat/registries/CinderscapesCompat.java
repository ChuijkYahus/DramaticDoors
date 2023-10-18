package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CinderscapesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCORCHED, DDNames.SHORT_SCORCHED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("cinderscapes", "scorched_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_UMBRAL, DDNames.SHORT_UMBRAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("cinderscapes", "umbral_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"), "tall_wooden_door");
	}
}
