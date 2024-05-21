package com.fizzware.dramaticdoors.neoforge.compat;

import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.neoforge.config.DDConfigNF;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.event.level.LevelEvent;

public class QuarkDoubleDoorCompat
{
	protected static boolean hasQuarkDoubleDoor = DDConfigNF.getConfigBooleanValue(DDConfigNF.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
	
    public static boolean hasQuarkDoubleDoorsModule() {
    	if (Compats.QUARK_INSTALLED && hasQuarkDoubleDoor) {
    		return true;
    	}
    	return false;
    }
    
    @SubscribeEvent
	public void onWorldLoad(LevelEvent.Load e) {
    	hasQuarkDoubleDoor = DDConfigNF.getConfigBooleanValue(DDConfigNF.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
    }
    
    @SubscribeEvent
    public void onConfigChange(ModConfigEvent.Reloading e) {
    	hasQuarkDoubleDoor = DDConfigNF.getConfigBooleanValue(DDConfigNF.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");    	
    }
}
