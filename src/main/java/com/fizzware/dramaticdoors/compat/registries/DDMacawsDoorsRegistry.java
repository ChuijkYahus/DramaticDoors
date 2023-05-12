package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDMacawsDoorsRegistry
{
	// For Every Compat.
	public static final Block TALL_MACAW_OAK_BARN_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_barn_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_BARN_GLASS_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_barn_glass_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_STABLE_DOOR = new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_stable_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_stable_head_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_BARK_GLASS_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_bark_glass_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_GLASS_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_glass_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_MODERN_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_modern_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_JAPANESE_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_japanese_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_JAPANESE2_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_japanese2_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_CLASSIC_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_classic_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_OAK_COTTAGE_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_cottage_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_PAPER_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_paper_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_BEACH_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_beach_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_TROPICAL_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_tropical_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_FOUR_PANEL_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_four_panel_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_SWAMP_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_swamp_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_BAMBOO_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_bamboo_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_NETHER_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_nether_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_OAK_MYSTIC_DOOR = new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "oak_mystic_door")), BlockSetType.OAK);
	
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "store_door")), BlockSetType.IRON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "sliding_glass_door")), BlockSetType.IRON));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jail_door")), BlockSetType.IRON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "metal_door")), BlockSetType.IRON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "metal_hospital_door")), BlockSetType.IRON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "metal_reinforced_door")), BlockSetType.IRON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "metal_warning_door")), BlockSetType.IRON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "metal_windowed_door")), BlockSetType.IRON));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), TALL_MACAW_OAK_BARN_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_barn_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_barn_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_barn_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_barn_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_barn_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_barn_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_barn_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_barn_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), TALL_MACAW_OAK_BARN_GLASS_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_barn_glass_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_barn_glass_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_barn_glass_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_barn_glass_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_barn_glass_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_barn_glass_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_barn_glass_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), TALL_MACAW_OAK_STABLE_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_stable_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_stable_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_stable_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_stable_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_stable_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_stable_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stable_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_stable_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), TALL_MACAW_OAK_STABLE_HEAD_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_stable_head_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_stable_head_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_stable_head_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_stable_head_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_head_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_stable_head_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stable_head_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_stable_head_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), TALL_MACAW_OAK_BARK_GLASS_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_bark_glass_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_bark_glass_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_bark_glass_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_bark_glass_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_bark_glass_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stem_glass_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_stem_glass_door")), BlockSetType.WARPED));
	
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), TALL_MACAW_OAK_GLASS_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_glass_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_glass_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_glass_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_glass_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_glass_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_glass_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_glass_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_glass_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_glass_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), TALL_MACAW_OAK_MODERN_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_modern_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_modern_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_modern_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_modern_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_modern_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_modern_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_modern_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_modern_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_modern_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), TALL_MACAW_OAK_JAPANESE_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_japanese_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_japanese_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_japanese_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_japanese_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_japanese_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_japanese_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_japanese_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_japanese_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), TALL_MACAW_OAK_JAPANESE2_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_japanese2_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_japanese2_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_japanese2_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_japanese2_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese2_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_japanese2_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_japanese2_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), new TallSlidingDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_japanese2_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), TALL_MACAW_SPRUCE_CLASSIC_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_classic_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_classic_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_classic_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_classic_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_classic_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_classic_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_classic_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_classic_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), TALL_MACAW_OAK_COTTAGE_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_cottage_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_cottage_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_cottage_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_cottage_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_cottage_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_cottage_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_cottage_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_cottage_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), TALL_MACAW_OAK_PAPER_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_paper_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_paper_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_paper_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_paper_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_paper_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_paper_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_paper_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_paper_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), TALL_MACAW_OAK_BEACH_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_beach_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_beach_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_beach_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_beach_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_beach_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_beach_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_beach_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_beach_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), TALL_MACAW_OAK_TROPICAL_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_tropical_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_tropical_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_tropical_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_tropical_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_tropical_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_tropical_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_tropical_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_tropical_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), TALL_MACAW_OAK_FOUR_PANEL_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_four_panel_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_four_panel_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_four_panel_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_four_panel_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_four_panel_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_four_panel_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_four_panel_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_four_panel_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), TALL_MACAW_OAK_SWAMP_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_swamp_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_swamp_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_swamp_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_swamp_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_swamp_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_swamp_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_swamp_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_swamp_door")), BlockSetType.WARPED));
	
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO), TALL_MACAW_OAK_BAMBOO_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_bamboo_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_bamboo_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_bamboo_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_bamboo_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_bamboo_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_bamboo_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_bamboo_door")), BlockSetType.CRIMSON));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_bamboo_door")), BlockSetType.WARPED));
	
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), TALL_MACAW_OAK_NETHER_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_nether_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_nether_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_nether_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_nether_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_nether_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_nether_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_nether_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "warped_nether_door")), BlockSetType.WARPED));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), TALL_MACAW_OAK_MYSTIC_DOOR);
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "spruce_mystic_door")), BlockSetType.SPRUCE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "birch_mystic_door")), BlockSetType.BIRCH));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "jungle_mystic_door")), BlockSetType.JUNGLE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "acacia_mystic_door")), BlockSetType.ACACIA));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_mystic_door")), BlockSetType.DARK_OAK));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_mystic_door")), BlockSetType.MANGROVE));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_mystic_door")), BlockSetType.BAMBOO));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("mcwdoors", "crimson_mystic_door")), BlockSetType.CRIMSON));

		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS)), DDItems.PROPERTIES));    

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS)), DDItems.PROPERTIES));
    
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP)), DDItems.PROPERTIES));
    
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO)), DDItems.PROPERTIES));
    
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER)), DDItems.PROPERTIES));

			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC)), DDItems.PROPERTIES));
			helper.register(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC)), DDItems.PROPERTIES));

		});
	}
}
