package com.fizzware.dramaticdoors.forge.addons.blockcarpentry;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

import com.mojang.datafixers.util.Pair;
import mod.pianomanu.blockcarpentry.bakedmodels.FrameBakedModel;
import net.minecraft.client.renderer.block.model.ItemOverrides;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraftforge.client.model.geometry.IGeometryBakingContext;
import net.minecraftforge.client.model.geometry.IUnbakedGeometry;


public class TallIllusionDoorModelGeometry implements IUnbakedGeometry<TallIllusionDoorModelGeometry>
{
	@Override
	public BakedModel bake(IGeometryBakingContext context, ModelBakery bakery, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState, ItemOverrides overrides, ResourceLocation modelLocation) {
		return new TallIllusionDoorBakedModel();
	}

	@Override
	public Collection<Material> getMaterials(IGeometryBakingContext context, Function<ResourceLocation, UnbakedModel> modelGetter, Set<Pair<String, String>> missingTextureErrors) {
		return Collections.singletonList(new Material(InventoryMenu.BLOCK_ATLAS, FrameBakedModel.TEXTURE));
	}
}
