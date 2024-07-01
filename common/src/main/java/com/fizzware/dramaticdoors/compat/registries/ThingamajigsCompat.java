package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

// Not yet implemented.
public class ThingamajigsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKABLE, DDNames.SHORT_LOCKABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_WOOD, DDNames.SHORT_RUBBER_WOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"));
	
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"), "tall_wooden_door");
	}
}
