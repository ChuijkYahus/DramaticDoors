package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class CreateDecoCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANDESITE, DDNames.SHORT_ANDESITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "andesite_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRASS, DDNames.SHORT_BRASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "brass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_COPPER, DDNames.SHORT_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "copper_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ZINC, DDNames.SHORT_ZINC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "zinc_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_ANDESITE, DDNames.SHORT_LOCKED_ANDESITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_andesite_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_BRASS, DDNames.SHORT_LOCKED_BRASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_brass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_COPPER, DDNames.SHORT_LOCKED_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_copper_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_ZINC, DDNames.SHORT_LOCKED_ZINC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_zinc_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BRASS, new ResourceLocation("createdeco", "brass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_COPPER, new ResourceLocation("createdeco", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ZINC, new ResourceLocation("createdeco", "zinc_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BRASS, new ResourceLocation("createdeco", "brass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_COPPER, new ResourceLocation("createdeco", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ZINC, new ResourceLocation("createdeco", "zinc_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BRASS, new ResourceLocation("createdeco", "brass_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_COPPER, new ResourceLocation("createdeco", "copper_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ZINC, new ResourceLocation("createdeco", "zinc_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ANDESITE, new ResourceLocation("createdeco", "andesite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BRASS, new ResourceLocation("createdeco", "brass_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_COPPER, new ResourceLocation("createdeco", "copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ZINC, new ResourceLocation("createdeco", "zinc_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"), "tall_metal_door");
	}
}
