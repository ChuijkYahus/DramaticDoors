package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

// Partially implemented
public class ThingamajigsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ALARMED, DDNames.SHORT_ALARMED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "alarmed_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BUBBLE, DDNames.SHORT_BUBBLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "bubble_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FESTIVE, DDNames.SHORT_FESTIVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "festive_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKABLE, DDNames.SHORT_LOCKABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "lockable_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_METALLIC, DDNames.SHORT_METALLIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "metallic_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCREEN, DDNames.SHORT_SCREEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "screen_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SNOWMAN, DDNames.SHORT_SNOWMAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "snowman_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STONE, DDNames.SHORT_STONE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "stone_door")), BlockSetType.STONE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_WOOD, DDNames.SHORT_RUBBER_WOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "rubber_wood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WHITE_WOOD, DDNames.SHORT_WHITE_WOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "white_wood_door")), BlockSetType.OAK, false);
	}
	
	private static void registerRecipes() {
		/*DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ALARMED, new ResourceLocation("thingamajigs", "alarmed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BUBBLE, new ResourceLocation("thingamajigs", "bubble_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FESTIVE, new ResourceLocation("thingamajigs", "festive_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_METALLIC, new ResourceLocation("thingamajigs", "metallic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCREEN, new ResourceLocation("thingamajigs", "screen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SNOWMAN, new ResourceLocation("thingamajigs", "snowman_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_STONE, new ResourceLocation("thingamajigs", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WHITE_WOOD, new ResourceLocation("thingamajigs", "white_wood_door"));*/
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ALARMED, new ResourceLocation("thingamajigs", "alarmed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BUBBLE, new ResourceLocation("thingamajigs", "bubble_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FESTIVE, new ResourceLocation("thingamajigs", "festive_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_METALLIC, new ResourceLocation("thingamajigs", "metallic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCREEN, new ResourceLocation("thingamajigs", "screen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SNOWMAN, new ResourceLocation("thingamajigs", "snowman_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_STONE, new ResourceLocation("thingamajigs", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WHITE_WOOD, new ResourceLocation("thingamajigs", "white_wood_door"));
	
		/*DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ALARMED, new ResourceLocation("thingamajigs", "alarmed_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BUBBLE, new ResourceLocation("thingamajigs", "bubble_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FESTIVE, new ResourceLocation("thingamajigs", "festive_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_METALLIC, new ResourceLocation("thingamajigs", "metallic_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCREEN, new ResourceLocation("thingamajigs", "screen_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SNOWMAN, new ResourceLocation("thingamajigs", "snowman_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_STONE, new ResourceLocation("thingamajigs", "stone_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WHITE_WOOD, new ResourceLocation("thingamajigs", "white_wood_door"), true);*/
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ALARMED, new ResourceLocation("thingamajigs", "alarmed_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BUBBLE, new ResourceLocation("thingamajigs", "bubble_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FESTIVE, new ResourceLocation("thingamajigs", "festive_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_METALLIC, new ResourceLocation("thingamajigs", "metallic_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCREEN, new ResourceLocation("thingamajigs", "screen_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SNOWMAN, new ResourceLocation("thingamajigs", "snowman_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_STONE, new ResourceLocation("thingamajigs", "stone_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WHITE_WOOD, new ResourceLocation("thingamajigs", "white_wood_door"), "tall_wooden_door");
	}
}
