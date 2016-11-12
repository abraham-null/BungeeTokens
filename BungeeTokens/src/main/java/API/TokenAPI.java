package API;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import BungeeTokens.BungeeTokens.BungeeTokens;

public class TokenAPI {

	private BungeeTokens plugin;

	public TokenAPI(BungeeTokens plugin) {
		this.plugin = plugin;
	}

	public void showMenu(Player p) {
		plugin.mainMenu.showMainMenu(p);
	}
	
	public void showPrefixesMenu(Player p) {
		plugin.prefixesMenu.showPrefixMenu(p);
	}

	public int playerTokensFromHashMap(Player p) {
		int playerTokens = 0;
		UUID playerUUID = p.getUniqueId();

		if(plugin.playerTokensHashMap.containsKey(playerUUID)){
			playerTokens = plugin.playerTokensHashMap.get(playerUUID);
		}
		
		return playerTokens;

	}

}
