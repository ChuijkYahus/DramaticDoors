package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EndlessBiomesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EB_PENUMBRA, DDNames.SHORT_EB_PENUMBRA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("endlessbiomes", "penumbra_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EB_TWISTED, DDNames.SHORT_EB_TWISTED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("endlessbiomes", "twisted_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHESTNUT, new ResourceLocation("windswept", "penumbra_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"), "tall_wooden_door");
	}
}
