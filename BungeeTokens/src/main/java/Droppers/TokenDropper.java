package Droppers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;

import BungeeTokens.BungeeTokens.BungeeTokens;
import net.md_5.bungee.api.ChatColor;

public class TokenDropper implements Listener {

	private BungeeTokens plugin;

	public TokenDropper(BungeeTokens plugin) {
		this.plugin = plugin;
	}

	public void randomLocDropToken() {
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
		scheduler.scheduleSyncRepeatingTask(plugin, new Runnable() {
			public void run() {

				
				if(Bukkit.getServer().getOnlinePlayers().size() >= 1){

				List<Player> rpl = new ArrayList<Player>();
				 
				for(Player all:Bukkit.getServer().getOnlinePlayers()){
					rpl.add(all.getPlayer());
					}
				
				Random randomGenerator = new Random();
				int randomInt = randomGenerator.nextInt(rpl.size());
				
				int randomXDistance =+ generatRandomPositiveNegitiveValue(17,88);
				
				int randomZDistance =+ generatRandomPositiveNegitiveValue(24,77);
				
				Player rp = rpl.get(randomInt);
				World world = rp.getWorld();
				//build a token
				ItemStack paperToken = plugin.tokenItem;
				
				Location loc = rp.getLocation();
				loc.add(randomXDistance, 3, randomZDistance);
				
				double y = world.getHighestBlockAt((int)loc.getX(), (int) loc.getZ()).getY();
				
				Location dropLoc = new Location(world, (int)loc.getX(), (int)(y+5), (int)loc.getZ());
				
				dropLoc.getBlock().getWorld().dropItemNaturally(loc.getBlock().getLocation(), paperToken);
				
				}
			}
		}, 1205660, 1220);
	//	}, 30, 30);
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		dropToken(e.getBlock().getLocation());
	}

	@EventHandler
	public void onPlayerPickupItem(PlayerPickupItemEvent event) {

		ItemStack item = event.getItem().getItemStack();

		if ((item.isSimilar(plugin.tokenItem))) {

			Player player = event.getPlayer();
			player.sendMessage(ChatColor.AQUA + "You just picked up a random token!");
		}

	}

	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {

		if (e.getEntity().getKiller() == null)
			return;
		if (!(e.getEntity().getKiller() instanceof Player))
			return;

		dropToken(e.getEntity().getLocation());
	}

	public void dropToken(Location location) {

		ItemStack tokenItem = plugin.tokenItem;
		if (dropChance()) {
			location.getWorld().dropItemNaturally(location, tokenItem);
		}

	}

	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerUse(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if ((p.getItemInHand().isSimilar(plugin.tokenItem))) {

			Random ran = new Random();
			int tokenAmount = ran.nextInt(100) + 20;

			ItemStack stack = p.getItemInHand();

			if (stack.getAmount() > 1) {
				stack.setAmount(stack.getAmount() - 1);
			} else {
				p.getInventory().clear((p.getInventory().getHeldItemSlot()));
			}

			plugin.tokenAPI.addPlayerTokensFromHashMap(p, tokenAmount);
			p.sendMessage(ChatColor.AQUA + "You have just claimed: " + tokenAmount + "tokens");
		}
	}

	public boolean dropChance() {

		int chance = 3000;

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(chance);

		if (randomInt > 1 && randomInt < 3) {
			return true;
		}

		return false;

	}

	public ItemStack createToken() {

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
	
	public static int generatRandomPositiveNegitiveValue(int max , int min) {
	    //Random rand = new Random();
	    int ii = -min + (int) (Math.random() * ((max - (-min)) + 1));
	    return ii;
	}
}
