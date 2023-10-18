package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AtumCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DEADWOOD, DDNames.SHORT_DEADWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "deadwood_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PALM, DDNames.SHORT_PALM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "palm_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE, DDNames.SHORT_LIMESTONE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE_CRACKED, DDNames.SHORT_LIMESTONE_CRACKED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_cracked_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE_BRICK_SMALL, DDNames.SHORT_LIMESTONE_BRICK_SMALL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_brick_small_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE_BRICK_LARGE, DDNames.SHORT_LIMESTONE_BRICK_LARGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_brick_large_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE_BRICK_CRACKED_BRICK, DDNames.SHORT_LIMESTONE_BRICK_CRACKED_BRICK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_brick_cracked_brick_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE_BRICK_CHISELED, DDNames.SHORT_LIMESTONE_BRICK_CHISELED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_brick_chiseled_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIMESTONE_BRICK_CARVED, DDNames.SHORT_LIMESTONE_BRICK_CARVED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atum", "limestone_brick_carved_door")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DEADWOOD, new ResourceLocation("atum", "deadwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PALM, new ResourceLocation("atum", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE, new ResourceLocation("atum", "limestone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE_CRACKED, new ResourceLocation("atum", "limestone_cracked_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE_BRICK_SMALL, new ResourceLocation("atum", "limestone_brick_small_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE_BRICK_LARGE, new ResourceLocation("atum", "limestone_brick_large_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE_BRICK_CRACKED_BRICK, new ResourceLocation("atum", "limestone_brick_cracked_brick_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE_BRICK_CHISELED, new ResourceLocation("atum", "limestone_brick_chiseled_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIMESTONE_BRICK_CARVED, new ResourceLocation("atum", "limestone_brick_carved_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DEADWOOD, new ResourceLocation("atum", "deadwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PALM, new ResourceLocation("atum", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE, new ResourceLocation("atum", "limestone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE_CRACKED, new ResourceLocation("atum", "limestone_cracked_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE_BRICK_SMALL, new ResourceLocation("atum", "limestone_brick_small_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE_BRICK_LARGE, new ResourceLocation("atum", "limestone_brick_large_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE_BRICK_CRACKED_BRICK, new ResourceLocation("atum", "limestone_brick_cracked_brick_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE_BRICK_CHISELED, new ResourceLocation("atum", "limestone_brick_chiseled_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIMESTONE_BRICK_CARVED, new ResourceLocation("atum", "limestone_brick_carved_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DEADWOOD, new ResourceLocation("atum", "deadwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PALM, new ResourceLocation("atum", "palm_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE, new ResourceLocation("atum", "limestone_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE_CRACKED, new ResourceLocation("atum", "limestone_cracked_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE_BRICK_SMALL, new ResourceLocation("atum", "limestone_brick_small_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE_BRICK_LARGE, new ResourceLocation("atum", "limestone_brick_large_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE_BRICK_CRACKED_BRICK, new ResourceLocation("atum", "limestone_brick_cracked_brick_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE_BRICK_CHISELED, new ResourceLocation("atum", "limestone_brick_chiseled_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIMESTONE_BRICK_CARVED, new ResourceLocation("atum", "limestone_brick_carved_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DEADWOOD, new ResourceLocation("atum", "deadwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PALM, new ResourceLocation("atum", "palm_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE, new ResourceLocation("atum", "limestone_door"), "tall_limestone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE_CRACKED, new ResourceLocation("atum", "limestone_cracked_door"), "tall_limestone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE_BRICK_SMALL, new ResourceLocation("atum", "limestone_brick_small_door"), "tall_limestone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE_BRICK_LARGE, new ResourceLocation("atum", "limestone_brick_large_door"), "tall_limestone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE_BRICK_CRACKED_BRICK, new ResourceLocation("atum", "limestone_brick_cracked_brick_door"), "tall_limestone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE_BRICK_CHISELED, new ResourceLocation("atum", "limestone_brick_chiseled_door"), "tall_limestone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIMESTONE_BRICK_CARVED, new ResourceLocation("atum", "limestone_brick_carved_door"), "tall_limestone_door");
	}
}
