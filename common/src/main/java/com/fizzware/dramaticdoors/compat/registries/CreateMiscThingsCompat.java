package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CreateMiscThingsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANDESITE_CASING, DDNames.SHORT_ANDESITE_CASING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create_things_and_misc", "andesite_casing_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRASS_CASING, DDNames.SHORT_BRASS_CASING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create_things_and_misc", "brass_casing_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_COPPER_CASING, DDNames.SHORT_COPPER_CASING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create_things_and_misc", "copper_casing_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"), "tall_misc_door");
	}
}
