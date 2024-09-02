package com.fizzware.dramaticdoors.forge.addons.framedblocks.client;

import java.util.List;
import java.util.Map;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemOverrides;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import xfacthd.framedblocks.api.model.FramedBlockModel;
import xfacthd.framedblocks.api.model.quad.Modifiers;
import xfacthd.framedblocks.api.model.quad.QuadModifier;
import xfacthd.framedblocks.api.util.Utils;

@SuppressWarnings("deprecation")
public class TallFramedDoorModel extends FramedBlockModel
{
    private final Direction dir;
    private final boolean hingeRight;
    private final boolean open;

    public TallFramedDoorModel(BlockState state, BakedModel baseModel)
    {
        super(state, baseModel);
        dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        hingeRight = state.getValue(BlockStateProperties.DOOR_HINGE) == DoorHingeSide.RIGHT;
        open = state.getValue(BlockStateProperties.OPEN);
    }

    @Override
    protected void transformQuad(Map<Direction, List<BakedQuad>> quadMap, BakedQuad quad)
    {
        Direction faceDir = dir;
        if (open) { faceDir = hingeRight ? faceDir.getCounterClockWise() : faceDir.getClockWise(); }

		Direction quadDir = quad.getDirection();
		if (Utils.isY(quadDir)) {
			QuadModifier.geometry(quad).apply(Modifiers.cutTopBottom(faceDir, 3F / 16F)).export(quadMap.get(quadDir));
		} 
		else {
			if (quadDir == faceDir) {
				QuadModifier.geometry(quad).apply(Modifiers.setPosition(3F / 16F)).export(quadMap.get(null));
			} 
			else {
				QuadModifier.geometry(quad).apply(Modifiers.cutSideLeftRight(faceDir, 3F / 16F)).export(quadMap.get(quadDir));
			}
		}
    }

	
	@Override
	public List<BakedQuad> getQuads(BlockState state, Direction direction, RandomSource random) {
		return baseModel.getQuads(state, direction, random);
	}

	@Override
	public boolean useAmbientOcclusion() {
		return baseModel.useAmbientOcclusion();
	}

	@Override
	public boolean isGui3d() {
		return true;
	}

	@Override
	public boolean usesBlockLight() {
		return baseModel.usesBlockLight();
	}

	@Override
	public boolean isCustomRenderer() {
		return false;
	}

	@Override
	public TextureAtlasSprite getParticleIcon() {
		return baseModel.getParticleIcon();
	}

	@Override
	public ItemOverrides getOverrides() {
		return baseModel.getOverrides();
	}
}