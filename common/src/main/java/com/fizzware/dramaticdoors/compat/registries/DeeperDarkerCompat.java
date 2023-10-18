package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DeeperDarkerCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECHO, DDNames.SHORT_ECHO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "echo_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"), "tall_wooden_door");
	}
}
