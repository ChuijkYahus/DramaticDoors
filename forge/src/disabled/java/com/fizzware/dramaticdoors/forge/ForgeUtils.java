package com.fizzware.dramaticdoors.forge;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.forge.config.DDConfigForge;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.loading.LoadingModList;
import oshi.util.tuples.Pair;

public class ForgeUtils implements CompatChecker
{
	public static final ForgeUtils INSTANCE = new ForgeUtils();
	
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
		return DDConfigForge.devMode.get();
	}
    
	@Override
	public boolean isQuarkModuleEnabled() {
		return INSTANCE.isModLoaded("quark");
	}
	
    @SuppressWarnings("deprecation")
	@SubscribeEvent
    public static void assignItemsToTabs(BuildCreativeModeTabContentsEvent event) {
    	MutableHashedLinkedMap<ItemStack, TabVisibility> map = event.getEntries();
    	
    	// Insert into vanilla tabs.
    	if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
    		map.putBefore(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.SPRUCE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.BIRCH_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.JUNGLE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.ACACIA_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.DARK_OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.MANGROVE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.CHERRY_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.BAMBOO_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.CRIMSON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WARPED_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.SPRUCE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.BIRCH_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.JUNGLE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.ACACIA_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.DARK_OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.MANGROVE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.CHERRY_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.BAMBOO_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.CRIMSON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WARPED_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
    		map.putBefore(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	// Insert into Dramatic Doors tabs.
    	if (event.getTabKey() == DDRegistry.MAIN_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (!(pair.getA().contains("chipped") || pair.getA().contains("macaw") || pair.getA().contains("manyideas"))) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDRegistry.CHIPPED_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (pair.getA().contains("chipped")) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDRegistry.MACAW_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (pair.getA().contains("macaw")) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDRegistry.MANYIDEAS_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	if (pair.getA().contains("manyideas")) {
	        		map.put(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    }
}
