package com.fizzware.dramaticdoors.forge.compat;

import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.forge.config.DDConfigForge;

import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.loading.FMLPaths;

public class QuarkDoubleDoorCompat
{
	protected static boolean hasQuarkDoubleDoor = DDConfigForge.getConfigBooleanValue(DDConfigForge.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
	
    public static boolean hasQuarkDoubleDoorsModule() {
    	if (Compats.QUARK_INSTALLED && hasQuarkDoubleDoor) {
    		return true;
    	}
    	return false;
    }
    
    public static void updateQuarkConfig() {
    	hasQuarkDoubleDoor = DDConfigForge.getConfigBooleanValue(DDConfigForge.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
    }
    
    @SubscribeEvent
	public void onWorldLoad(LevelEvent.Load e) {
    	updateQuarkConfig();
    }
    
    @SubscribeEvent
    public void onConfigChange(ModConfigEvent.Reloading e) {
    	updateQuarkConfig();  	
    }
}
