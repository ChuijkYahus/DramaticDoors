package com.fizzware.dramaticdoors.forge.addons.framedblocks.client;

import java.util.List;
import java.util.Map;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xfacthd.framedblocks.api.util.FramedProperties;
import xfacthd.framedblocks.api.util.client.ClientUtils;

public class DDFramedBlocksClient
{
	protected static final RegistryObject<Block> TALL_FRAMED_DOOR_REGISTRY = RegistryObject.create(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FRAMED), ForgeRegistries.BLOCKS);
	protected static final RegistryObject<Block> TALL_FRAMED_IRON_DOOR_REGISTRY = RegistryObject.create(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FRAMED_IRON), ForgeRegistries.BLOCKS);
	
	public static void loadModels(final ModelEvent.BakingCompleted event) {
		Map<ResourceLocation, BakedModel> registry = event.getModels();
		
		ClientUtils.replaceModels(TALL_FRAMED_DOOR_REGISTRY, registry, TallFramedDoorModel::new, List.of(FramedProperties.SOLID, FramedProperties.GLOWING));
		ClientUtils.replaceModels(TALL_FRAMED_IRON_DOOR_REGISTRY, registry, TallFramedIronDoorModel::new, List.of(FramedProperties.SOLID, FramedProperties.GLOWING));
	}
}
