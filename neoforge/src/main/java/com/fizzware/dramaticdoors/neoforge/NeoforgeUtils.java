package com.fizzware.dramaticdoors.neoforge;

import java.util.Objects;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.neoforge.config.DDConfigNF;
import com.fizzware.dramaticdoors.registry.DDCreativeTabs;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.loading.LoadingModList;
import net.neoforged.neoforge.common.util.MutableHashedLinkedMap;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import oshi.util.tuples.Pair;

public class NeoforgeUtils implements CompatChecker
{
	public static final NeoforgeUtils INSTANCE = new NeoforgeUtils();
	
	@Override
	public boolean isModLoaded(String modid) {
		if (LoadingModList.get().getModFileById(modid) != null) {
			return true;
		}
		return ModList.get().isLoaded(modid);
	}
	
	@Override
	public boolean isDev() {
		if (!FMLEnvironment.production) {
			return true;
		}
		return DDConfigNF.devMode.get();
	}
    
	@Override
	public boolean isQuarkModuleEnabled() {
		return INSTANCE.isModLoaded("quark");
	}
	
	public static void registerOxidizableBlockPair(Block less, Block more) {
		Objects.requireNonNull(less, "Oxidizable block cannot be null!");
		Objects.requireNonNull(more, "Oxidizable block cannot be null!");
		WeatheringCopper.NEXT_BY_BLOCK.get().put(less, more);
	}

	public static void registerWaxableBlockPair(Block unwaxed, Block waxed) {
		Objects.requireNonNull(unwaxed, "Unwaxed block cannot be null!");
		Objects.requireNonNull(waxed, "Waxed block cannot be null!");
		HoneycombItem.WAXABLES.get().put(unwaxed, waxed);
	}
	
	@SubscribeEvent
    public static void assignItemsToTabs(BuildCreativeModeTabContentsEvent event) {
    	MutableHashedLinkedMap<ItemStack, TabVisibility> map = event.getEntries();
    	
    	// Insert into vanilla tabs.
    	if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
    		map.putBefore(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WAXED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WAXED_EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WAXED_WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WAXED_OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.SPRUCE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.BIRCH_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.JUNGLE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.ACACIA_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.DARK_OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.MANGROVE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.CHERRY_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.BAMBOO_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.CRIMSON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WARPED_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WAXED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WAXED_EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WAXED_WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WAXED_OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.SPRUCE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.BIRCH_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.JUNGLE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.ACACIA_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.DARK_OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.MANGROVE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.CHERRY_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.BAMBOO_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.CRIMSON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WARPED_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WARPED)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
    		map.putBefore(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	// Insert into Dramatic Doors tabs.
    	if (event.getTabKey() == DDCreativeTabs.MAIN_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (!(pair.getA().contains("chipped") || pair.getA().contains("macaw") || pair.getA().contains("manyideas"))) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDCreativeTabs.CHIPPED_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (pair.getA().contains("chipped")) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDCreativeTabs.MACAW_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (pair.getA().contains("macaw")) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDCreativeTabs.MANYIDEAS_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (pair.getA().contains("manyideas")) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    }
}
