package Prefixes;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import BungeeTokens.BungeeTokens.BungeeTokens;

public class PrefixesMenu {
	
	private BungeeTokens plugin;
	private String title = ChatColor.DARK_AQUA + "Titles";
	private int size = 54;
	private Inventory inv;

	public PrefixesMenu(BungeeTokens plugin) {
		this.plugin = plugin;
	}
		
		
	public Inventory showPrefixMenu(Player p){
		inv = Bukkit.createInventory(null, size, title);
		ArrayList<String> loreArray = new ArrayList<String>();
		
		for (int i = 0; i < plugin.prefixesArray.size(); i++) {
			Prefixes pre = plugin.prefixesArray.get(i);
			
			Material mat = pre.getMaterial();
			int cost = pre.getCost();
			int invPosition = pre.getInvPosition();
			String title = pre.getTitle();
			String perm = pre.getPerm();
			
			//make lore array
			if(p.hasPermission(perm)){
				loreArray.add(ChatColor.WHITE.toString() + "You own this title.");
				loreArray.add(ChatColor.AQUA.toString() +  "Click to set!");
			} else {
				loreArray.add(ChatColor.WHITE.toString() + "Cost: " + ChatColor.GREEN.toString() + cost 
						+ ChatColor.WHITE.toString() + " tokens.");
				loreArray.add("");

			}
			
			inv.setItem(invPosition,createItem(mat, title, loreArray));
			loreArray.clear();
			
		}
		
		return inv;
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
