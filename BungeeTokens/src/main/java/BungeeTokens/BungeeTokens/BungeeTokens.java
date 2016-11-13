package BungeeTokens.BungeeTokens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import API.TokenAPI;
import Listeners.PlayerListener;
import Managers.TokenSQLManager;
import Menus.MainMenu;
import Prefixes.BlameGoldie;
import Prefixes.Prefixes;
import Prefixes.PrefixesMenu;
import Prefixes.ProBuilder;
import Prefixes.ProPvper;
import abraham.MySQLAPI;
import abraham.SQLManager;


public class BungeeTokens extends JavaPlugin{

	public MySQLAPI mySQLAPI = (MySQLAPI) getServer().getPluginManager().getPlugin("MySQLAPI");
	public SQLManager sqlManager = new SQLManager(mySQLAPI);
	public TokenSQLManager tokenSQLManager;
	public TokenAPI tokenAPI;
	public MainMenu mainMenu;
	public PrefixesMenu prefixesMenu;
	public List<Prefixes> prefixesArray = new ArrayList<Prefixes>();
	
	public HashMap<UUID, Integer> playerTokensHashMap = new HashMap<UUID, Integer>();
	
	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() {
		
		
		//Register Listeners
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
		

		tokenSQLManager = new TokenSQLManager(this);
		mainMenu = new MainMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(mainMenu, this);
		tokenAPI = new TokenAPI(this);
		prefixesMenu = new PrefixesMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(prefixesMenu, this);
		
		
		prefixesArray.add(new ProPvper());
		prefixesArray.add(new ProBuilder());
		prefixesArray.add(new BlameGoldie());
		
	}

	
	

}
