package com.fizzware.dramaticdoors.fabric.client;

import com.fizzware.dramaticdoors.client.SpecialDoorRenderList;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class RenderHandler implements ClientModInitializer
{
	@Override
	public void onInitializeClient() {
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (SpecialDoorRenderList.TRANSLUCENT_DOORS.contains(pair.getA())) {
				BlockRenderLayerMap.INSTANCE.putBlock(pair.getB(), RenderType.translucent());
			}
			else {
				BlockRenderLayerMap.INSTANCE.putBlock(pair.getB(), RenderType.cutout());
			}
		}
		/*if (FabricUtils.INSTANCE.isModLoaded("create")) {
	    	DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_ANDESITE, "create/tall_andesite_door");
	    	DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_COPPER, "create/tall_copper_door");
			BlockEntityRenderers.register(CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, TallSlidingDoorBlockRenderer::new);
		}*/
	}
}
