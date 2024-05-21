package com.fizzware.dramaticdoors.forge;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DDForgeDeprecationNotice
{
	// Forge support is being phased out.
	
	// Stage 1: Just display a message. 1.20.2.
	// Stage 2: Disable short doors. 1.20.3.
	// Stage 3: Disable mod compats. 1.20.4+.
	// Final stage: Completely remove Forge support. 1.21+
	
	private static boolean hasDisplayed = false; 
	
	@SubscribeEvent
	public static void playerEntersWorldMessage(final EntityJoinLevelEvent event) {
		if (event.getEntity() instanceof Player && event.getLevel().isClientSide() && !hasDisplayed) {
			hasDisplayed = true;
			Player player = (Player)event.getEntity();
			player.displayClientMessage(Component.translatable("messages.dramaticdoors.forge_deprecation_notice"), false);
		}
	}
}
