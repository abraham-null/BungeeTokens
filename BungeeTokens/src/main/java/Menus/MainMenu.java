package Menus;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import BungeeTokens.BungeeTokens.BungeeTokens;
import Managers.TokenSQLManager;

public class MainMenu implements Listener {

	private BungeeTokens plugin;
	private String title = ChatColor.DARK_AQUA + "Token Shop";
	private int size = 54;
	private Inventory inv;

	public MainMenu(BungeeTokens plugin) {
		this.plugin = plugin;
	}

	public void showMainMenu(Player p) {

		inv = Bukkit.createInventory(null, size, title);
		inv.setItem(4, createPlayerTokenItemStack(p));

		// particles
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.GRAY.toString() + "Buy particle effects to");
		lore.add(ChatColor.GRAY.toString() + "show off to your friends!");
		lore.add("");
		lore.add(ChatColor.YELLOW.toString() + "Applys to all servers and lasts forever!");
		lore.add("");
		lore.add(ChatColor.GRAY + "Access with " + ChatColor.AQUA + "/particles");
		inv.setItem(29, createMainMenuTokenItemStack(Material.FIREBALL, ChatColor.AQUA.toString() + "Particles", lore));
		lore.clear();

		// titles
		lore.clear();
		lore.add("");
		lore.add(ChatColor.GRAY.toString() + "Unlock prefixes in front");
		lore.add(ChatColor.GRAY.toString() + "of your name!");
		lore.add("");
		lore.add(ChatColor.YELLOW.toString() + "Applys to all servers and lasts forever!");
		lore.add("");
		lore.add(ChatColor.GRAY + "Access with " + ChatColor.AQUA + "/titles");
		inv.setItem(31, createMainMenuTokenItemStack(Material.NAME_TAG, ChatColor.AQUA.toString() + "Titles", lore));
		lore.clear();

		// pets
		lore.clear();
		lore.add("");
		lore.add(ChatColor.GRAY.toString() + "Unlock a new sidekick or");
		lore.add(ChatColor.GRAY.toString() + "best friend by your side!");
		lore.add("");
		lore.add(ChatColor.YELLOW.toString() + "Applys to all servers and lasts forever!");
		lore.add("");
		lore.add(ChatColor.GRAY + "Access with " + ChatColor.AQUA + "/pets");
		inv.setItem(33, createMainMenuTokenItemStack(Material.EGG, ChatColor.AQUA.toString() + "Pets", lore));
		lore.clear();

		p.openInventory(inv);
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getCurrentItem() == null || e.getInventory() == null){
			return;
		}
		
		if (e.getClickedInventory().equals(inv)) {
			e.setCancelled(true);
			

			if (e.getCurrentItem().getType() == Material.FIREBALL){
				
			}

			if (e.getCurrentItem().getType() == Material.NAME_TAG){
				p.openInventory(plugin.prefixesMenu.showPrefixMenu(p));
			}

			if (e.getCurrentItem().getType() == Material.EGG){
				
			}
			
			
		}
		
	}

	public ItemStack createMainMenuTokenItemStack(Material mat, String title, ArrayList<String> lore) {
		Material material = mat;
		String displayName = title;

		ArrayList<String> loreArray = lore;

		return createItem(material, displayName, loreArray);
	}

	public ItemStack createPlayerTokenItemStack(Player p) {

		Material material = Material.GOLD_NUGGET;
		String displayName = ChatColor.AQUA.toString() + "Your Tokens";
		// int tokens = plugin.tokenSQLManager.getPlayerTokens(playerUUID);
		// tokens = plugin.tokenAPI.playerTokensFromHashMap(p);
		int tokens = 0;
		UUID playerUUID = p.getUniqueId();

		tokens = plugin.tokenAPI.playerTokensFromHashMap(p);

		ArrayList<String> loreArray = new ArrayList<String>();
		loreArray.add("");
		loreArray.add(ChatColor.GRAY.toString() + "You have " + ChatColor.GREEN + tokens + ChatColor.GRAY + " tokens.");
		loreArray.add("");
		loreArray.add(ChatColor.YELLOW.toString() + "Tokens drop randomally on every server.");
		loreArray.add(ChatColor.YELLOW.toString() + "Grab them by mining, killing or just walking around!");
		loreArray.add("");

		return createItem(material, displayName, loreArray);
	}

	public static ItemStack createItem(Material mat, String title, ArrayList<String> loreArray) {

		ItemStack item = new ItemStack(mat);
		ItemMeta itemMeta = item.getItemMeta();

		itemMeta.setDisplayName(title);

		ArrayList<String> lore = new ArrayList<String>();
		lore.addAll(loreArray);
		lore.add(ChatColor.DARK_GRAY.toString() + "titleID:" + 55);

		itemMeta.setLore(lore);

		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);

		return item;

	}

}
