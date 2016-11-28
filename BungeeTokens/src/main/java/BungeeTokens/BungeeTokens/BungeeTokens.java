package BungeeTokens.BungeeTokens;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import com.dsh105.echopet.api.EchoPetAPI;

import API.TokenAPI;
import Disguises.BatDisguise;
import Disguises.Disguises;
import Disguises.DisguisesMenu;
import Droppers.TokenDropper;
import Listeners.CommandListener;
import Listeners.PlayerListena;
import Managers.TokenSQLManager;
import Menus.MainMenu;
import Particles.Angry;
import Particles.Ender;
import Particles.Heart;
import Particles.Magic;
import Particles.Particles;
import Particles.ParticlesMenu;
import Particles.Slime;
import Pets.Bat;
import Pets.Blaze;
import Pets.Enderdragon;
import Pets.Pets;
import Pets.PetsMenu;
import Prefixes.BlameAjoobe;
import Prefixes.BlameGoldie;
import Prefixes.Creature;
import Prefixes.Demigod;
import Prefixes.Demon;
import Prefixes.Ferocious;
import Prefixes.God;
import Prefixes.King;
import Prefixes.Pikachu;
import Prefixes.Prefixes;
import Prefixes.PrefixesMenu;
import Prefixes.Prince;
import Prefixes.Princess;
import Prefixes.ProBuilder;
import Prefixes.ProPvper;
import Prefixes.Queen;


public class BungeeTokens extends JavaPlugin{

	//public MySQLAPI mySQLAPI = (MySQLAPI) getServer().getPluginManager().getPlugin("MySQLAPI");
	//public static MySQLAPI mySQLAPI = new MySQLAPI();
	public ConnectionPoolManager pool;
	//public SQLManager sqlManager = new SQLManager(mySQLAPI);
	public TokenSQLManager tokenSQLManager;
	public TokenAPI tokenAPI;
	public MainMenu mainMenu;
	public PrefixesMenu prefixesMenu;
	public ParticlesMenu particlesMenu;
	public PetsMenu petsMenu;
	public DisguisesMenu disguisesMenu;
	public TokenDropper tokenDropper;
	public List<Prefixes> prefixesArray = new ArrayList<Prefixes>();
	public List<Particles> particlesArray = new ArrayList<Particles>();
	public List<Pets> petsArray = new ArrayList<Pets>();
	public List<Disguises> disguisesArray = new ArrayList<Disguises>();
	public ItemStack tokenItem;
	//public DisguiseAPI disguiseApi;
	
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
		particlesMenu = new ParticlesMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(particlesMenu, this);
		petsMenu = new PetsMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(petsMenu, this);
		disguisesMenu = new DisguisesMenu(this);
		Bukkit.getServer().getPluginManager().registerEvents(disguisesMenu, this);
		tokenDropper = new TokenDropper(this);
		Bukkit.getServer().getPluginManager().registerEvents(tokenDropper, this);
		//disguiseApi = getServer().getServicesManager().getRegistration(DisguiseAPI.class).getProvider();
		
		tokenItem = tokenDropper.createToken();
		tokenDropper.randomLocDropToken();
		
		//-----------
		//PREFIXES
		//-----------
		prefixesArray.add(new ProPvper());
		prefixesArray.add(new ProBuilder());
		prefixesArray.add(new BlameGoldie());
		prefixesArray.add(new BlameAjoobe());
		prefixesArray.add(new Prince());
		prefixesArray.add(new Creature());
		prefixesArray.add(new Princess());
		prefixesArray.add(new Ferocious());
		prefixesArray.add(new Demon());
		prefixesArray.add(new Queen());
		prefixesArray.add(new King());
		prefixesArray.add(new Demigod());
		prefixesArray.add(new God());
		prefixesArray.add(new Pikachu());
		//prefixesArray.add(new Nothing());
		
		
		//-----------
		//PARTICLES
		//----------
		particlesArray.add(new Slime());
		particlesArray.add(new Heart());
		particlesArray.add(new Angry());
		particlesArray.add(new Magic());
		particlesArray.add(new Ender());
		

		//-----------
		//PARTICLES
		//----------
		petsArray.add(new Bat());
		petsArray.add(new Blaze());
		petsArray.add(new Enderdragon());
		
		
		//-----------
		//DISGUISES
		//----------
		disguisesArray.add(new BatDisguise());
		
		
	}
	
	public EchoPetAPI getEchoPetAPI() {
	    return EchoPetAPI.getAPI();
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
