package Droppers;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.avaje.ebeaninternal.server.deploy.generatedproperty.GeneratedInsertTimestamp;

import API.TokenAPI;
import BungeeTokens.BungeeTokens.BungeeTokens;

public class TokenDropper implements Listener {

	
	private BungeeTokens plugin;

	public TokenDropper(BungeeTokens plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		dropToken(e.getBlock().getLocation());
	}
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		
		if (e.getEntity().getKiller() == null) return;
		if (!(e.getEntity().getKiller() instanceof Player)) return;
		
		dropToken(e.getEntity().getLocation());
	}
	
	public void dropToken(Location location){
		
		ItemStack tokenItem = plugin.tokenItem;
		if(dropChance()){
		 location.getWorld().dropItemNaturally(location, tokenItem);
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler(priority=EventPriority.HIGH)
	public void onPlayerUse(PlayerInteractEvent e){
	    Player p = e.getPlayer();
	   
	    if((p.getItemInHand().isSimilar(plugin.tokenItem))){
	    	 Bukkit.getLogger().info("SSSSSSSSSSSSSSSSSSSSSS");
			Random ran = new Random();
			int tokenAmount = ran.nextInt(100) + 20;
			
			 ItemStack stack = p.getItemInHand();
			 
			if (stack.getAmount() > 1){
				stack.setAmount(stack.getAmount() - 1);
				}
		    else
		    	{p.getInventory().clear((p.getInventory().getHeldItemSlot()));
		  }
			
			plugin.tokenAPI.addPlayerTokensFromHashMap(p, tokenAmount);
			
			//e.setCancelled(true);
			Bukkit.broadcastMessage("tokens: "+tokenAmount);
	    }
	}
	
	
	public boolean dropChance(){
		
		int chance = 3000;
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(chance);
		
		if(randomInt > 1 && randomInt < 3){
			return true;
		}
		
		return false;
		
	}
	
	public ItemStack createToken(){
		
		ItemStack paperToken = new ItemStack(Material.PAPER);
		paperToken.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
		ItemMeta papertokenMeta = paperToken.getItemMeta();
		
		ArrayList<String> lore = new ArrayList<String>();
		papertokenMeta.setDisplayName(ChatColor.WHITE + "TheLastHero Token " + ChatColor.AQUA + "(Random Amount)");
		lore.add("");
		lore.add(ChatColor.WHITE + "  Right click to redeem this token");
		lore.add(ChatColor.WHITE + "  Use " + ChatColor.AQUA + "/tokens" + ChatColor.WHITE + "to spend tokens");
		lore.add(ChatColor.WHITE + "  Usable on any TheLastHero servers!");
		papertokenMeta.setLore(lore);
		paperToken.setItemMeta(papertokenMeta);
		
		return paperToken;
		
	}
}
