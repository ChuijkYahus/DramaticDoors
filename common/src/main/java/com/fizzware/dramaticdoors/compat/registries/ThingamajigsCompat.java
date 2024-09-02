package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

// Not yet implemented.
public class ThingamajigsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKABLE, DDNames.SHORT_LOCKABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "lockable_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_WOOD, DDNames.SHORT_RUBBER_WOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thingamajigs", "rubber_wood_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"));
	
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKABLE, new ResourceLocation("thingamajigs", "lockable_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_WOOD, new ResourceLocation("thingamajigs", "rubber_wood_door"), "tall_wooden_door");
	}
}
