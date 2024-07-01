package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class VineryCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VINERY_CHERRY, DDNames.SHORT_VINERY_CHERRY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("vinery", "cherry_door")), BlockSetType.CHERRY, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VINERY_CHERRY, ResourceLocation.fromNamespaceAndPath("vinery", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VINERY_CHERRY, ResourceLocation.fromNamespaceAndPath("vinery", "cherry_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VINERY_CHERRY, ResourceLocation.fromNamespaceAndPath("vinery", "cherry_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VINERY_CHERRY, ResourceLocation.fromNamespaceAndPath("vinery", "cherry_door"), "tall_wooden_door");
	}
}
