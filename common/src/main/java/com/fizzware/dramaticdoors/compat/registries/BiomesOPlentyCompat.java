package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class BiomesOPlentyCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_CHERRY, DDNames.SHORT_BOP_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "cherry_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_DEAD, DDNames.SHORT_BOP_DEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "dead_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_FIR, DDNames.SHORT_BOP_FIR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_HELLBARK, DDNames.SHORT_BOP_HELLBARK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "hellbark_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_JACARANDA, DDNames.SHORT_BOP_JACARANDA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "jacaranda_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAGIC, DDNames.SHORT_BOP_MAGIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "magic_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAHOGANY, DDNames.SHORT_BOP_MAHOGANY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "mahogany_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_PALM, DDNames.SHORT_BOP_PALM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "palm_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_REDWOOD, DDNames.SHORT_BOP_REDWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "redwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_UMBRAN, DDNames.SHORT_BOP_UMBRAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "umbran_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_WILLOW, DDNames.SHORT_BOP_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "willow_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_CHERRY, new ResourceLocation("biomesoplenty", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_CHERRY, new ResourceLocation("biomesoplenty", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_CHERRY, new ResourceLocation("biomesoplenty", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_CHERRY, new ResourceLocation("biomesoplenty", "cherry_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"), "tall_bop_wooden_door");
	}
}
