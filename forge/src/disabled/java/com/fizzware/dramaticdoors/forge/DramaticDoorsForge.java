package com.fizzware.dramaticdoors.forge;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.forge.client.RenderHandler;
import com.fizzware.dramaticdoors.forge.compat.AutomaticDoorCompat;
import com.fizzware.dramaticdoors.forge.compat.QuarkDoubleDoorCompat;
import com.fizzware.dramaticdoors.forge.config.DDConfigForge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(DramaticDoors.MOD_ID)
public class DramaticDoorsForge
{
    public DramaticDoorsForge() {
    	if (ForgeUtils.INSTANCE.isModLoaded("connector")) { // Let Fabric side take over if Sinytra Connector is installed.
    		return;
    	}
    	// Please let this be a normal field trip.
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); 
    	
    	// With the Mr. Fizzware? No freakin' way! Register events for the Magic Forge Bus to take them on an extraordinary trip.
    	Compats.modChecker = ForgeUtils.INSTANCE;
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DDConfigForge.CONFIG);
    	bus.register(DDForgeRegistry.class);
    	bus.register(ForgeUtils.class);
    	bus.register(new DDForgeDeprecationNotice());
    	
        bus.addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) { 
        	bus.addListener(this::setupClient); 
        }
        MinecraftForge.EVENT_BUS.register(DDForgeDeprecationNotice.class);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	if (Compats.AUTOMATIC_DOORS_INSTALLED) {
    		MinecraftForge.EVENT_BUS.register(new AutomaticDoorCompat());
    	}
    	if (Compats.QUARK_INSTALLED) {
    		MinecraftForge.EVENT_BUS.register(new QuarkDoubleDoorCompat());
    	}
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	RenderHandler.onInitializeClient();
    }
}
