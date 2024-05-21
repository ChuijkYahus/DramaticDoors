package com.fizzware.dramaticdoors;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringCopperDoorBlock;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class DDRegistry
{
	public static final List<Pair<String, Block>> DOOR_BLOCKS_TO_REGISTER = new ArrayList<Pair<String, Block>>();
	public static final List<Pair<String, Item>> DOOR_ITEMS_TO_REGISTER = new ArrayList<Pair<String, Item>>();
	
	public static final Item.Properties PROPERTIES = new Item.Properties();
	
	public static final ResourceKey<CreativeModeTab> MAIN_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "main_tab"));
	public static final ResourceKey<CreativeModeTab> CHIPPED_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "chipped_tab"));
	public static final ResourceKey<CreativeModeTab> MACAW_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "macaw_tab"));
	public static final ResourceKey<CreativeModeTab> MANYIDEAS_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "manyideas_tab"));
	
	public static void registerVanilla() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_OAK, DDNames.SHORT_OAK, Blocks.OAK_DOOR, BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRUCE, DDNames.SHORT_SPRUCE, Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BIRCH, DDNames.SHORT_BIRCH, Blocks.BIRCH_DOOR, BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNGLE, DDNames.SHORT_JUNGLE, Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ACACIA, DDNames.SHORT_ACACIA, Blocks.ACACIA_DOOR, BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_OAK, DDNames.SHORT_DARK_OAK, Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGROVE, DDNames.SHORT_MANGROVE, Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHERRY, DDNames.SHORT_CHERRY, Blocks.CHERRY_DOOR, BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BAMBOO, DDNames.SHORT_BAMBOO, Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRIMSON, DDNames.SHORT_CRIMSON, Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WARPED, DDNames.SHORT_WARPED, Blocks.WARPED_DOOR, BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON, DDNames.SHORT_IRON, Blocks.IRON_DOOR, BlockSetType.IRON, true);
		DDRegistry.registerCopperDoorBlockAndItem(DDNames.TALL_COPPER, DDNames.SHORT_COPPER, Blocks.COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true, WeatherState.UNAFFECTED);
		DDRegistry.registerCopperDoorBlockAndItem(DDNames.TALL_EXPOSED_COPPER, DDNames.SHORT_EXPOSED_COPPER, Blocks.EXPOSED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true, WeatherState.EXPOSED);
		DDRegistry.registerCopperDoorBlockAndItem(DDNames.TALL_WEATHERED_COPPER, DDNames.SHORT_WEATHERED_COPPER, Blocks.WEATHERED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true, WeatherState.WEATHERED);
		DDRegistry.registerCopperDoorBlockAndItem(DDNames.TALL_OXIDIZED_COPPER, DDNames.SHORT_OXIDIZED_COPPER, Blocks.OXIDIZED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true, WeatherState.OXIDIZED);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_COPPER, DDNames.SHORT_WAXED_COPPER, Blocks.WAXED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_EXPOSED_COPPER, DDNames.SHORT_WAXED_EXPOSED_COPPER, Blocks.WAXED_EXPOSED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_WEATHERED_COPPER, DDNames.SHORT_WAXED_WEATHERED_COPPER, Blocks.WAXED_WEATHERED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_OXIDIZED_COPPER, DDNames.SHORT_WAXED_OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_COPPER_DOOR.properties().requiredFeatures(FeatureFlags.UPDATE_1_21), BlockSetType.COPPER, true);
	}
	
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createDoorBlock(block, blocksettype, true);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Properties properties, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createDoorBlock(properties, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createDoorBlock(properties, blocksettype, true);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerCopperDoorBlockAndItem(String tallname, @Nullable String shortname, Properties properties, BlockSetType blocksettype, boolean includeShort, WeatheringCopper.WeatherState state) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createCopperDoorBlock(properties, blocksettype, false, state);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createCopperDoorBlock(properties, blocksettype, true, state);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerSlidingDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createSlidingDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createSlidingDoorBlock(block, blocksettype, true);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerStableDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock = createStableDoorBlock(block, blocksettype, true);
		Item tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createStableDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	protected static Block createCopperDoorBlock(Properties properties, BlockSetType blocksettype, boolean isTall, WeatheringCopper.WeatherState state) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallWeatheringCopperDoorBlock(blocksettype, state, properties);
		}
		else {
			tempBlock = new ShortWeatheringCopperDoorBlock(blocksettype, state, properties);
		}
		return tempBlock;
	}
	
	protected static Block createSlidingDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallSlidingDoorBlock(blocksettype, block);
		}
		else {
			throw new IllegalArgumentException("Short version of Macaw sliding doors are currently not supported.");
			//tempBlock = new ShortSlidingDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Block createStableDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallStableDoorBlock(blocksettype, block);
		}
		else {
			throw new IllegalArgumentException("Short version of Macaw stable doors are currently not supported.");
			//tempBlock = new ShortSlidingDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Block createDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallDoorBlock(blocksettype, block);
		}
		else {
			tempBlock = new ShortDoorBlock(blocksettype, block);
		}
		return tempBlock;
	}
	
	protected static Block createDoorBlock(Properties properties, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallDoorBlock(blocksettype, properties);
		}
		else {
			tempBlock = new ShortDoorBlock(blocksettype, properties);
		}
		return tempBlock;
	}
	
	protected static Item createDoorItem(Block block, boolean isTall) {
		Item tempItem;
		if (isTall) {
			tempItem = new TallDoorItem(block, PROPERTIES);
		}
		else {
			tempItem = new ShortDoorItem(block, PROPERTIES);
		}
		return tempItem;
	}
	
	/* Utility functions for getting blocks by key. */
	public static Block getBlockByKey(ResourceLocation loc) {
    	return getBlockByKey(loc, Blocks.OAK_DOOR);
    }
	
	public static Block getBlockByKey(ResourceLocation loc, Block fallback) {
    	if (BuiltInRegistries.BLOCK.containsKey(loc)) {
    		return BuiltInRegistries.BLOCK.get(loc);
    	}
    	else {
    		return fallback; // Fallback
    	}
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource, Block fallback) {
    	return BuiltInRegistries.BLOCK.getOptional(resource).orElse(fallback);
    }
}
