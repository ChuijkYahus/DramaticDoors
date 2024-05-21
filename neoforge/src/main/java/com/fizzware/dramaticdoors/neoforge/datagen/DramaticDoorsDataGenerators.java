package com.fizzware.dramaticdoors.neoforge.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = DramaticDoors.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class DramaticDoorsDataGenerators 
{
    private DramaticDoorsDataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        gen.addProvider(true, new DDBlockStateProvider(output, existingFileHelper));
        gen.addProvider(true, new DDItemModelProvider(output, existingFileHelper));
    }
}