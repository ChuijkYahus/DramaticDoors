package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class AbnormalsCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	

	
	private static void registerBlocksItems(CompatChecker checker) {
		// Atmospheric
		if (checker.isModLoaded("atmospheric")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ASPEN, DDNames.SHORT_ASPEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "aspen_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRIMWOOD, DDNames.SHORT_GRIMWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "grimwood_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_KOUSA, DDNames.SHORT_KOUSA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "kousa_door")), true, DDRegistry.MAIN_TAB);
			//DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LAUREL, DDNames.SHORT_LAUREL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "laurel_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORADO, DDNames.SHORT_MORADO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "morado_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROSEWOOD, DDNames.SHORT_ROSEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "rosewood_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YUCCA, DDNames.SHORT_YUCCA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "yucca_door")), true, DDRegistry.MAIN_TAB);
		}
		// Autumnity
		if (checker.isModLoaded("autumnity")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MAPLE, DDNames.SHORT_MAPLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("autumnity", "maple_door")), true, DDRegistry.MAIN_TAB);
		}
		// Buzzier Bees
		if (checker.isModLoaded("buzzier_bees")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HONEYCOMB, DDNames.SHORT_HONEYCOMB, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("buzzier_bees", "honeycomb_door")), true, DDRegistry.MAIN_TAB);
		}
		// Caverns & Chasms
		if (checker.isModLoaded("caverns_and_chasms")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AZALEA, DDNames.SHORT_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("caverns_and_chasms", "azalea_door")), true, DDRegistry.MAIN_TAB);
		}
		// Endergetic Expansion
		if (checker.isModLoaded("endergetic")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POISE, DDNames.SHORT_POISE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("endergetic", "poise_door")), true, DDRegistry.MAIN_TAB);
		}
		// Environmental
		if (checker.isModLoaded("environmental")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_CHERRY, DDNames.SHORT_DARK_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "cherry_door")), true, DDRegistry.MAIN_TAB);
			//DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PINE, DDNames.SHORT_PINE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "fir_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WILLOW, DDNames.SHORT_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "willow_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WISTERIA, DDNames.SHORT_WISTERIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "wisteria_door")), true, DDRegistry.MAIN_TAB);
		}
		// Upgrade Aquatic
		if (checker.isModLoaded("upgrade_aquatic")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRIFTWOOD, DDNames.SHORT_DRIFTWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "driftwood_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RIVER, DDNames.SHORT_RIVER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "river_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLASS, DDNames.SHORT_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "glass_door")), true, DDRegistry.MAIN_TAB);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TOOTH, DDNames.SHORT_TOOTH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "tooth_door")), true, DDRegistry.MAIN_TAB);
		}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		if (checker.isModLoaded("atmospheric")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ASPEN, new ResourceLocation("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_KOUSA, new ResourceLocation("atmospheric", "kousa_door"));
			//DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LAUREL, new ResourceLocation("atmospheric", "laurel_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MORADO, new ResourceLocation("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_YUCCA, new ResourceLocation("atmospheric", "yucca_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ASPEN, new ResourceLocation("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_KOUSA, new ResourceLocation("atmospheric", "kousa_door"));
			//DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LAUREL, new ResourceLocation("atmospheric", "laurel_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MORADO, new ResourceLocation("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_YUCCA, new ResourceLocation("atmospheric", "yucca_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ASPEN, new ResourceLocation("atmospheric", "aspen_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_KOUSA, new ResourceLocation("atmospheric", "kousa_door"), true);
			//DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LAUREL, new ResourceLocation("atmospheric", "laurel_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MORADO, new ResourceLocation("atmospheric", "morado_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_YUCCA, new ResourceLocation("atmospheric", "yucca_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ASPEN, new ResourceLocation("atmospheric", "aspen_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_KOUSA, new ResourceLocation("atmospheric", "kousa_door"), "tall_wooden_door");
			//DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LAUREL, new ResourceLocation("atmospheric", "laurel_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MORADO, new ResourceLocation("atmospheric", "morado_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_YUCCA, new ResourceLocation("atmospheric", "yucca_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("autumnity")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MAPLE, new ResourceLocation("autumnity", "maple_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MAPLE, new ResourceLocation("autumnity", "maple_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MAPLE, new ResourceLocation("autumnity", "maple_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MAPLE, new ResourceLocation("autumnity", "maple_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("buzzier_bees")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"), "tall_misc_door");
		}
		if (checker.isModLoaded("caverns_and_chasms")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"), "tall_wooden_door");
	
		}
		if (checker.isModLoaded("endergetic")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_POISE, new ResourceLocation("endergetic", "poise_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_POISE, new ResourceLocation("endergetic", "poise_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_POISE, new ResourceLocation("endergetic", "poise_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_POISE, new ResourceLocation("endergetic", "poise_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("environmental")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"));
			//DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PINE, new ResourceLocation("environmental", "pine_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WILLOW, new ResourceLocation("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WISTERIA, new ResourceLocation("environmental", "wisteria_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"));
			//DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PINE, new ResourceLocation("environmental", "pine_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WILLOW, new ResourceLocation("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WISTERIA, new ResourceLocation("environmental", "wisteria_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"), true);
			//DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PINE, new ResourceLocation("environmental", "pine_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WILLOW, new ResourceLocation("environmental", "willow_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WISTERIA, new ResourceLocation("environmental", "wisteria_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"), "tall_wooden_door");
			//DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PINE, new ResourceLocation("environmental", "pine_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WILLOW, new ResourceLocation("environmental", "willow_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WISTERIA, new ResourceLocation("environmental", "wisteria_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("upgrade_aquatic")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"), "tall_misc_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"), "tall_misc_door");
		}
	}
}
