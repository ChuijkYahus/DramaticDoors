package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SilentGearCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NETHERWOOD, DDNames.SHORT_NETHERWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("silentgear", "netherwood_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NETHERWOOD, new ResourceLocation("silentgear", "netherwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NETHERWOOD, new ResourceLocation("silentgear", "netherwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), "tall_wooden_door");
	}
}
