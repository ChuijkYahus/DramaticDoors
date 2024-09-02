package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;


public class MacawCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_STORE, DDNames.SHORT_MACAW_STORE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "store_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SLIDING_GLASS, DDNames.SHORT_MACAW_SLIDING_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "store_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JAIL, DDNames.SHORT_MACAW_JAIL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jail_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL, DDNames.SHORT_MACAW_METAL_REINFORCED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "reinforced_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_HOSPITAL, DDNames.SHORT_MACAW_METAL_HOSPITAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_hospital_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_REINFORCED, DDNames.SHORT_MACAW_METAL_REINFORCED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_reinforced_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_WARNING, DDNames.SHORT_MACAW_METAL_WARNING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_warning_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_WINDOWED, DDNames.SHORT_MACAW_METAL_WINDOWED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_windowed_door"), Blocks.IRON_DOOR), false, DDRegistry.MACAW_TAB);
		
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARN, DDNames.SHORT_MACAW_OAK_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARN, DDNames.SHORT_MACAW_SPRUCE_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARN, DDNames.SHORT_MACAW_BIRCH_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARN, DDNames.SHORT_MACAW_JUNGLE_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARN, DDNames.SHORT_MACAW_ACACIA_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARN, DDNames.SHORT_MACAW_DARK_OAK_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARN, DDNames.SHORT_MACAW_MANGROVE_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARN, DDNames.SHORT_MACAW_BAMBOO_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_barn_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_barn_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BARN, DDNames.SHORT_MACAW_CRIMSON_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BARN, DDNames.SHORT_MACAW_WARPED_BARN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);
		
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARN_GLASS, DDNames.SHORT_MACAW_OAK_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_glass_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, DDNames.SHORT_MACAW_SPRUCE_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_glass_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, DDNames.SHORT_MACAW_BIRCH_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_glass_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, DDNames.SHORT_MACAW_JUNGLE_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_glass_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, DDNames.SHORT_MACAW_ACACIA_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_glass_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, DDNames.SHORT_MACAW_DARK_OAK_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, DDNames.SHORT_MACAW_MANGROVE_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, DDNames.SHORT_MACAW_BAMBOO_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_barn_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, DDNames.SHORT_MACAW_CRIMSON_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_glass_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BARN_GLASS, DDNames.SHORT_MACAW_WARPED_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_glass_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_OAK_STABLE, DDNames.SHORT_MACAW_OAK_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_STABLE, DDNames.SHORT_MACAW_SPRUCE_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_STABLE, DDNames.SHORT_MACAW_BIRCH_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_STABLE, DDNames.SHORT_MACAW_JUNGLE_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_STABLE, DDNames.SHORT_MACAW_ACACIA_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_STABLE, DDNames.SHORT_MACAW_DARK_OAK_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_STABLE, DDNames.SHORT_MACAW_MANGROVE_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_STABLE, DDNames.SHORT_MACAW_BAMBOO_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_stable_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_stable_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STABLE, DDNames.SHORT_MACAW_CRIMSON_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STABLE, DDNames.SHORT_MACAW_WARPED_STABLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_OAK_STABLE_HEAD, DDNames.SHORT_MACAW_OAK_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_head_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, DDNames.SHORT_MACAW_SPRUCE_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_head_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, DDNames.SHORT_MACAW_BIRCH_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_head_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, DDNames.SHORT_MACAW_JUNGLE_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_head_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, DDNames.SHORT_MACAW_ACACIA_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_head_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, DDNames.SHORT_MACAW_DARK_OAK_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, DDNames.SHORT_MACAW_MANGROVE_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_head_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, DDNames.SHORT_MACAW_BAMBOO_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_stable_head_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_stable_head_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, DDNames.SHORT_MACAW_CRIMSON_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_head_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, DDNames.SHORT_MACAW_WARPED_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_head_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARK_GLASS, DDNames.SHORT_MACAW_OAK_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bark_glass_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, DDNames.SHORT_MACAW_SPRUCE_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bark_glass_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, DDNames.SHORT_MACAW_BIRCH_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bark_glass_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, DDNames.SHORT_MACAW_JUNGLE_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bark_glass_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, DDNames.SHORT_MACAW_ACACIA_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bark_glass_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, DDNames.SHORT_MACAW_DARK_OAK_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, DDNames.SHORT_MACAW_MANGROVE_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, DDNames.SHORT_MACAW_BAMBOO_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, DDNames.SHORT_MACAW_CRIMSON_STEM_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stem_glass_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STEM_GLASS, DDNames.SHORT_MACAW_WARPED_STEM_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stem_glass_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_GLASS, DDNames.SHORT_MACAW_OAK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_glass_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_GLASS, DDNames.SHORT_MACAW_SPRUCE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_glass_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_GLASS, DDNames.SHORT_MACAW_BIRCH_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_glass_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_GLASS, DDNames.SHORT_MACAW_JUNGLE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_glass_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_GLASS, DDNames.SHORT_MACAW_ACACIA_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_glass_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_GLASS, DDNames.SHORT_MACAW_DARK_OAK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_glass_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_GLASS, DDNames.SHORT_MACAW_MANGROVE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_glass_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_GLASS, DDNames.SHORT_MACAW_BAMBOO_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_glass_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_glass_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_GLASS, DDNames.SHORT_MACAW_CRIMSON_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_glass_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_GLASS, DDNames.SHORT_MACAW_WARPED_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_glass_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_MODERN, DDNames.SHORT_MACAW_OAK_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_modern_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_MODERN, DDNames.SHORT_MACAW_SPRUCE_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_modern_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_MODERN, DDNames.SHORT_MACAW_BIRCH_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_modern_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_MODERN, DDNames.SHORT_MACAW_JUNGLE_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_modern_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_MODERN, DDNames.SHORT_MACAW_ACACIA_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_modern_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_MODERN, DDNames.SHORT_MACAW_DARK_OAK_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_modern_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_MODERN, DDNames.SHORT_MACAW_MANGROVE_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_modern_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_MODERN, DDNames.SHORT_MACAW_BAMBOO_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_modern_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_modern_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_MODERN, DDNames.SHORT_MACAW_CRIMSON_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_modern_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_MODERN, DDNames.SHORT_MACAW_WARPED_MODERN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_modern_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_OAK_JAPANESE, DDNames.SHORT_MACAW_OAK_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_JAPANESE, DDNames.SHORT_MACAW_SPRUCE_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_JAPANESE, DDNames.SHORT_MACAW_BIRCH_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_JAPANESE, DDNames.SHORT_MACAW_JUNGLE_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_JAPANESE, DDNames.SHORT_MACAW_ACACIA_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, DDNames.SHORT_MACAW_DARK_OAK_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_JAPANESE, DDNames.SHORT_MACAW_MANGROVE_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_JAPANESE, DDNames.SHORT_MACAW_BAMBOO_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_japanese_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_japanese_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_JAPANESE, DDNames.SHORT_MACAW_CRIMSON_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_JAPANESE, DDNames.SHORT_MACAW_WARPED_JAPANESE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_OAK_JAPANESE2, DDNames.SHORT_MACAW_OAK_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese2_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, DDNames.SHORT_MACAW_SPRUCE_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese2_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_JAPANESE2, DDNames.SHORT_MACAW_BIRCH_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese2_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, DDNames.SHORT_MACAW_JUNGLE_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese2_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_JAPANESE2, DDNames.SHORT_MACAW_ACACIA_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese2_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, DDNames.SHORT_MACAW_DARK_OAK_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, DDNames.SHORT_MACAW_MANGROVE_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese2_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, DDNames.SHORT_MACAW_BAMBOO_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_japanese2_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_japanese2_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, DDNames.SHORT_MACAW_CRIMSON_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese2_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_JAPANESE2, DDNames.SHORT_MACAW_WARPED_JAPANESE2, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese2_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_CLASSIC, DDNames.SHORT_MACAW_SPRUCE_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_classic_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_CLASSIC, DDNames.SHORT_MACAW_BIRCH_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_classic_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_CLASSIC, DDNames.SHORT_MACAW_JUNGLE_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_classic_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_CLASSIC, DDNames.SHORT_MACAW_ACACIA_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_classic_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, DDNames.SHORT_MACAW_DARK_OAK_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_classic_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_CLASSIC, DDNames.SHORT_MACAW_MANGROVE_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_classic_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_CLASSIC, DDNames.SHORT_MACAW_BAMBOO_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_classic_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_classic_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_CLASSIC, DDNames.SHORT_MACAW_CRIMSON_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_classic_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_CLASSIC, DDNames.SHORT_MACAW_WARPED_CLASSIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_classic_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_COTTAGE, DDNames.SHORT_MACAW_OAK_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_cottage_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_COTTAGE, DDNames.SHORT_MACAW_BIRCH_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_cottage_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_COTTAGE, DDNames.SHORT_MACAW_JUNGLE_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_cottage_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_COTTAGE, DDNames.SHORT_MACAW_ACACIA_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_cottage_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, DDNames.SHORT_MACAW_DARK_OAK_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_cottage_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_COTTAGE, DDNames.SHORT_MACAW_MANGROVE_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_cottage_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_COTTAGE, DDNames.SHORT_MACAW_BAMBOO_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_cottage_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_cottage_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_COTTAGE, DDNames.SHORT_MACAW_CRIMSON_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_cottage_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_COTTAGE, DDNames.SHORT_MACAW_WARPED_COTTAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_cottage_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_PAPER, DDNames.SHORT_MACAW_OAK_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_paper_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_PAPER, DDNames.SHORT_MACAW_SPRUCE_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_paper_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_PAPER, DDNames.SHORT_MACAW_JUNGLE_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_paper_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_PAPER, DDNames.SHORT_MACAW_ACACIA_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_paper_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_PAPER, DDNames.SHORT_MACAW_DARK_OAK_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_paper_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_PAPER, DDNames.SHORT_MACAW_MANGROVE_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_paper_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_PAPER, DDNames.SHORT_MACAW_BAMBOO_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_paper_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_paper_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_PAPER, DDNames.SHORT_MACAW_CRIMSON_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_paper_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_PAPER, DDNames.SHORT_MACAW_WARPED_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_paper_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BEACH, DDNames.SHORT_MACAW_OAK_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_beach_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BEACH, DDNames.SHORT_MACAW_SPRUCE_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_beach_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BEACH, DDNames.SHORT_MACAW_BIRCH_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_beach_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BEACH, DDNames.SHORT_MACAW_ACACIA_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_beach_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BEACH, DDNames.SHORT_MACAW_DARK_OAK_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_beach_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BEACH, DDNames.SHORT_MACAW_MANGROVE_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_beach_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BEACH, DDNames.SHORT_MACAW_BAMBOO_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_beach_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_beach_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BEACH, DDNames.SHORT_MACAW_CRIMSON_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_beach_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BEACH, DDNames.SHORT_MACAW_WARPED_BEACH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_beach_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_TROPICAL, DDNames.SHORT_MACAW_OAK_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_tropical_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_TROPICAL, DDNames.SHORT_MACAW_SPRUCE_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_tropical_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_TROPICAL, DDNames.SHORT_MACAW_BIRCH_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_tropical_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_TROPICAL, DDNames.SHORT_MACAW_JUNGLE_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_tropical_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, DDNames.SHORT_MACAW_DARK_OAK_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_tropical_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_TROPICAL, DDNames.SHORT_MACAW_MANGROVE_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_tropical_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_TROPICAL, DDNames.SHORT_MACAW_BAMBOO_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_tropical_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_tropical_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_TROPICAL, DDNames.SHORT_MACAW_CRIMSON_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_tropical_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_TROPICAL, DDNames.SHORT_MACAW_WARPED_TROPICAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_tropical_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_FOUR_PANEL, DDNames.SHORT_MACAW_OAK_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_four_panel_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, DDNames.SHORT_MACAW_SPRUCE_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_four_panel_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, DDNames.SHORT_MACAW_BIRCH_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_four_panel_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, DDNames.SHORT_MACAW_JUNGLE_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_four_panel_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, DDNames.SHORT_MACAW_ACACIA_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_four_panel_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, DDNames.SHORT_MACAW_MANGROVE_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_four_panel_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, DDNames.SHORT_MACAW_BAMBOO_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_four_panel_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_four_panel_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, DDNames.SHORT_MACAW_CRIMSON_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_four_panel_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, DDNames.SHORT_MACAW_WARPED_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_four_panel_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_SWAMP, DDNames.SHORT_MACAW_OAK_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_swamp_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_SWAMP, DDNames.SHORT_MACAW_SPRUCE_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_swamp_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_SWAMP, DDNames.SHORT_MACAW_BIRCH_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_swamp_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_SWAMP, DDNames.SHORT_MACAW_JUNGLE_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_swamp_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_SWAMP, DDNames.SHORT_MACAW_ACACIA_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_swamp_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_SWAMP, DDNames.SHORT_MACAW_DARK_OAK_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_swamp_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_SWAMP, DDNames.SHORT_MACAW_BAMBOO_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_swamp_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_SWAMP, DDNames.SHORT_MACAW_CRIMSON_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_swamp_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_SWAMP, DDNames.SHORT_MACAW_WARPED_SWAMP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_swamp_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_WAFFLE, DDNames.SHORT_MACAW_OAK_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_waffle_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_WAFFLE, DDNames.SHORT_MACAW_SPRUCE_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_waffle_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_WAFFLE, DDNames.SHORT_MACAW_BIRCH_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_waffle_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_WAFFLE, DDNames.SHORT_MACAW_JUNGLE_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_waffle_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_WAFFLE, DDNames.SHORT_MACAW_ACACIA_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_waffle_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, DDNames.SHORT_MACAW_DARK_OAK_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_waffle_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_WAFFLE, DDNames.SHORT_MACAW_MANGROVE_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_waffle_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_WAFFLE, DDNames.SHORT_MACAW_BAMBOO_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_waffle_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_waffle_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_WAFFLE, DDNames.SHORT_MACAW_CRIMSON_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_waffle_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_WAFFLE, DDNames.SHORT_MACAW_WARPED_WAFFLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_waffle_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BAMBOO, DDNames.SHORT_MACAW_OAK_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bamboo_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BAMBOO, DDNames.SHORT_MACAW_SPRUCE_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bamboo_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BAMBOO, DDNames.SHORT_MACAW_BIRCH_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bamboo_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BAMBOO, DDNames.SHORT_MACAW_JUNGLE_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bamboo_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BAMBOO, DDNames.SHORT_MACAW_ACACIA_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bamboo_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, DDNames.SHORT_MACAW_DARK_OAK_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BAMBOO, DDNames.SHORT_MACAW_MANGROVE_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bamboo_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BAMBOO, DDNames.SHORT_MACAW_CRIMSON_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_bamboo_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BAMBOO, DDNames.SHORT_MACAW_WARPED_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_bamboo_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_NETHER, DDNames.SHORT_MACAW_OAK_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_nether_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_NETHER, DDNames.SHORT_MACAW_SPRUCE_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_nether_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_NETHER, DDNames.SHORT_MACAW_BIRCH_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_nether_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_NETHER, DDNames.SHORT_MACAW_JUNGLE_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_nether_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_NETHER, DDNames.SHORT_MACAW_ACACIA_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_nether_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_NETHER, DDNames.SHORT_MACAW_DARK_OAK_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_nether_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_NETHER, DDNames.SHORT_MACAW_MANGROVE_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_nether_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_NETHER, DDNames.SHORT_MACAW_BAMBOO_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_nether_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_nether_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_NETHER, DDNames.SHORT_MACAW_WARPED_NETHER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_nether_door"), Blocks.WARPED_DOOR), false, DDRegistry.MACAW_TAB);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_MYSTIC, DDNames.SHORT_MACAW_OAK_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_mystic_door"), Blocks.OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_MYSTIC, DDNames.SHORT_MACAW_SPRUCE_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_mystic_door"), Blocks.SPRUCE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_MYSTIC, DDNames.SHORT_MACAW_BIRCH_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_mystic_door"), Blocks.BIRCH_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_MYSTIC, DDNames.SHORT_MACAW_JUNGLE_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_mystic_door"), Blocks.JUNGLE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_MYSTIC, DDNames.SHORT_MACAW_ACACIA_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_mystic_door"), Blocks.ACACIA_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, DDNames.SHORT_MACAW_DARK_OAK_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_mystic_door"), Blocks.DARK_OAK_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_MYSTIC, DDNames.SHORT_MACAW_MANGROVE_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_mystic_door"), Blocks.MANGROVE_DOOR), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_MYSTIC, DDNames.SHORT_MACAW_BAMBOO_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_mystic_door"), DDRegistry.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_mystic_door"))), false, DDRegistry.MACAW_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_MYSTIC, DDNames.SHORT_MACAW_CRIMSON_MYSTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_mystic_door"), Blocks.CRIMSON_DOOR), false, DDRegistry.MACAW_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_STORE, new ResourceLocation("mcwdoors", "store_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SLIDING_GLASS, new ResourceLocation("mcwdoors", "sliding_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JAIL, new ResourceLocation("mcwdoors", "jail_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL, new ResourceLocation("mcwdoors", "metal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_HOSPITAL, new ResourceLocation("mcwdoors", "metal_hospital_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_REINFORCED, new ResourceLocation("mcwdoors", "metal_reinforced_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_WARNING, new ResourceLocation("mcwdoors", "metal_warning_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_WINDOWED, new ResourceLocation("mcwdoors", "metal_windowed_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BARN, new ResourceLocation("mcwdoors", "oak_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BARN, new ResourceLocation("mcwdoors", "spruce_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BARN, new ResourceLocation("mcwdoors", "birch_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BARN, new ResourceLocation("mcwdoors", "jungle_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BARN, new ResourceLocation("mcwdoors", "acacia_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BARN, new ResourceLocation("mcwdoors", "dark_oak_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BARN, new ResourceLocation("mcwdoors", "mangrove_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BARN, new ResourceLocation("mcwdoors", "bamboo_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_STABLE, new ResourceLocation("mcwdoors", "mangrove_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_STABLE, new ResourceLocation("mcwdoors", "bamboo_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new ResourceLocation("mcwdoors", "mangrove_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, new ResourceLocation("mcwdoors", "bamboo_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_GLASS, new ResourceLocation("mcwdoors", "mangrove_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_GLASS, new ResourceLocation("mcwdoors", "bamboo_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_MODERN, new ResourceLocation("mcwdoors", "mangrove_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_MODERN, new ResourceLocation("mcwdoors", "bamboo_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new ResourceLocation("mcwdoors", "mangrove_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_JAPANESE, new ResourceLocation("mcwdoors", "bamboo_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new ResourceLocation("mcwdoors", "mangrove_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, new ResourceLocation("mcwdoors", "bamboo_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new ResourceLocation("mcwdoors", "mangrove_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_CLASSIC, new ResourceLocation("mcwdoors", "bamboo_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new ResourceLocation("mcwdoors", "mangrove_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_COTTAGE, new ResourceLocation("mcwdoors", "bamboo_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_PAPER, new ResourceLocation("mcwdoors", "mangrove_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_PAPER, new ResourceLocation("mcwdoors", "bamboo_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BEACH, new ResourceLocation("mcwdoors", "mangrove_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BEACH, new ResourceLocation("mcwdoors", "bamboo_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new ResourceLocation("mcwdoors", "mangrove_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_TROPICAL, new ResourceLocation("mcwdoors", "bamboo_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new ResourceLocation("mcwdoors", "mangrove_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, new ResourceLocation("mcwdoors", "bamboo_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_SWAMP, new ResourceLocation("mcwdoors", "bamboo_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"));

		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_WAFFLE, new ResourceLocation("mcwdoors", "oak_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_WAFFLE, new ResourceLocation("mcwdoors", "spruce_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_WAFFLE, new ResourceLocation("mcwdoors", "birch_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_WAFFLE, new ResourceLocation("mcwdoors", "jungle_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_WAFFLE, new ResourceLocation("mcwdoors", "acacia_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, new ResourceLocation("mcwdoors", "dark_oak_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_WAFFLE, new ResourceLocation("mcwdoors", "mangrove_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_WAFFLE, new ResourceLocation("mcwdoors", "bamboo_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_WAFFLE, new ResourceLocation("mcwdoors", "crimson_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_WAFFLE, new ResourceLocation("mcwdoors", "warped_waffle_door"));

		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BAMBOO, new ResourceLocation("mcwdoors", "oak_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BAMBOO, new ResourceLocation("mcwdoors", "spruce_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BAMBOO, new ResourceLocation("mcwdoors", "birch_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BAMBOO, new ResourceLocation("mcwdoors", "jungle_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BAMBOO, new ResourceLocation("mcwdoors", "acacia_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BAMBOO, new ResourceLocation("mcwdoors", "mangrove_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BAMBOO, new ResourceLocation("mcwdoors", "crimson_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BAMBOO, new ResourceLocation("mcwdoors", "warped_bamboo_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_NETHER, new ResourceLocation("mcwdoors", "mangrove_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_NETHER, new ResourceLocation("mcwdoors", "bamboo_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new ResourceLocation("mcwdoors", "mangrove_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_MYSTIC, new ResourceLocation("mcwdoors", "bamboo_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new ResourceLocation("mcwdoors", "crimson_mystic_door"));
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_STORE, new ResourceLocation("mcwdoors", "store_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SLIDING_GLASS, new ResourceLocation("mcwdoors", "sliding_glass_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JAIL, new ResourceLocation("mcwdoors", "jail_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL, new ResourceLocation("mcwdoors", "metal_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_HOSPITAL, new ResourceLocation("mcwdoors", "metal_hospital_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_REINFORCED, new ResourceLocation("mcwdoors", "metal_reinforced_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_WARNING, new ResourceLocation("mcwdoors", "metal_warning_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_WINDOWED, new ResourceLocation("mcwdoors", "metal_windowed_door"), "tall_macaw_metal_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BARN, new ResourceLocation("mcwdoors", "oak_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BARN, new ResourceLocation("mcwdoors", "spruce_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BARN, new ResourceLocation("mcwdoors", "birch_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BARN, new ResourceLocation("mcwdoors", "jungle_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BARN, new ResourceLocation("mcwdoors", "acacia_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BARN, new ResourceLocation("mcwdoors", "dark_oak_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BARN, new ResourceLocation("mcwdoors", "mangrove_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BARN, new ResourceLocation("mcwdoors", "bamboo_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"), "tall_macaw_barn_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"), "tall_macaw_barn_glass_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_STABLE, new ResourceLocation("mcwdoors", "mangrove_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_STABLE, new ResourceLocation("mcwdoors", "bamboo_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"), "tall_macaw_stable_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new ResourceLocation("mcwdoors", "mangrove_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, new ResourceLocation("mcwdoors", "bamboo_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"), "tall_macaw_stable_head_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"), "tall_macaw_bark_glass_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_GLASS, new ResourceLocation("mcwdoors", "mangrove_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_GLASS, new ResourceLocation("mcwdoors", "bamboo_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"), "tall_macaw_glass_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_MODERN, new ResourceLocation("mcwdoors", "mangrove_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_MODERN, new ResourceLocation("mcwdoors", "bamboo_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"), "tall_macaw_modern_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new ResourceLocation("mcwdoors", "mangrove_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_JAPANESE, new ResourceLocation("mcwdoors", "bamboo_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"), "tall_macaw_japanese_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new ResourceLocation("mcwdoors", "mangrove_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, new ResourceLocation("mcwdoors", "bamboo_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"), "tall_macaw_japanese2_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new ResourceLocation("mcwdoors", "mangrove_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_CLASSIC, new ResourceLocation("mcwdoors", "bamboo_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"), "tall_macaw_classic_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new ResourceLocation("mcwdoors", "mangrove_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_COTTAGE, new ResourceLocation("mcwdoors", "bamboo_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"), "tall_macaw_cottage_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_PAPER, new ResourceLocation("mcwdoors", "mangrove_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_PAPER, new ResourceLocation("mcwdoors", "bamboo_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"), "tall_macaw_paper_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BEACH, new ResourceLocation("mcwdoors", "mangrove_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BEACH, new ResourceLocation("mcwdoors", "bamboo_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"), "tall_macaw_beach_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new ResourceLocation("mcwdoors", "mangrove_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_TROPICAL, new ResourceLocation("mcwdoors", "bamboo_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"), "tall_macaw_tropical_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"), "tall_macaw_four_panel_door");			
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new ResourceLocation("mcwdoors", "mangrove_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, new ResourceLocation("mcwdoors", "bamboo_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"), "tall_macaw_four_panel_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_SWAMP, new ResourceLocation("mcwdoors", "bamboo_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"), "tall_macaw_swamp_door");

		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_WAFFLE, new ResourceLocation("mcwdoors", "oak_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_WAFFLE, new ResourceLocation("mcwdoors", "spruce_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_WAFFLE, new ResourceLocation("mcwdoors", "birch_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_WAFFLE, new ResourceLocation("mcwdoors", "jungle_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_WAFFLE, new ResourceLocation("mcwdoors", "acacia_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, new ResourceLocation("mcwdoors", "dark_oak_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_WAFFLE, new ResourceLocation("mcwdoors", "mangrove_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_WAFFLE, new ResourceLocation("mcwdoors", "bamboo_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_WAFFLE, new ResourceLocation("mcwdoors", "crimson_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_WAFFLE, new ResourceLocation("mcwdoors", "warped_waffle_door"), "tall_macaw_waffle_door");

		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BAMBOO, new ResourceLocation("mcwdoors", "oak_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BAMBOO, new ResourceLocation("mcwdoors", "spruce_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BAMBOO, new ResourceLocation("mcwdoors", "birch_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BAMBOO, new ResourceLocation("mcwdoors", "jungle_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BAMBOO, new ResourceLocation("mcwdoors", "acacia_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BAMBOO, new ResourceLocation("mcwdoors", "mangrove_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BAMBOO, new ResourceLocation("mcwdoors", "crimson_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BAMBOO, new ResourceLocation("mcwdoors", "warped_bamboo_door"), "tall_macaw_bamboo_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_NETHER, new ResourceLocation("mcwdoors", "mangrove_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_NETHER, new ResourceLocation("mcwdoors", "bamboo_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"), "tall_macaw_nether_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new ResourceLocation("mcwdoors", "mangrove_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_MYSTIC, new ResourceLocation("mcwdoors", "bamboo_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new ResourceLocation("mcwdoors", "crimson_mystic_door"), "tall_macaw_mystic_door");
	}
}
