package com.fizzware.dramaticdoors.forge.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
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
        PackOutput output = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        gen.addProvider(true, new DDBlockStateProvider(output, existingFileHelper));
        gen.addProvider(true, new DDItemModelProvider(output, existingFileHelper));
        //gen.addProvider(true, new DDLootTableProvider(output, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(DDBlockLoot::new, LootContextParamSets.BLOCK))));
    }
}