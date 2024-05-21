package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.TallDoorItem;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class FramedBlocksCompat
{
	public static boolean initialized = false;
	
	public static TallDoorBlock TALL_FRAMED_DOOR;
	public static TallDoorBlock TALL_FRAMED_IRON_DOOR;
	
	public static void registerCompat() {
		if (initialized) {
			return;
		}
		initialized = true;
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FRAMED, FramedBlocksCompat.TALL_FRAMED_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FRAMED_IRON, FramedBlocksCompat.TALL_FRAMED_IRON_DOOR));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FRAMED, new TallDoorItem(FramedBlocksCompat.TALL_FRAMED_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FRAMED_IRON, new TallDoorItem(FramedBlocksCompat.TALL_FRAMED_IRON_DOOR, DDRegistry.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FRAMED, new ResourceLocation("framedblocks", "framed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FRAMED_IRON, new ResourceLocation("framedblocks", "framed_iron_door"));

		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FRAMED, new ResourceLocation("framedblocks", "framed_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FRAMED_IRON, new ResourceLocation("framedblocks", "framed_iron_door"), "tall_misc_door");
	}
}
