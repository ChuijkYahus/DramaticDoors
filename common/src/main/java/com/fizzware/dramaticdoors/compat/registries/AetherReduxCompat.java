package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class AetherReduxCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLIGHTWILLOW, DDNames.SHORT_BLIGHTWILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "blightwillow_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CLOUDCAP, DDNames.SHORT_CLOUDCAP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "cloudcap_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRYSTAL, DDNames.SHORT_CRYSTAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "crystal_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIA, DDNames.SHORT_GLACIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "glacia_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PRISMATIC, DDNames.SHORT_PRISMATIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "prismatic_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRINGSHROOM, DDNames.SHORT_SPRINGSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "springshroom_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"), "tall_wooden_door");
	}
}
