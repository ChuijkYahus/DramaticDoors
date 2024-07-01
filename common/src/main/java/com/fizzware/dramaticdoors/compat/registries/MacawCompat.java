package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MacawCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_STORE, DDNames.SHORT_MACAW_STORE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "store_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SLIDING_GLASS, DDNames.SHORT_MACAW_SLIDING_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "store_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JAIL, DDNames.SHORT_MACAW_JAIL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jail_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL, DDNames.SHORT_MACAW_METAL_REINFORCED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "reinforced_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_HOSPITAL, DDNames.SHORT_MACAW_METAL_HOSPITAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_hospital_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_REINFORCED, DDNames.SHORT_MACAW_METAL_REINFORCED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_reinforced_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_WARNING, DDNames.SHORT_MACAW_METAL_WARNING, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_warning_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_WINDOWED, DDNames.SHORT_MACAW_METAL_WINDOWED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_windowed_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARN, DDNames.SHORT_MACAW_OAK_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_barn_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARN, DDNames.SHORT_MACAW_SPRUCE_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_barn_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARN, DDNames.SHORT_MACAW_BIRCH_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_barn_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARN, DDNames.SHORT_MACAW_JUNGLE_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_barn_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARN, DDNames.SHORT_MACAW_ACACIA_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_barn_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARN, DDNames.SHORT_MACAW_DARK_OAK_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_barn_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARN, DDNames.SHORT_MACAW_MANGROVE_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_barn_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BARN, DDNames.SHORT_MACAW_CHERRY_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_barn_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARN, DDNames.SHORT_MACAW_BAMBOO_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_barn_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BARN, DDNames.SHORT_MACAW_CRIMSON_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_barn_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BARN, DDNames.SHORT_MACAW_WARPED_BARN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_barn_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);
		
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARN_GLASS, DDNames.SHORT_MACAW_OAK_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_barn_glass_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, DDNames.SHORT_MACAW_SPRUCE_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_barn_glass_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, DDNames.SHORT_MACAW_BIRCH_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_barn_glass_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, DDNames.SHORT_MACAW_JUNGLE_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_barn_glass_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, DDNames.SHORT_MACAW_ACACIA_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_barn_glass_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, DDNames.SHORT_MACAW_DARK_OAK_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_barn_glass_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, DDNames.SHORT_MACAW_MANGROVE_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_barn_glass_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, DDNames.SHORT_MACAW_CHERRY_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_barn_glass_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, DDNames.SHORT_MACAW_BAMBOO_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_barn_glass_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, DDNames.SHORT_MACAW_CRIMSON_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_barn_glass_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BARN_GLASS, DDNames.SHORT_MACAW_WARPED_BARN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_barn_glass_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_OAK_STABLE, DDNames.SHORT_MACAW_OAK_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_stable_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_STABLE, DDNames.SHORT_MACAW_SPRUCE_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_stable_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_STABLE, DDNames.SHORT_MACAW_BIRCH_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_stable_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_STABLE, DDNames.SHORT_MACAW_JUNGLE_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_stable_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_STABLE, DDNames.SHORT_MACAW_ACACIA_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_stable_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_STABLE, DDNames.SHORT_MACAW_DARK_OAK_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_stable_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_STABLE, DDNames.SHORT_MACAW_MANGROVE_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_stable_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_STABLE, DDNames.SHORT_MACAW_CHERRY_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_stable_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_STABLE, DDNames.SHORT_MACAW_BAMBOO_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_stable_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STABLE, DDNames.SHORT_MACAW_CRIMSON_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stable_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STABLE, DDNames.SHORT_MACAW_WARPED_STABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stable_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_OAK_STABLE_HEAD, DDNames.SHORT_MACAW_OAK_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_stable_head_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, DDNames.SHORT_MACAW_SPRUCE_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_stable_head_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, DDNames.SHORT_MACAW_BIRCH_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_stable_head_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, DDNames.SHORT_MACAW_JUNGLE_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_stable_head_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, DDNames.SHORT_MACAW_ACACIA_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_stable_head_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, DDNames.SHORT_MACAW_DARK_OAK_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_stable_head_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, DDNames.SHORT_MACAW_MANGROVE_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_stable_head_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, DDNames.SHORT_MACAW_CHERRY_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_stable_head_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, DDNames.SHORT_MACAW_BAMBOO_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_stable_head_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, DDNames.SHORT_MACAW_CRIMSON_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stable_head_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, DDNames.SHORT_MACAW_WARPED_STABLE_HEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stable_head_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARK_GLASS, DDNames.SHORT_MACAW_OAK_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_bark_glass_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, DDNames.SHORT_MACAW_SPRUCE_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_bark_glass_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, DDNames.SHORT_MACAW_BIRCH_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_bark_glass_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, DDNames.SHORT_MACAW_JUNGLE_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_bark_glass_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, DDNames.SHORT_MACAW_ACACIA_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_bark_glass_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, DDNames.SHORT_MACAW_DARK_OAK_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_bark_glass_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, DDNames.SHORT_MACAW_MANGROVE_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_bark_glass_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, DDNames.SHORT_MACAW_CHERRY_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_bark_glass_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, DDNames.SHORT_MACAW_BAMBOO_BARK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_bark_glass_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, DDNames.SHORT_MACAW_CRIMSON_STEM_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stem_glass_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STEM_GLASS, DDNames.SHORT_MACAW_WARPED_STEM_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stem_glass_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_GLASS, DDNames.SHORT_MACAW_OAK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_glass_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_GLASS, DDNames.SHORT_MACAW_SPRUCE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_glass_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_GLASS, DDNames.SHORT_MACAW_BIRCH_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_glass_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_GLASS, DDNames.SHORT_MACAW_JUNGLE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_glass_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_GLASS, DDNames.SHORT_MACAW_ACACIA_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_glass_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_GLASS, DDNames.SHORT_MACAW_DARK_OAK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_glass_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_GLASS, DDNames.SHORT_MACAW_MANGROVE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_glass_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_GLASS, DDNames.SHORT_MACAW_CHERRY_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_glass_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_GLASS, DDNames.SHORT_MACAW_BAMBOO_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_glass_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_GLASS, DDNames.SHORT_MACAW_CRIMSON_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_glass_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_GLASS, DDNames.SHORT_MACAW_WARPED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_glass_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_MODERN, DDNames.SHORT_MACAW_OAK_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_modern_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_MODERN, DDNames.SHORT_MACAW_SPRUCE_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_modern_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_MODERN, DDNames.SHORT_MACAW_BIRCH_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_modern_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_MODERN, DDNames.SHORT_MACAW_JUNGLE_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_modern_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_MODERN, DDNames.SHORT_MACAW_ACACIA_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_modern_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_MODERN, DDNames.SHORT_MACAW_DARK_OAK_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_modern_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_MODERN, DDNames.SHORT_MACAW_MANGROVE_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_modern_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_MODERN, DDNames.SHORT_MACAW_CHERRY_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_modern_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_MODERN, DDNames.SHORT_MACAW_BAMBOO_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_modern_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_MODERN, DDNames.SHORT_MACAW_CRIMSON_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_modern_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_MODERN, DDNames.SHORT_MACAW_WARPED_MODERN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_modern_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_OAK_JAPANESE, DDNames.SHORT_MACAW_OAK_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_japanese_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_JAPANESE, DDNames.SHORT_MACAW_SPRUCE_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_japanese_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_JAPANESE, DDNames.SHORT_MACAW_BIRCH_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_japanese_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_JAPANESE, DDNames.SHORT_MACAW_JUNGLE_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_japanese_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_JAPANESE, DDNames.SHORT_MACAW_ACACIA_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_japanese_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, DDNames.SHORT_MACAW_DARK_OAK_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_japanese_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_JAPANESE, DDNames.SHORT_MACAW_MANGROVE_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_japanese_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_JAPANESE, DDNames.SHORT_MACAW_CHERRY_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_japanese_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_JAPANESE, DDNames.SHORT_MACAW_BAMBOO_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_japanese_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_JAPANESE, DDNames.SHORT_MACAW_CRIMSON_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_japanese_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_JAPANESE, DDNames.SHORT_MACAW_WARPED_JAPANESE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_japanese_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_OAK_JAPANESE2, DDNames.SHORT_MACAW_OAK_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_japanese2_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, DDNames.SHORT_MACAW_SPRUCE_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_japanese2_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_JAPANESE2, DDNames.SHORT_MACAW_BIRCH_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_japanese2_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, DDNames.SHORT_MACAW_JUNGLE_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_japanese2_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_JAPANESE2, DDNames.SHORT_MACAW_ACACIA_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_japanese2_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, DDNames.SHORT_MACAW_DARK_OAK_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_japanese2_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, DDNames.SHORT_MACAW_MANGROVE_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_japanese2_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_JAPANESE2, DDNames.SHORT_MACAW_CHERRY_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_japanese2_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, DDNames.SHORT_MACAW_BAMBOO_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_japanese2_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, DDNames.SHORT_MACAW_CRIMSON_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_japanese2_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_JAPANESE2, DDNames.SHORT_MACAW_WARPED_JAPANESE2, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_japanese2_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_CLASSIC, DDNames.SHORT_MACAW_SPRUCE_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_classic_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_CLASSIC, DDNames.SHORT_MACAW_BIRCH_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_classic_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_CLASSIC, DDNames.SHORT_MACAW_JUNGLE_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_classic_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_CLASSIC, DDNames.SHORT_MACAW_ACACIA_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_classic_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, DDNames.SHORT_MACAW_DARK_OAK_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_classic_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_CLASSIC, DDNames.SHORT_MACAW_MANGROVE_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_classic_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_CLASSIC, DDNames.SHORT_MACAW_CHERRY_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_classic_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_CLASSIC, DDNames.SHORT_MACAW_BAMBOO_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_classic_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_CLASSIC, DDNames.SHORT_MACAW_CRIMSON_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_classic_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_CLASSIC, DDNames.SHORT_MACAW_WARPED_CLASSIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_classic_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_COTTAGE, DDNames.SHORT_MACAW_OAK_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_cottage_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_COTTAGE, DDNames.SHORT_MACAW_BIRCH_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_cottage_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_COTTAGE, DDNames.SHORT_MACAW_JUNGLE_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_cottage_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_COTTAGE, DDNames.SHORT_MACAW_ACACIA_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_cottage_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, DDNames.SHORT_MACAW_DARK_OAK_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_cottage_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_COTTAGE, DDNames.SHORT_MACAW_MANGROVE_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_cottage_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_COTTAGE, DDNames.SHORT_MACAW_CHERRY_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_cottage_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_COTTAGE, DDNames.SHORT_MACAW_BAMBOO_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_cottage_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_COTTAGE, DDNames.SHORT_MACAW_CRIMSON_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_cottage_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_COTTAGE, DDNames.SHORT_MACAW_WARPED_COTTAGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_cottage_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_PAPER, DDNames.SHORT_MACAW_OAK_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_paper_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_PAPER, DDNames.SHORT_MACAW_SPRUCE_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_paper_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_PAPER, DDNames.SHORT_MACAW_JUNGLE_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_paper_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_PAPER, DDNames.SHORT_MACAW_ACACIA_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_paper_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_PAPER, DDNames.SHORT_MACAW_DARK_OAK_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_paper_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_PAPER, DDNames.SHORT_MACAW_MANGROVE_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_paper_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_PAPER, DDNames.SHORT_MACAW_CHERRY_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_paper_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_PAPER, DDNames.SHORT_MACAW_BAMBOO_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_paper_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_PAPER, DDNames.SHORT_MACAW_CRIMSON_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_paper_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_PAPER, DDNames.SHORT_MACAW_WARPED_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_paper_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BEACH, DDNames.SHORT_MACAW_OAK_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_beach_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BEACH, DDNames.SHORT_MACAW_SPRUCE_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_beach_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BEACH, DDNames.SHORT_MACAW_BIRCH_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_beach_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BEACH, DDNames.SHORT_MACAW_ACACIA_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_beach_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BEACH, DDNames.SHORT_MACAW_DARK_OAK_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_beach_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BEACH, DDNames.SHORT_MACAW_MANGROVE_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_beach_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BEACH, DDNames.SHORT_MACAW_CHERRY_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_beach_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BEACH, DDNames.SHORT_MACAW_BAMBOO_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_beach_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BEACH, DDNames.SHORT_MACAW_CRIMSON_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_beach_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BEACH, DDNames.SHORT_MACAW_WARPED_BEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_beach_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_TROPICAL, DDNames.SHORT_MACAW_OAK_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_tropical_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_TROPICAL, DDNames.SHORT_MACAW_SPRUCE_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_tropical_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_TROPICAL, DDNames.SHORT_MACAW_BIRCH_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_tropical_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_TROPICAL, DDNames.SHORT_MACAW_JUNGLE_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_tropical_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, DDNames.SHORT_MACAW_DARK_OAK_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_tropical_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_TROPICAL, DDNames.SHORT_MACAW_MANGROVE_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_tropical_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_TROPICAL, DDNames.SHORT_MACAW_CHERRY_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_tropical_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_TROPICAL, DDNames.SHORT_MACAW_BAMBOO_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_tropical_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_TROPICAL, DDNames.SHORT_MACAW_CRIMSON_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_tropical_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_TROPICAL, DDNames.SHORT_MACAW_WARPED_TROPICAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_tropical_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_FOUR_PANEL, DDNames.SHORT_MACAW_OAK_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_four_panel_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, DDNames.SHORT_MACAW_SPRUCE_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_four_panel_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, DDNames.SHORT_MACAW_BIRCH_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_four_panel_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, DDNames.SHORT_MACAW_JUNGLE_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_four_panel_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, DDNames.SHORT_MACAW_ACACIA_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_four_panel_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, DDNames.SHORT_MACAW_MANGROVE_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_four_panel_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, DDNames.SHORT_MACAW_CHERRY_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_four_panel_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, DDNames.SHORT_MACAW_BAMBOO_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_four_panel_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, DDNames.SHORT_MACAW_CRIMSON_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_four_panel_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, DDNames.SHORT_MACAW_WARPED_FOUR_PANEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_four_panel_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_SWAMP, DDNames.SHORT_MACAW_OAK_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_swamp_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_SWAMP, DDNames.SHORT_MACAW_SPRUCE_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_swamp_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_SWAMP, DDNames.SHORT_MACAW_BIRCH_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_swamp_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_SWAMP, DDNames.SHORT_MACAW_JUNGLE_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_swamp_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_SWAMP, DDNames.SHORT_MACAW_ACACIA_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_swamp_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_SWAMP, DDNames.SHORT_MACAW_DARK_OAK_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_swamp_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_SWAMP, DDNames.SHORT_MACAW_CHERRY_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_swamp_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_SWAMP, DDNames.SHORT_MACAW_BAMBOO_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_swamp_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_SWAMP, DDNames.SHORT_MACAW_CRIMSON_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_swamp_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_SWAMP, DDNames.SHORT_MACAW_WARPED_SWAMP, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_swamp_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_WAFFLE, DDNames.SHORT_MACAW_OAK_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_waffle_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_WAFFLE, DDNames.SHORT_MACAW_SPRUCE_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_waffle_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_WAFFLE, DDNames.SHORT_MACAW_BIRCH_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_waffle_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_WAFFLE, DDNames.SHORT_MACAW_JUNGLE_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_waffle_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_WAFFLE, DDNames.SHORT_MACAW_ACACIA_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_waffle_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, DDNames.SHORT_MACAW_DARK_OAK_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_waffle_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_WAFFLE, DDNames.SHORT_MACAW_MANGROVE_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_waffle_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_WAFFLE, DDNames.SHORT_MACAW_BAMBOO_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_waffle_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_WAFFLE, DDNames.SHORT_MACAW_CRIMSON_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_waffle_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_WAFFLE, DDNames.SHORT_MACAW_WARPED_WAFFLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_waffle_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BAMBOO, DDNames.SHORT_MACAW_OAK_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_bamboo_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BAMBOO, DDNames.SHORT_MACAW_SPRUCE_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_bamboo_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BAMBOO, DDNames.SHORT_MACAW_BIRCH_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_bamboo_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BAMBOO, DDNames.SHORT_MACAW_JUNGLE_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_bamboo_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BAMBOO, DDNames.SHORT_MACAW_ACACIA_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_bamboo_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, DDNames.SHORT_MACAW_DARK_OAK_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_bamboo_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BAMBOO, DDNames.SHORT_MACAW_MANGROVE_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_bamboo_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BAMBOO, DDNames.SHORT_MACAW_CHERRY_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_bamboo_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BAMBOO, DDNames.SHORT_MACAW_CRIMSON_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_bamboo_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BAMBOO, DDNames.SHORT_MACAW_WARPED_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_bamboo_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_NETHER, DDNames.SHORT_MACAW_OAK_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_nether_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_NETHER, DDNames.SHORT_MACAW_SPRUCE_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_nether_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_NETHER, DDNames.SHORT_MACAW_BIRCH_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_nether_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_NETHER, DDNames.SHORT_MACAW_JUNGLE_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_nether_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_NETHER, DDNames.SHORT_MACAW_ACACIA_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_nether_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_NETHER, DDNames.SHORT_MACAW_DARK_OAK_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_nether_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_NETHER, DDNames.SHORT_MACAW_MANGROVE_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_nether_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_NETHER, DDNames.SHORT_MACAW_CHERRY_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_nether_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_NETHER, DDNames.SHORT_MACAW_BAMBOO_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_nether_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_NETHER, DDNames.SHORT_MACAW_WARPED_NETHER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_nether_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_MYSTIC, DDNames.SHORT_MACAW_OAK_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_mystic_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_MYSTIC, DDNames.SHORT_MACAW_SPRUCE_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_mystic_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_MYSTIC, DDNames.SHORT_MACAW_BIRCH_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_mystic_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_MYSTIC, DDNames.SHORT_MACAW_JUNGLE_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_mystic_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_MYSTIC, DDNames.SHORT_MACAW_ACACIA_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_mystic_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, DDNames.SHORT_MACAW_DARK_OAK_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_mystic_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_MYSTIC, DDNames.SHORT_MACAW_MANGROVE_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_mystic_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_MYSTIC, DDNames.SHORT_MACAW_CHERRY_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_mystic_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_MYSTIC, DDNames.SHORT_MACAW_BAMBOO_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_mystic_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_MYSTIC, DDNames.SHORT_MACAW_CRIMSON_MYSTIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_mystic_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_STORE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "store_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SLIDING_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "sliding_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JAIL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jail_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_HOSPITAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_hospital_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_REINFORCED, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_reinforced_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_WARNING, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_warning_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_METAL_WINDOWED, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_windowed_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_barn_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_barn_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_barn_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stable_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stable_head_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stem_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_STEM_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stem_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_modern_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_modern_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_japanese_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_japanese2_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_classic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_classic_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_cottage_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_paper_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_beach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_beach_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_tropical_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_four_panel_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_swamp_door"));

		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_waffle_door"));

		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_bamboo_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_nether_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_WARPED_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_nether_door"));
		
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_OAK_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_SPRUCE_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BIRCH_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_JUNGLE_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_ACACIA_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_MANGROVE_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CHERRY_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_BAMBOO_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MACAW_CRIMSON_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_mystic_door"));
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_STORE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "store_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SLIDING_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "sliding_glass_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JAIL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jail_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_HOSPITAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_hospital_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_REINFORCED, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_reinforced_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_WARNING, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_warning_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_METAL_WINDOWED, ResourceLocation.fromNamespaceAndPath("mcwdoors", "metal_windowed_door"), "tall_macaw_metal_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BARN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_barn_door"), "tall_macaw_barn_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BARN_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_barn_glass_door"), "tall_macaw_barn_glass_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_STABLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stable_door"), "tall_macaw_stable_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stable_head_door"), "tall_macaw_stable_head_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_stem_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_STEM_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_stem_glass_door"), "tall_macaw_bark_glass_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_GLASS, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_glass_door"), "tall_macaw_glass_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_MODERN, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_modern_door"), "tall_macaw_modern_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_JAPANESE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_japanese_door"), "tall_macaw_japanese_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_JAPANESE2, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_japanese2_door"), "tall_macaw_japanese2_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_CLASSIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_classic_door"), "tall_macaw_classic_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_COTTAGE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_cottage_door"), "tall_macaw_cottage_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_PAPER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_paper_door"), "tall_macaw_paper_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BEACH, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_beach_door"), "tall_macaw_beach_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_TROPICAL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_tropical_door"), "tall_macaw_tropical_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_four_panel_door"), "tall_macaw_four_panel_door");			
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_four_panel_door"), "tall_macaw_four_panel_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_SWAMP, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_swamp_door"), "tall_macaw_swamp_door");

		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_WAFFLE, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_waffle_door"), "tall_macaw_waffle_door");

		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_BAMBOO, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_bamboo_door"), "tall_macaw_bamboo_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_WARPED_NETHER, ResourceLocation.fromNamespaceAndPath("mcwdoors", "warped_nether_door"), "tall_macaw_nether_door");
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_OAK_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "oak_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_SPRUCE_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "spruce_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BIRCH_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "birch_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_JUNGLE_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "jungle_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_ACACIA_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "acacia_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "dark_oak_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_MANGROVE_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "mangrove_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CHERRY_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "cherry_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_BAMBOO_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "bamboo_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MACAW_CRIMSON_MYSTIC, ResourceLocation.fromNamespaceAndPath("mcwdoors", "crimson_mystic_door"), "tall_macaw_mystic_door");
	}
}
