package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AbundantAtmosphereCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ASH, DDNames.SHORT_ASH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("abundant_atmosphere", "ash_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GOURDROT, DDNames.SHORT_GOURDROT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("abundant_atmosphere", "gourdrot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"), "tall_wooden_door");
	}
}
