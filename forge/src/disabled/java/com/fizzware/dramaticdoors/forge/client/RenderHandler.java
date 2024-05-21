package com.fizzware.dramaticdoors.forge.client;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DDNames;
import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class RenderHandler
{
	public static final ImmutableList<String> TRANSLUCENT_DOORS = ImmutableList.of(DDNames.SHORT_BYG_EMBUR, DDNames.SHORT_BYG_ETHER, DDNames.SHORT_BYG_MAPLE, DDNames.SHORT_BYG_REDWOOD, DDNames.SHORT_BYG_SKYRIS, DDNames.SHORT_BYG_SOUL_SHROOM, DDNames.SHORT_BOP_MAGIC, DDNames.SHORT_MORECRAFT_GLASS, DDNames.SHORT_MORECRAFT_SOUL_GLASS,
			DDNames.SHORT_MS_GLASS, DDNames.SHORT_MS_SOUL_GLASS, DDNames.SHORT_MS_TINTED_GLASS, DDNames.SHORT_MS_BLACK_GLASS, DDNames.SHORT_MS_GREY_GLASS, DDNames.SHORT_MS_LIGHT_GREY_GLASS, DDNames.SHORT_MS_WHITE_GLASS, DDNames.SHORT_MS_RED_GLASS, DDNames.SHORT_MS_ORANGE_GLASS, DDNames.SHORT_MS_YELLOW_GLASS, DDNames.SHORT_MS_LIME_GLASS, DDNames.SHORT_MS_GREEN_GLASS, DDNames.SHORT_MS_CYAN_GLASS, DDNames.SHORT_MS_BLUE_GLASS, DDNames.SHORT_MS_PURPLE_GLASS, DDNames.SHORT_MS_MAGENTA_GLASS, DDNames.SHORT_MS_PINK_GLASS, DDNames.SHORT_MS_LIGHT_BLUE_GLASS, DDNames.SHORT_MS_BROWN_GLASS, 
			DDNames.TALL_BYG_EMBUR, DDNames.TALL_BYG_ETHER, DDNames.TALL_BYG_MAPLE, DDNames.TALL_BYG_REDWOOD, DDNames.TALL_BYG_SKYRIS, DDNames.TALL_BYG_SOUL_SHROOM, DDNames.TALL_BOP_MAGIC, DDNames.TALL_MORECRAFT_GLASS, DDNames.TALL_MORECRAFT_SOUL_GLASS, 
			DDNames.TALL_MS_GLASS, DDNames.TALL_MS_SOUL_GLASS, DDNames.TALL_MS_TINTED_GLASS, DDNames.TALL_MS_BLACK_GLASS, DDNames.TALL_MS_GREY_GLASS, DDNames.TALL_MS_LIGHT_GREY_GLASS, DDNames.TALL_MS_WHITE_GLASS, DDNames.TALL_MS_RED_GLASS, DDNames.TALL_MS_ORANGE_GLASS, DDNames.TALL_MS_YELLOW_GLASS, DDNames.TALL_MS_LIME_GLASS, DDNames.TALL_MS_GREEN_GLASS, DDNames.TALL_MS_CYAN_GLASS, DDNames.TALL_MS_BLUE_GLASS, DDNames.TALL_MS_PURPLE_GLASS, DDNames.TALL_MS_MAGENTA_GLASS, DDNames.TALL_MS_PINK_GLASS, DDNames.TALL_MS_LIGHT_BLUE_GLASS, DDNames.TALL_MS_BROWN_GLASS);
	
	@SuppressWarnings("deprecation")
	public static void onInitializeClient() {
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (TRANSLUCENT_DOORS.contains(pair.getA())) {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.translucent());
			}
			else {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.cutout());
			}
		}
	}
}
