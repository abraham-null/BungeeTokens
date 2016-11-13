package Prefixes;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import API.TokenAPI;
import BungeeTokens.BungeeTokens.BungeeTokens;

public class PrefixesMenu implements Listener {
	
	private BungeeTokens plugin;
	private String title = ChatColor.DARK_AQUA + "Titles";
	private int size = 54;
	private Inventory inv;

	public PrefixesMenu(BungeeTokens plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		e.setCancelled(true);
		
		if (e.getClickedInventory().equals(inv)) {
			String clickedTitle = e.getCurrentItem().getItemMeta().getDisplayName();
			
			if(e.getCurrentItem().getType().equals(Material.GLASS_BOTTLE)){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
						"permissions player " + p.getName() + " prefix " + ""+ChatColor.GOLD);
				p.sendMessage(ChatColor.GREEN.toString()+"Your title has been removed");
				p.closeInventory();
			}
			
			for (int i = 0; i < plugin.prefixesArray.size(); i++) {
				Prefixes pre = plugin.prefixesArray.get(i);
				if(pre.getDisplayTitle().equals(clickedTitle)){
					
					String title = pre.getTitle();
					String perm = pre.getPerm();
					int cost = pre.getCost();
					int playerTokens = plugin.tokenAPI.playerTokensFromHashMap(p);
					
					if(p.hasPermission(perm)){
						Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
								"permissions player " + p.getName() + " prefix " + title);
						p.sendMessage(ChatColor.GREEN.toString()+"Your title has been set to: "+title);
						p.closeInventory();
						showPrefixMenu(p);
					} else {
						if(playerTokens >= cost){
							plugin.tokenAPI.removePlayerTokensFromHashMap(p, cost);
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
									"permissions player " + p.getName() + " set " + perm);
							p.sendMessage(ChatColor.GREEN.toString()+"Title purchased!");
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
									"permissions player " + p.getName() + " prefix " + title);
							p.closeInventory();
							showPrefixMenu(p);
						} else {
							p.sendMessage(ChatColor.GREEN.toString()+"Not enough tokens!");
						}
						}
						
						
					}
					
					
				}
				
			}
			
			
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
		
		//set empty bottle
		loreArray.add("");
		loreArray.add("Remove all current titles");
		loreArray.add("being displayed. ");
		loreArray.add("");
		inv.setItem(4, createItem(Material.GLASS_BOTTLE, "Clear all titles", loreArray));
		loreArray.clear();
		
		return inv;
	}
	
	public static ItemStack createItem(Material mat, String title, ArrayList<String> loreArray) {

		ItemStack item = new ItemStack(mat);
		ItemMeta itemMeta = item.getItemMeta();

		itemMeta.setDisplayName(title);

		ArrayList<String> lore = new ArrayList<String>();
		lore.addAll(loreArray);

		itemMeta.setLore(lore);

		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);

		return item;

	}
	
	
}
