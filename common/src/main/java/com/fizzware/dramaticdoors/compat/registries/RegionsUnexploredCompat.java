package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class RegionsUnexploredCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_BAOBAB, DDNames.SHORT_RUE_BAOBAB, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "baobab_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_BLACKWOOD, DDNames.SHORT_RUE_BLACKWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "blackwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_BRIMWOOD, DDNames.SHORT_RUE_BRIMWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "sculkwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_CHERRY, DDNames.SHORT_RUE_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cherry_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_CYPRESS, DDNames.SHORT_RUE_CYPRESS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cypress_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_DEAD, DDNames.SHORT_RUE_DEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "dead_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_EUCALYPTUS, DDNames.SHORT_RUE_EUCALYPTUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "eucalyptus_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_JOSHUA, DDNames.SHORT_RUE_JOSHUA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "joshua_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_LARCH, DDNames.SHORT_RUE_LARCH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "larch_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_MAPLE, DDNames.SHORT_RUE_MAPLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "maple_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_MAUVE, DDNames.SHORT_RUE_MAUVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "mauve_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_PALM, DDNames.SHORT_RUE_PALM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "palm_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_PINE, DDNames.SHORT_RUE_PINE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "pine_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_REDWOOD, DDNames.SHORT_RUE_REDWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "redwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_WILLOW, DDNames.SHORT_RUE_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "willow_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "sculkwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "sculkwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "sculkwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "sculkwood_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"), "tall_rue_wooden_door");
	}
}
