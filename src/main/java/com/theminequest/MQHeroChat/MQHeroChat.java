package com.theminequest.MQHeroChat;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.theminequest.MineQuest.API.*;
import com.dthielke.herochat.*;

public class MQHeroChat extends JavaPlugin{

	
	public static MQHeroChat activePlugin = null;
	
	@Override
	public void onEnable() {
		if (getServer().getPluginManager().getPlugin("MineQuest") == null) {
			getServer().getLogger().severe("============= MineQuest-HeroChat =============");
			getServer().getLogger().severe("MineQuest is required for MQHeroChat to operate!");
			getServer().getLogger().severe("Please install MineQuest first!");
			getServer().getLogger().severe("You can find the latest version here:");
			getServer().getLogger().severe("http://dev.bukkit.org/server-mods/minequest/");
			getServer().getLogger().severe("==============================================");
			setEnabled(false);
			return;
		}
		
		if (getServer().getPluginManager().getPlugin("Herochat") == null) {
			getServer().getLogger().severe("============= MineQuest-HeroChat =============");
			getServer().getLogger().severe("HeroChat is required for MQHeroChat to operate!");
			getServer().getLogger().severe("Please install HeroChat first!");
			getServer().getLogger().severe("You can find the latest version here:");
			getServer().getLogger().severe("http://dev.bukkit.org/server-mods/herochat/");
			getServer().getLogger().severe("==============================================");
			setEnabled(false);
			return;
		}
		
	}
	
	/** 
	 * Remove all parties still active durring shutdown. 
	 */
	@Override
	public void onDisable() {
		
	}
	
	/**
	 * Check for active party for player.
	 * @param e
	 */
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		
	}
}
