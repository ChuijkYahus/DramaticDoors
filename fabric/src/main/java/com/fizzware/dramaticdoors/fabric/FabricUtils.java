package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import oshi.util.tuples.Pair;

public class FabricUtils implements CompatChecker
{
	public static final FabricUtils INSTANCE = new FabricUtils();
	
	@Override
	public boolean isModLoaded(String modid) {
		return FabricLoader.getInstance().isModLoaded(modid);
	}
	
	@Override
	public boolean isDev() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}

	public static void assignItemsToTabs() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(FabricUtils::addBuildingBlocks);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(FabricUtils::addRedstoneBlocks);
		ItemGroupEvents.modifyEntriesEvent(DDRegistry.MAIN_TAB).register(FabricUtils::addMainTabEntries);
		if (Compats.isModLoaded("chipped", INSTANCE)) {
			ItemGroupEvents.modifyEntriesEvent(DDRegistry.CHIPPED_TAB).register(FabricUtils::addChippedTabEntries);
		}
		if (Compats.isModLoaded("mcwdoors", INSTANCE)) {
			ItemGroupEvents.modifyEntriesEvent(DDRegistry.MACAW_TAB).register(FabricUtils::addMacawTabEntries);
		}
		if (Compats.isModLoaded("manyideas_doors", INSTANCE)) {
			ItemGroupEvents.modifyEntriesEvent(DDRegistry.MANYIDEAS_TAB).register(FabricUtils::addManyIdeasTabEntries);
		}
	}

	// Add to vanilla tabs.
	private static void addBuildingBlocks(FabricItemGroupEntries entries) {
		entries.addBefore(Items.IRON_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)));
		entries.addBefore(Items.COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)));
		entries.addBefore(Items.EXPOSED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)));
		entries.addBefore(Items.WEATHERED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)));
		entries.addBefore(Items.OXIDIZED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)));
		entries.addBefore(Items.WAXED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_COPPER)));
		entries.addBefore(Items.WAXED_EXPOSED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_COPPER)));
		entries.addBefore(Items.WAXED_WEATHERED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_COPPER)));
		entries.addBefore(Items.WAXED_OXIDIZED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_OXIDIZED_COPPER)));
		entries.addBefore(Items.OAK_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)));
		entries.addBefore(Items.SPRUCE_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE)));
		entries.addBefore(Items.BIRCH_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH)));
		entries.addBefore(Items.JUNGLE_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE)));
		entries.addBefore(Items.ACACIA_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA)));
		entries.addBefore(Items.DARK_OAK_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK)));
		entries.addBefore(Items.MANGROVE_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE)));
		entries.addBefore(Items.BAMBOO_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO)));
		entries.addBefore(Items.CHERRY_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY)));
		entries.addBefore(Items.CRIMSON_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON)));
		entries.addBefore(Items.WARPED_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED)));
		entries.addAfter(Items.IRON_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON)));
		entries.addAfter(Items.COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)));
		entries.addAfter(Items.EXPOSED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_COPPER)));
		entries.addAfter(Items.WEATHERED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_COPPER)));
		entries.addAfter(Items.OXIDIZED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OXIDIZED_COPPER)));
		entries.addAfter(Items.WAXED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_COPPER)));
		entries.addAfter(Items.WAXED_EXPOSED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_EXPOSED_COPPER)));
		entries.addAfter(Items.WAXED_WEATHERED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_WEATHERED_COPPER)));
		entries.addAfter(Items.WAXED_OXIDIZED_COPPER_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_OXIDIZED_COPPER)));
		entries.addAfter(Items.OAK_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK)));
		entries.addAfter(Items.SPRUCE_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE)));
		entries.addAfter(Items.BIRCH_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH)));
		entries.addAfter(Items.JUNGLE_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE)));
		entries.addAfter(Items.ACACIA_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA)));
		entries.addAfter(Items.DARK_OAK_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK)));
		entries.addAfter(Items.MANGROVE_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE)));
		entries.addAfter(Items.BAMBOO_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO)));
		entries.addAfter(Items.CHERRY_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY)));
		entries.addAfter(Items.CRIMSON_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON)));
		entries.addAfter(Items.WARPED_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED)));
	}

	private static void addRedstoneBlocks(FabricItemGroupEntries entries) {
		entries.addBefore(Items.IRON_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)));
		entries.addBefore(Items.OAK_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)));
		entries.addAfter(Items.IRON_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON)));
		entries.addAfter(Items.OAK_DOOR, BuiltInRegistries.BLOCK.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK)));
	}

	// Add to mod tabs.
	private static void addMainTabEntries(FabricItemGroupEntries entries) {
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
			if (!(pair.getA().contains("chipped") || pair.getA().contains("macaw") || pair.getA().contains("manyideas"))) {
				entries.accept(pair.getB(), TabVisibility.PARENT_AND_SEARCH_TABS);
			}
		}
	}

	private static void addChippedTabEntries(FabricItemGroupEntries entries) {
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
			if (pair.getA().contains("chipped")) {
				entries.accept(pair.getB(), TabVisibility.PARENT_AND_SEARCH_TABS);
			}
		}
	}

	private static void addMacawTabEntries(FabricItemGroupEntries entries) {
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
			if (pair.getA().contains("macaw")) {
				entries.accept(pair.getB(), TabVisibility.PARENT_AND_SEARCH_TABS);
			}
		}
	}

	private static void addManyIdeasTabEntries(FabricItemGroupEntries entries) {
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
			if (pair.getA().contains("manyideas")) {
				entries.accept(pair.getB(), TabVisibility.PARENT_AND_SEARCH_TABS);
			}
		}
	}
}
