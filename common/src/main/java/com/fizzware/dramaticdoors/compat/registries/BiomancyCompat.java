package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFullFleshDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class BiomancyCompat
{
    public static final Block SHORT_FLESH_DOOR = new ShortFleshDoorBlock(BlockSetType.STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomancy", "flesh_door")));
    public static final Block SHORT_FULL_FLESH_DOOR = new ShortFullFleshDoorBlock(BlockSetType.STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomancy", "full_flesh_door")));
    public static final Block SHORT_FLESHKIN_DOOR = new ShortDoorBlock(BlockSetType.STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomancy", "fleshkin_door")));

    public static final Block TALL_FLESH_DOOR = new TallFleshDoorBlock(BlockSetType.STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomancy", "flesh_door")));
    public static final Block TALL_FULL_FLESH_DOOR = new TallFullFleshDoorBlock(BlockSetType.STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomancy", "full_flesh_door")));
    public static final Block TALL_FLESHKIN_DOOR = new TallDoorBlock(BlockSetType.STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomancy", "fleshkin_door")));

	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FLESH, SHORT_FLESH_DOOR));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FULL_FLESH, SHORT_FULL_FLESH_DOOR));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FLESHKIN, SHORT_FLESHKIN_DOOR));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FLESH, TALL_FLESH_DOOR));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FULL_FLESH, TALL_FULL_FLESH_DOOR));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FLESHKIN, TALL_FLESHKIN_DOOR));

    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FLESH, new ShortDoorItem(SHORT_FLESH_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FULL_FLESH, new ShortDoorItem(SHORT_FULL_FLESH_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FLESHKIN, new ShortDoorItem(SHORT_FLESHKIN_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FLESH, new TallDoorItem(TALL_FLESH_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FULL_FLESH, new TallDoorItem(TALL_FULL_FLESH_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FLESHKIN, new TallDoorItem(TALL_FLESHKIN_DOOR, DDRegistry.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "flesh_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FULL_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "full_flesh_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FLESHKIN, ResourceLocation.fromNamespaceAndPath("biomancy", "fleshkin_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "flesh_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FULL_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "full_flesh_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FLESHKIN, ResourceLocation.fromNamespaceAndPath("biomancy", "fleshkin_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "flesh_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FULL_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "full_flesh_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FLESHKIN, ResourceLocation.fromNamespaceAndPath("biomancy", "fleshkin_door"));
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "flesh_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FULL_FLESH, ResourceLocation.fromNamespaceAndPath("biomancy", "full_flesh_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FLESHKIN, ResourceLocation.fromNamespaceAndPath("biomancy", "fleshkin_door"), "tall_misc_door");
	}
}
