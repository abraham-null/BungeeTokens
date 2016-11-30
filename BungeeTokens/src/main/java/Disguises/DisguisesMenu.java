package Disguises;

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
import org.bukkit.inventory.meta.SkullMeta;

import BungeeTokens.BungeeTokens.BungeeTokens;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;


public class DisguisesMenu implements Listener{
	
	private BungeeTokens plugin;
	private String title = ChatColor.DARK_AQUA + "Disguises";
	private int size = 54;
	private Inventory inv;

	public DisguisesMenu(BungeeTokens plugin) {
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
				DisguiseAPI.undisguiseToAll(p);
				p.sendMessage(ChatColor.GREEN.toString()+"Your disguise has been removed");
				p.closeInventory();
			}
			
			for (int i = 0; i < plugin.disguisesArray.size(); i++) {
				Disguises pre = plugin.disguisesArray.get(i);
				if(pre.getDisplayTitle().equals(clickedTitle)){
					
					String title = pre.getTitle();
					String perm = pre.getPerm();
					int cost = pre.getCost();
					int playerTokens = plugin.tokenAPI.playerTokensFromHashMap(p);
					MobDisguise mobDisguise = pre.getMobDisguise();
					
					if(p.hasPermission(perm)){
						//SuperTrailsAPI.setTrail(trailID, p);
						//p.sendMessage(ChatColor.GREEN.toString()+"Your particle effect has been set to: "+title);
						//EchoPetAPI.getAPI().givePet(p, petID, true);
						DisguiseAPI.disguiseToAll(p, mobDisguise);
						p.closeInventory();
						showDisguisesMenu(p);
					} else {
						if(playerTokens >= cost){
							plugin.tokenAPI.removePlayerTokensFromHashMap(p, cost);
							DisguiseAPI.disguiseToAll(p, mobDisguise);
							Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
									"permissions player " + p.getName() + " set " + perm);
							p.sendMessage(ChatColor.GREEN.toString()+"Disguise purchased!");
							p.closeInventory();
							showDisguisesMenu(p);
						} else {
							p.sendMessage(ChatColor.GREEN.toString()+"Not enough tokens!");
						}
						}
						
						
					}
					
					
				}
				
			}
			
			
		}
		
		
	
		
		
	public Inventory showDisguisesMenu(Player p){
		inv = Bukkit.createInventory(null, size, title);
		ArrayList<String> loreArray = new ArrayList<String>();
		
		for (int i = 0; i < plugin.disguisesArray.size(); i++) {
			Disguises pre = plugin.disguisesArray.get(i);
			
			Material mat = pre.getMaterial();
			int cost = pre.getCost();
			int invPosition = pre.getInvPosition();
			String title = pre.getTitle();
			String perm = pre.getPerm();
			
			//make lore array
			if(p.hasPermission(perm)){
				loreArray.add(ChatColor.WHITE.toString() + "You own this disguise.");
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
		loreArray.add("Remove all current disguises");
		loreArray.add("being displayed. ");
		loreArray.add("");
		inv.setItem(4, createItem(Material.GLASS_BOTTLE, "Clear all disguises", loreArray));
		loreArray.clear();
		
		return inv;
	}
	
	public static ItemStack createSkullItem(Material mat, String title, ArrayList<String> loreArray, String owner) {

		ItemStack item = new ItemStack(mat, 1, (short) 3);
		SkullMeta itemMeta = (SkullMeta) item.getItemMeta();

		itemMeta.setDisplayName(title);
		itemMeta.setOwner(owner);

		ArrayList<String> lore = new ArrayList<String>();
		lore.addAll(loreArray);

		itemMeta.setLore(lore);

		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);

		return item;

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


