package com.fizzware.dramaticdoors.neoforge.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.registry.DDNames;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DDItemModelProvider extends ItemModelProvider
{
    public DDItemModelProvider(PackOutput gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

	@Override
	protected void registerModels() {
		// Insert any items that needs to be data-generated. Example below:
		//super.basicItem(DDItems.SHORT_OAK_DOOR);
		super.basicItem(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE)));
	}
}
