package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AetherReduxCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLIGHTWILLOW, DDNames.SHORT_BLIGHTWILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "blightwillow_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CLOUDCAP, DDNames.SHORT_CLOUDCAP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "cloudcap_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRYSTAL, DDNames.SHORT_CRYSTAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "crystal_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FIELDSPROUT, DDNames.SHORT_FIELDSPROUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "fieldsprout_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIA, DDNames.SHORT_GLACIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "glacia_door")), BlockSetType.CRIMSON, true);
		//DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PRISMATIC, DDNames.SHORT_PRISMATIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "prismatic_door")), BlockSetType.OAK, true); // Legacy content.
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRINGSHROOM, DDNames.SHORT_SPRINGSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "springshroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsprout_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		//DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsprout_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		//DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsprout_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), true);
		//DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsprout_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), "tall_wooden_door");
		//DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"), "tall_wooden_door");
	}
}
