package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BloomingNatureCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_ASPEN, DDNames.SHORT_BN_ASPEN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "aspen_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_BAOBAB, DDNames.SHORT_BN_BAOBAB, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "baobab_door")), BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_CHESTNUT, DDNames.SHORT_BN_CHESTNUT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "chestnut_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_EBONY, DDNames.SHORT_BN_EBONY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "ebony_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_FAN_PALM, DDNames.SHORT_BN_FAN_PALM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "fan_palm_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_FIR, DDNames.SHORT_BN_FIR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "fir_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_LARCH, DDNames.SHORT_BN_LARCH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "larch_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_SWAMP_CYPRESS, DDNames.SHORT_BN_SWAMP_CYPRESS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_SWAMP_OAK, DDNames.SHORT_BN_SWAMP_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("bloomingnature", "oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_ASPEN, ResourceLocation.fromNamespaceAndPath("bloomingnature", "aspen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_BAOBAB, ResourceLocation.fromNamespaceAndPath("bloomingnature", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_CHESTNUT, ResourceLocation.fromNamespaceAndPath("bloomingnature", "chestnut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_EBONY, ResourceLocation.fromNamespaceAndPath("bloomingnature", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_FAN_PALM, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fan_palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_FIR, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_LARCH, ResourceLocation.fromNamespaceAndPath("bloomingnature", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_SWAMP_OAK, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_ASPEN, ResourceLocation.fromNamespaceAndPath("bloomingnature", "aspen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_BAOBAB, ResourceLocation.fromNamespaceAndPath("bloomingnature", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_CHESTNUT, ResourceLocation.fromNamespaceAndPath("bloomingnature", "chestnut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_EBONY, ResourceLocation.fromNamespaceAndPath("bloomingnature", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_FAN_PALM, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fan_palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_FIR, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_LARCH, ResourceLocation.fromNamespaceAndPath("bloomingnature", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_SWAMP_OAK, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_ASPEN, ResourceLocation.fromNamespaceAndPath("bloomingnature", "aspen_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_BAOBAB, ResourceLocation.fromNamespaceAndPath("bloomingnature", "baobab_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_CHESTNUT, ResourceLocation.fromNamespaceAndPath("bloomingnature", "chestnut_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_EBONY, ResourceLocation.fromNamespaceAndPath("bloomingnature", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_FAN_PALM, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fan_palm_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_FIR, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fir_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_LARCH, ResourceLocation.fromNamespaceAndPath("bloomingnature", "larch_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_SWAMP_OAK, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_ASPEN, ResourceLocation.fromNamespaceAndPath("bloomingnature", "aspen_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_BAOBAB, ResourceLocation.fromNamespaceAndPath("bloomingnature", "baobab_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_CHESTNUT, ResourceLocation.fromNamespaceAndPath("bloomingnature", "chestnut_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_EBONY, ResourceLocation.fromNamespaceAndPath("bloomingnature", "ebony_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_FAN_PALM, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fan_palm_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_FIR, ResourceLocation.fromNamespaceAndPath("bloomingnature", "fir_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_LARCH, ResourceLocation.fromNamespaceAndPath("bloomingnature", "larch_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_cypress_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_SWAMP_OAK, ResourceLocation.fromNamespaceAndPath("bloomingnature", "swamp_oak_door"), "tall_letsdo_wooden_door");
	}
}
