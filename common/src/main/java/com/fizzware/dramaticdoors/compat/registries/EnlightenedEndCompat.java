package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnlightenedEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CONGEALED, DDNames.SHORT_CONGEALED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enlightened_end", "ebony_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EE_EBONY, DDNames.SHORT_EE_EBONY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enlightened_end", "congealed_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"), "tall_wooden_door");
	}
}
