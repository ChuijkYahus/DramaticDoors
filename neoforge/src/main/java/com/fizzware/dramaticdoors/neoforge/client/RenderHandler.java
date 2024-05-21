package com.fizzware.dramaticdoors.neoforge.client;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.client.SpecialDoorRenderList;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class RenderHandler
{
	@SuppressWarnings("deprecation")
	public static void onInitializeClient() {
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (SpecialDoorRenderList.TRANSLUCENT_DOORS.contains(pair.getA())) {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.translucent());
			}
			else {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.cutout());
			}
		}
		/*if (NeoforgeUtils.INSTANCE.isModLoaded("create")) {
			DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_ANDESITE, "create/tall_andesite_door");
			DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_COPPER, "create/tall_copper_door");
			BlockEntityRenderers.register(CreateForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, TallSlidingDoorBlockRenderer::new);
		}*/
	}
}
