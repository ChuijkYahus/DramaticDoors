package com.fizzware.dramaticdoors.forge.client;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.client.SpecialDoorRenderList;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
	}
}
