package Listeners;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.dsh105.echopet.api.EchoPetAPI;
import com.dsh105.echopet.compat.api.entity.PetType;
import com.dsh105.echopet.compat.nms.v1_11_R1.entity.type.EntityBatPet;

import BungeeTokens.BungeeTokens.BungeeTokens;
import me.kvq.plugin.trails.API.SuperTrailsAPI;

public class PlayerListena implements Listener{
	
    public final BungeeTokens plugin;

    public PlayerListena(BungeeTokens plugin) {
        this.plugin = plugin;
    }
	
    /*
     * Set hashmap for player joining
     * 
     */
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		UUID playerUUID = p.getUniqueId();
		String playerUUIDString = p.getUniqueId().toString();
		int playerTokens = plugin.tokenSQLManager.getPlayerTokens(playerUUIDString);
		
		plugin.playerTokensHashMap.put(playerUUID, playerTokens);
		//EchoPetAPI.getAPI().givePet(p,PetType.BLAZE, true);
	}

    /*
     * remove player from hashmap on quit
     * 
     */
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		UUID playerUUID = p.getUniqueId();
		String playerUUIDString = p.getUniqueId().toString();
		
		if(plugin.playerTokensHashMap.containsKey(playerUUID)){
			int playerTokens = plugin.playerTokensHashMap.get(playerUUID);
			plugin.tokenSQLManager.setTokens(playerUUIDString, playerTokens);
			plugin.playerTokensHashMap.remove(playerUUID);
		}
		
	}

}
