package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class CreateCompat
{
	public static boolean initialized = false;
	
	public static TallCreateSlidingDoorBlock TALL_ANDESITE_DOOR;
	public static TallCreateSlidingDoorBlock TALL_BRASS_DOOR;
	public static TallCreateSlidingDoorBlock TALL_COPPER_DOOR;
	public static TallCreateSlidingDoorBlock TALL_FRAMED_GLASS_DOOR;
	public static TallCreateSlidingDoorBlock TALL_TRAIN_DOOR;
	
	public static void registerCompat() {
		if (initialized) {
			return;
		}
		initialized = true;
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_ANDESITE, CreateCompat.TALL_ANDESITE_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_BRASS, CreateCompat.TALL_BRASS_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_COPPER, CreateCompat.TALL_COPPER_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_FRAMED_GLASS, CreateCompat.TALL_FRAMED_GLASS_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_TRAIN, CreateCompat.TALL_TRAIN_DOOR));

    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_ANDESITE, new TallDoorItem(CreateCompat.TALL_ANDESITE_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_BRASS, new TallDoorItem(CreateCompat.TALL_BRASS_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_COPPER, new TallDoorItem(CreateCompat.TALL_COPPER_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_FRAMED_GLASS, new TallDoorItem(CreateCompat.TALL_FRAMED_GLASS_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_TRAIN, new TallDoorItem(CreateCompat.TALL_TRAIN_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_ANDESITE, new ResourceLocation("create", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_BRASS, new ResourceLocation("create", "brass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_COPPER, new ResourceLocation("create", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_FRAMED_GLASS, new ResourceLocation("create", "framed_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_TRAIN, new ResourceLocation("create", "train_door"));
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_ANDESITE, new ResourceLocation("create", "andesite_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_BRASS, new ResourceLocation("create", "brass_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_COPPER, new ResourceLocation("create", "copper_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_FRAMED_GLASS, new ResourceLocation("create", "framed_glass_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_TRAIN, new ResourceLocation("create", "train_door"), "tall_create_door");
	}
}
