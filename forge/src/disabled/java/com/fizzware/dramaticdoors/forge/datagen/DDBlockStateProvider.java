package com.fizzware.dramaticdoors.forge.datagen;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class DDBlockStateProvider extends BlockStateProvider {
	
    public DDBlockStateProvider(PackOutput gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    	// Insert any blocks that need to be data-generated. Example below:
    	//shortDoorBlock(DDBlocks.SHORT_OAK_DOOR, "block/short_oak");
    	//tallDoorBlock(DDBlocks.TALL_OAK_DOOR, "block/tall_oak");
    	shortDoorBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH)), "block/short_birch");
    	tallDoorBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH)), "block/tall_birch");
    }
    
    /*private void tallDoorBlockAlt(Block block, String baseName, String texName) {
    	internalTallDoorBlockAlt((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_lower"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_upper"));
    }*/
    
    private void tallDoorBlock(Block block, String baseName) {
    	internalTallDoorBlock((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_top"));
    }
    
    /*private void shortDoorBlockAlt(Block block, String baseName, String texName) {
    	internalShortDoorBlockAlt((ShortDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_door"));
    }*/
    
    private void shortDoorBlock(Block block, String baseName) {
    	internalShortDoorBlock((ShortDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door"));
    }
    
    /*private void internalTallDoorBlockAlt(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_bottom_left", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile topLeft = models().withExistingParent(baseName + "_top_left", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topLeftOpen = models().withExistingParent(baseName + "_top_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRight = models().withExistingParent(baseName + "_top_right", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRightOpen = models().withExistingParent(baseName + "_top_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        tallDoorBlock(block, bottomLeft, bottomLeftOpen, bottomRight, bottomRightOpen, middleLeft, middleLeftOpen, middleRight, middleRightOpen, topLeft, topLeftOpen, topRight, topRightOpen);
    }*/
    
    private void internalTallDoorBlock(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomLeft = models().withExistingParent(baseName + "_door_bottom_left", ":" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomLeftOpen = models().withExistingParent(baseName + "_door_bottom_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRight = models().withExistingParent(baseName + "_door_bottom_right", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomRightOpen = models().withExistingParent(baseName + "_door_bottom_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        ModelFile middleLeft = models().withExistingParent(baseName + "_door_middle_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleLeftOpen = models().withExistingParent(baseName + "_door_middle_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_left_open").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleRight = models().withExistingParent(baseName + "_door_middle_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile middleRightOpen = models().withExistingParent(baseName + "_door_middle_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_right_open").texture("bottom", middle).texture("middle", middle).texture("top", middle);
        ModelFile topLeft = models().withExistingParent(baseName + "_door_top_left", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topLeftOpen = models().withExistingParent(baseName + "_door_top_left_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_left_open").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRight = models().withExistingParent(baseName + "_door_top_right", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile topRightOpen = models().withExistingParent(baseName + "_door_top_right_open", "" + ModelProvider.BLOCK_FOLDER + "/door_top_right_open").texture("bottom", bottom).texture("middle", middle).texture("top",top);
        tallDoorBlock(block, bottomLeft, bottomLeftOpen, bottomRight, bottomRightOpen, middleLeft, middleLeftOpen, middleRight, middleRightOpen, topLeft, topLeftOpen, topRight, topRightOpen);
    }
    
    private void internalShortDoorBlock(ShortDoorBlock block, String baseName, ResourceLocation tex) {
        ModelFile left = models().withExistingParent(baseName + "_door_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left").texture("texture", tex);
        ModelFile leftOpen = models().withExistingParent(baseName + "_door_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left_open").texture("texture", tex);
        ModelFile right = models().withExistingParent(baseName + "_door_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right").texture("texture", tex);
        ModelFile rightOpen = models().withExistingParent(baseName + "_door_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right_open").texture("texture", tex);
        shortDoorBlock(block, left, leftOpen, right, rightOpen);
    }
    
    /*private void internalShortDoorBlockAlt(ShortDoorBlock block, String baseName, ResourceLocation tex) {
        ModelFile left = models().withExistingParent(baseName + "_door_left", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left").texture("texture", tex);
        ModelFile leftOpen = models().withExistingParent(baseName + "_door_left_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_left_open").texture("texture", tex);
        ModelFile right = models().withExistingParent(baseName + "_door_right", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right").texture("texture", tex);
        ModelFile rightOpen = models().withExistingParent(baseName + "_door_right_open", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_short_right_open").texture("texture", tex);
        shortDoorBlock(block, left, leftOpen, right, rightOpen);
    }*/

    public void tallDoorBlock(TallDoorBlock block, ModelFile bottomLeft, ModelFile bottomLeftOpen, ModelFile bottomRight, ModelFile bottomRightOpen, ModelFile middleLeft, ModelFile middleLeftOpen, ModelFile middleRight, ModelFile middleRightOpen, ModelFile topLeft, ModelFile topLeftOpen, ModelFile topRight, ModelFile topRightOpen) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(TallDoorBlock.FACING).toYRot()) + 90;
            TripleBlockPart third = state.getValue(TallDoorBlock.THIRD);
            boolean right = state.getValue(TallDoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(TallDoorBlock.OPEN);
            if (open) {
                yRot += 90;
            }
            if (right && open) {
                yRot += 180;
            }
            yRot %= 360;

            ModelFile model = null;
            switch(third) {
            	case LOWER:
            	default:
		            if (right && open) {
		                model = bottomRightOpen;
		            } else if (!right && open) {
		                model = bottomLeftOpen;
		            }
		            if (right && !open) {
		                model = bottomRight;
		            } else if (!right && !open) {
		                model = bottomLeft;
		            }
            		break;
            	case MIDDLE:
		            if (right && open) {
		                model = middleRightOpen;
		            } else if (!right && open) {
		                model = middleLeftOpen;
		            }
		            if (right && !open) {
		                model = middleRight;
		            } else if (!right && !open) {
		                model = middleLeft;
		            }
            		break;
            	case UPPER:
		            if (right && open) {
		                model = topRightOpen;
		            } else if (!right && open) {
		                model = topLeftOpen;
		            }
		            if (right && !open) {
		                model = topRight;
		            } else if (!right && !open) {
		                model = topLeft;
		            }
            		break;
            }
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        }, TallDoorBlock.POWERED, TallDoorBlock.WATERLOGGED);
    }
    
    public void shortDoorBlock(ShortDoorBlock block, ModelFile left, ModelFile leftOpen, ModelFile right, ModelFile rightOpen) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(ShortDoorBlock.FACING).toYRot()) + 90;
            boolean isRight = state.getValue(ShortDoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(ShortDoorBlock.OPEN);
            if (open) {
                yRot += 90;
            }
            if (isRight && open) {
                yRot += 180;
            }
            yRot %= 360;

            ModelFile model = null;
            if (isRight) {
                model = open ? rightOpen : right;
            } 
            else {
                model = open ? leftOpen : left;
            }
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        }, ShortDoorBlock.POWERED, TallDoorBlock.WATERLOGGED);
    }
}