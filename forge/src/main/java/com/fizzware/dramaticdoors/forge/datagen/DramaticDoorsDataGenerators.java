package com.fizzware.dramaticdoors.forge.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DramaticDoors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DramaticDoorsDataGenerators {
    private DramaticDoorsDataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(true, new DDBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(true, new DDItemModelProvider(gen, existingFileHelper));
        gen.addProvider(true, new DDRecipeProvider(gen));
        gen.addProvider(true, new DDLootTableProvider(gen));
    }
}