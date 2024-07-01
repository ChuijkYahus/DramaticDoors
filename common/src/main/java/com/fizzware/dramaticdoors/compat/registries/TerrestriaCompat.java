package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TerrestriaCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_CYPRESS, DDNames.SHORT_TERRESTRIA_CYPRESS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_HEMLOCK, DDNames.SHORT_TERRESTRIA_HEMLOCK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "hemlock_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "japanese_maple_door")), BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "rainbow_eucalyptus_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_REDWOOD, DDNames.SHORT_TERRESTRIA_REDWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "redwood_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_RUBBER, DDNames.SHORT_TERRESTRIA_RUBBER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "rubber_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_SAKURA, DDNames.SHORT_TERRESTRIA_SAKURA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "sakura_door")), BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_WILLOW, DDNames.SHORT_TERRESTRIA_WILLOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "willow_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_YUCCA_PALM, DDNames.SHORT_TERRESTRIA_YUCCA_PALM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terrestria", "yucca_palm_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_CYPRESS, ResourceLocation.fromNamespaceAndPath("terrestria", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_HEMLOCK, ResourceLocation.fromNamespaceAndPath("terrestria", "hemlock_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, ResourceLocation.fromNamespaceAndPath("terrestria", "japanese_maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, ResourceLocation.fromNamespaceAndPath("terrestria", "rainbow_eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_REDWOOD, ResourceLocation.fromNamespaceAndPath("terrestria", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_RUBBER, ResourceLocation.fromNamespaceAndPath("terrestria", "rubber_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_SAKURA, ResourceLocation.fromNamespaceAndPath("terrestria", "sakura_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_WILLOW, ResourceLocation.fromNamespaceAndPath("terrestria", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERRESTRIA_YUCCA_PALM, ResourceLocation.fromNamespaceAndPath("terrestria", "yucca_palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_CYPRESS, ResourceLocation.fromNamespaceAndPath("terrestria", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_HEMLOCK, ResourceLocation.fromNamespaceAndPath("terrestria", "hemlock_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, ResourceLocation.fromNamespaceAndPath("terrestria", "japanese_maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, ResourceLocation.fromNamespaceAndPath("terrestria", "rainbow_eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_REDWOOD, ResourceLocation.fromNamespaceAndPath("terrestria", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_RUBBER, ResourceLocation.fromNamespaceAndPath("terrestria", "rubber_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_SAKURA, ResourceLocation.fromNamespaceAndPath("terrestria", "sakura_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_WILLOW, ResourceLocation.fromNamespaceAndPath("terrestria", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERRESTRIA_YUCCA_PALM, ResourceLocation.fromNamespaceAndPath("terrestria", "yucca_palm_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_CYPRESS, ResourceLocation.fromNamespaceAndPath("terrestria", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_HEMLOCK, ResourceLocation.fromNamespaceAndPath("terrestria", "hemlock_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, ResourceLocation.fromNamespaceAndPath("terrestria", "japanese_maple_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, ResourceLocation.fromNamespaceAndPath("terrestria", "rainbow_eucalyptus_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_REDWOOD, ResourceLocation.fromNamespaceAndPath("terrestria", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_RUBBER, ResourceLocation.fromNamespaceAndPath("terrestria", "rubber_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_SAKURA, ResourceLocation.fromNamespaceAndPath("terrestria", "sakura_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_WILLOW, ResourceLocation.fromNamespaceAndPath("terrestria", "willow_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERRESTRIA_YUCCA_PALM, ResourceLocation.fromNamespaceAndPath("terrestria", "yucca_palm_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_CYPRESS, ResourceLocation.fromNamespaceAndPath("terrestria", "cypress_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_HEMLOCK, ResourceLocation.fromNamespaceAndPath("terrestria", "hemlock_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, ResourceLocation.fromNamespaceAndPath("terrestria", "japanese_maple_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, ResourceLocation.fromNamespaceAndPath("terrestria", "rainbow_eucalyptus_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_REDWOOD, ResourceLocation.fromNamespaceAndPath("terrestria", "redwood_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_RUBBER, ResourceLocation.fromNamespaceAndPath("terrestria", "rubber_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_SAKURA, ResourceLocation.fromNamespaceAndPath("terrestria", "sakura_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_WILLOW, ResourceLocation.fromNamespaceAndPath("terrestria", "willow_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERRESTRIA_YUCCA_PALM, ResourceLocation.fromNamespaceAndPath("terrestria", "yucca_palm_door"), "tall_terrestria_wooden_door");
	}
}
