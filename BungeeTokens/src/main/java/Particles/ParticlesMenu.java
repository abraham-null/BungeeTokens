package Particles;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import BungeeTokens.BungeeTokens.BungeeTokens;
import me.kvq.plugin.trails.API.SuperTrailsAPI;
import net.md_5.bungee.api.ChatColor;


public class ParticlesMenu implements Listener{
	
	private BungeeTokens plugin;
	private String title = ChatColor.DARK_AQUA + "Particles";
	private int size = 54;
	private Inventory inv;

	public ParticlesMenu(BungeeTokens plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getCurrentItem() == null || e.getInventory() == null){
			return;
		}
		
		if (e.getClickedInventory().equals(inv)) {
			e.setCancelled(true);
			String clickedTitle = e.getCurrentItem().getItemMeta().getDisplayName();
			
			if(e.getCurrentItem().getType().equals(Material.GLASS_BOTTLE)){
				SuperTrailsAPI.HideTrailFor(p, true);
				p.sendMessage(ChatColor.GREEN.toString()+"Your particles has been removed");
				p.closeInventory();
			}
			if(e.getCurrentItem().getType().equals(Material.REDSTONE_BLOCK)){
				plugin.tokenAPI.showMenu(p);
			}
			
			for (int i = 0; i < plugin.particlesArray.size(); i++) {
				Particles pre = plugin.particlesArray.get(i);
				if(pre.getDisplayTitle().equals(clickedTitle)){
					
					String title = pre.getTitle();
					String perm = pre.getPerm();
					int cost = pre.getCost();
					int playerTokens = plugin.tokenAPI.playerTokensFromHashMap(p);
					int trailID = pre.getTrailID();
					
					if(p.hasPermission(perm)){
						SuperTrailsAPI.setTrail(trailID, p);
						p.sendMessage(ChatColor.GREEN.toString()+"Your particle effect has been set to: "+title);
						p.closeInventory();
						showParticlesMenu(p);
					} else {
						if(playerTokens >= cost){
							plugin.tokenAPI.removePlayerTokensFromHashMap(p, cost);
							SuperTrailsAPI.setTrail(trailID, p);
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
									"permissions player " + p.getName() + " set " + perm);
							p.sendMessage(ChatColor.GREEN.toString()+"Particle purchased!");
							p.closeInventory();
							showParticlesMenu(p);
						} else {
							p.sendMessage(ChatColor.GREEN.toString()+"Not enough tokens!");
						}
						}
						
						
					}
					
					
				}
				
			}
			
			
		}
		
		
	
		
		
	public Inventory showParticlesMenu(Player p){
		inv = Bukkit.createInventory(null, size, title);
		ArrayList<String> loreArray = new ArrayList<String>();
		
		for (int i = 0; i < plugin.particlesArray.size(); i++) {
			Particles pre = plugin.particlesArray.get(i);
			
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
		loreArray.add("Remove all current particles");
		loreArray.add("being displayed. ");
		loreArray.add("");
		inv.setItem(4, createItem(Material.GLASS_BOTTLE, "Clear all particles", loreArray));
		loreArray.clear();
		
		loreArray.clear();
		loreArray.add("Return to Main Menu");
		loreArray.add("");
		loreArray.add("");
		inv.setItem(45, createItem(Material.REDSTONE_BLOCK, "Back to Main Menu", loreArray));
		inv.setItem(53, createItem(Material.REDSTONE_BLOCK, "Back to Main Menu", loreArray));
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


