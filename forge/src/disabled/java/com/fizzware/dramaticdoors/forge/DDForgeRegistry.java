package com.fizzware.dramaticdoors.forge;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.registries.SupplementariesCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import oshi.util.tuples.Pair;

public class DDForgeRegistry
{
	@SubscribeEvent
	public static void registerBlocksItems(RegisterEvent event) {
		// Hook in compats.
		Compats.registerCompats(ForgeUtils.INSTANCE);
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
		event.register(ForgeRegistries.Keys.BLOCK_ENTITY_TYPES, helper -> {
			if (Compats.isModLoaded("supplementaries", ForgeUtils.INSTANCE)) {
				DDBlockEntities.TALL_NETHERITE_DOOR = BlockEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, SupplementariesCompat.SHORT_NETHERITE_DOOR, SupplementariesCompat.TALL_NETHERITE_DOOR).build(null);
				helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "tall_netherite_door"), DDBlockEntities.TALL_NETHERITE_DOOR);
			}
		});
	}
	
    @SubscribeEvent
    public static void registerCreativeTabs(RegisterEvent event) {
    	event.register(Registries.CREATIVE_MODE_TAB, helper -> {
    		helper.register(DDRegistry.MAIN_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK))); }).build());
    		if (ForgeUtils.INSTANCE.isModLoaded("chipped")) {
    			helper.register(DDRegistry.CHIPPED_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors_chipped")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED))); }).build());
    		}
    		if (ForgeUtils.INSTANCE.isModLoaded("mcwdoors")) {
    			helper.register(DDRegistry.MACAW_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors_macaw")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN))); }).build());
    		}
    		if (ForgeUtils.INSTANCE.isModLoaded("manyideas_doors")) {
    			helper.register(DDRegistry.MANYIDEAS_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors_manyideas")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK))); }).build());
    		}
    	});
    }
}
