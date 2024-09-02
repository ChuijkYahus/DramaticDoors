package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class BewitchmentCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BW_CYPRESS, DDNames.SHORT_BW_CYPRESS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "cypress_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRAGONS_BLOOD, DDNames.SHORT_DRAGONS_BLOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "dragons_blood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ELDER, DDNames.SHORT_ELDER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "elder_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNIPER, DDNames.SHORT_JUNIPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "juniper_door")), true, DDRegistry.MAIN_TAB);
		
		if (Compats.isModLoaded("bwplus", checker)) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YEW, DDNames.SHORT_YEW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bwplus", "yew_door")), true, DDRegistry.MAIN_TAB);
		}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), "tall_wooden_door");
		
		if (Compats.isModLoaded("bwplus", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"), "tall_wooden_door");
		}
	}
}
