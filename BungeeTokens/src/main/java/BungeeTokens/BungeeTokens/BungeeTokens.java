package BungeeTokens.BungeeTokens;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import API.TokenAPI;
import Droppers.TokenDropper;
import Listeners.CommandListener;
import Listeners.PlayerListena;
import Managers.TokenSQLManager;
import Menus.MainMenu;
import Prefixes.BlameAjoobe;
import Prefixes.BlameGoldie;
import Prefixes.Creature;
import Prefixes.Ferocious;
import Prefixes.Prefixes;
import Prefixes.PrefixesMenu;
import Prefixes.Prince;
import Prefixes.Princess;
import Prefixes.ProBuilder;
import Prefixes.ProPvper;


public class BungeeTokens extends JavaPlugin{

	//public MySQLAPI mySQLAPI = (MySQLAPI) getServer().getPluginManager().getPlugin("MySQLAPI");
	//public static MySQLAPI mySQLAPI = new MySQLAPI();
	public ConnectionPoolManager pool;
	//public SQLManager sqlManager = new SQLManager(mySQLAPI);
	public TokenSQLManager tokenSQLManager;
	public TokenAPI tokenAPI;
	public MainMenu mainMenu;
	public PrefixesMenu prefixesMenu;
	public TokenDropper tokenDropper;
	public List<Prefixes> prefixesArray = new ArrayList<Prefixes>();
	public ItemStack tokenItem;
	
	public HashMap<UUID, Integer> playerTokensHashMap = new HashMap<UUID, Integer>();
	
	@Override
	public void onDisable() {
		  pool.closePool();
		tokenAPI.saveAllPlayersTokens();
	}

	@Override
	public void onEnable() {
		createConfig();
		
		
		//Register Listeners
		pool = new ConnectionPoolManager(this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListena(this), this);
		this.getCommand("tokens").setExecutor(new CommandListener(this));

		tokenSQLManager = new TokenSQLManager(this);
		mainMenu = new MainMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(mainMenu, this);
		tokenAPI = new TokenAPI(this);
		prefixesMenu = new PrefixesMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(prefixesMenu, this);
		tokenDropper = new TokenDropper(this);
		Bukkit.getServer().getPluginManager().registerEvents(tokenDropper, this);
		
		tokenItem = tokenDropper.createToken();
		tokenDropper.randomLocDropToken();
		
		prefixesArray.add(new ProPvper());
		prefixesArray.add(new ProBuilder());
		prefixesArray.add(new BlameGoldie());
		prefixesArray.add(new BlameAjoobe());
		prefixesArray.add(new Prince());
		prefixesArray.add(new Creature());
		prefixesArray.add(new Princess());
		prefixesArray.add(new Ferocious());
		//prefixesArray.add(new Nothing());
		
	}

	 private void createConfig() {
	        try {
	            if (!getDataFolder().exists()) {
	                getDataFolder().mkdirs();
	            }
	            File file = new File(getDataFolder(), "config.yml");
	            if (!file.exists()) {
	                getLogger().info("Config.yml not found, creating!");
	                saveDefaultConfig();
	            } else {
	                getLogger().info("Config.yml found, loading!");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();

	        }

	    }
	

}
