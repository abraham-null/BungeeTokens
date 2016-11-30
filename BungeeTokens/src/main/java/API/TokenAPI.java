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
	
	public void saveAllPlayersTokens() {
		
		for(Player p : Bukkit.getServer().getOnlinePlayers()) {
			int playerTokens = 0;
			UUID playerUUID = p.getUniqueId();
			String playerUUIDString = p.getUniqueId().toString();
			
			playerTokens = plugin.playerTokensHashMap.get(playerUUID);
			plugin.tokenSQLManager.setTokens(playerUUIDString, playerTokens);
			plugin.playerTokensHashMap.remove(playerUUID);
			}
	}
	
	public void setPlayerTokenHashMap(Player p, int amount){
		UUID playerUUID = p.getUniqueId();
		plugin.playerTokensHashMap.put(playerUUID, amount);
	
	}

	public void removePlayerTokensFromHashMap(Player p, int amount) {
		int playerTokens = 0;
		UUID playerUUID = p.getUniqueId();

		playerTokens = playerTokensFromHashMap(p);
		playerTokens = (playerTokens - amount);
		
		setPlayerTokenHashMap(p, playerTokens);
	}
	
	public void addPlayerTokensFromHashMap(Player p, int amount) {
		int playerTokens = 0;
		UUID playerUUID = p.getUniqueId();

		playerTokens = playerTokensFromHashMap(p);
		playerTokens = (playerTokens + amount);
		
		setPlayerTokenHashMap(p, playerTokens);
	}
	
	
}
