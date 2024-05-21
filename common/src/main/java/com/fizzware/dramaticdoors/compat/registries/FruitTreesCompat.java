package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.items.TallDoorItem;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class FruitTreesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FT_CHERRY, DDNames.SHORT_FT_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "cherry_door")), BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FT_CITRUS, DDNames.SHORT_FT_CITRUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "citrus_door")), BlockSetType.OAK, true);
		Block sliding_cherry_door = new TallSlidingDoorBlock(BlockSetType.CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "cherry_sliding_door")));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FT_CHERRY_SLIDING, sliding_cherry_door));
		DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FT_CHERRY_SLIDING, new TallDoorItem(sliding_cherry_door, DDRegistry.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		// Put any recipes and advancements needing to be registered here.
	}
}
