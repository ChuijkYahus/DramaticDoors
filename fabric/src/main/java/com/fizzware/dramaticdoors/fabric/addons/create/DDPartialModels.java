/*package com.fizzware.dramaticdoors.fabric.addons.create;

import java.util.HashMap;
import java.util.Map;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.jozufozu.flywheel.core.PartialModel;
import com.simibubi.create.foundation.utility.Couple;

import net.minecraft.resources.ResourceLocation;

public class DDPartialModels
{
	public static final Map<ResourceLocation, Couple<PartialModel>> TALL_FOLDING_DOORS = new HashMap<>();
	
	public static void putFoldingDoor(String blockName, String path) {
		TALL_FOLDING_DOORS.put(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, blockName), Couple.create(block(path + "_fold_left"), block(path + "_fold_right")));
	}
	
	private static PartialModel block(String path) {
		return new PartialModel(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "block/" + path));
	}
}
*/