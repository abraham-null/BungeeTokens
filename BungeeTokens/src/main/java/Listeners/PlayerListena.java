package Listeners;

import java.util.UUID;

import org.bukkit.DyeColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import BungeeTokens.BungeeTokens.BungeeTokens;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;

public class PlayerListena implements Listener {

	public final BungeeTokens plugin;

	public PlayerListena(BungeeTokens plugin) {
		this.plugin = plugin;
	}

	/*
	 * Set hashmap for player joining
	 * 
	 */
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		UUID playerUUID = p.getUniqueId();
		String playerUUIDString = p.getUniqueId().toString();
		int playerTokens = plugin.tokenSQLManager.getPlayerTokens(playerUUIDString);

		/*plugin.playerTokensHashMap.put(playerUUID, playerTokens);
		// EchoPetAPI.getAPI().givePet(p,PetType.BLAZE, true)
		SheepDisguise disguise = (SheepDisguise) DisguiseType.SHEEP.newInstance(); // creating
																					// a
																					// new
																					// instance
		disguise.setColor(DyeColor.BLACK); // the sheep will be black
		disguise.setAdult(false); // the sheep will be a baby
		disguise.setCustomName(p.getDisplayName());
		
		plugin.disguiseApi.disguiseToAll(p, disguise);*/
		MobDisguise mobDisguise = new MobDisguise(DisguiseType.COW, false);
	DisguiseAPI.disguiseToAll(p, mobDisguise);
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

		if (plugin.playerTokensHashMap.containsKey(playerUUID)) {
			int playerTokens = plugin.playerTokensHashMap.get(playerUUID);
			plugin.tokenSQLManager.setTokens(playerUUIDString, playerTokens);
			plugin.playerTokensHashMap.remove(playerUUID);
		}

	}

}
