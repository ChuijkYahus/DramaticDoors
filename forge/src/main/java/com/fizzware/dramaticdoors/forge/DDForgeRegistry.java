package com.fizzware.dramaticdoors.forge;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import oshi.util.tuples.Pair;

public class DDForgeRegistry
{
	@SubscribeEvent
	public static void registerBlocksItems(RegisterEvent event) {
		// Hook in compats, I mean, vanilla stuff because Forge is deprecated.
		DDRegistry.registerVanilla();
		// Register blocks.
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
	        for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
	        	helper.register(new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
	        }
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	helper.register(new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
	        }
		});
	}
	
    @SubscribeEvent
    public static void registerCreativeTabs(RegisterEvent event) {
    	event.register(Registries.CREATIVE_MODE_TAB, helper -> {
    		helper.register(DDRegistry.MAIN_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK))); }).build());
    	});
    }
}
