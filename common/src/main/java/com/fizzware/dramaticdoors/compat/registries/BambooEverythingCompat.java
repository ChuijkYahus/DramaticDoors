package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BambooEverythingCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BE_BAMBOO, DDNames.SHORT_BE_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BE_DRY_BAMBOO, DDNames.SHORT_BE_DRY_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BE_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BE_DRY_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "dry_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BE_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BE_DRY_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "dry_bamboo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BE_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BE_DRY_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "dry_bamboo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BE_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "bamboo_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BE_DRY_BAMBOO, ResourceLocation.fromNamespaceAndPath("bambooeverything", "dry_bamboo_door"), "tall_wooden_door");
	}
}
