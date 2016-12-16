package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class UltimateHero extends Prefixes{
	


	
	public UltimateHero(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 2;
		this.perm = "thelasthero.ultimatehero";
		this.cost = 9250;
		
		this.title = ChatColor.DARK_AQUA.toString() + "[" + ChatColor.DARK_GREEN.toString() + "⚔ " + ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Ultimate"
				 + ChatColor.DARK_GREEN.toString() + ChatColor.ITALIC.toString() + "Hero " + ChatColor.DARK_RED.toString() + "⚔" + ChatColor.DARK_AQUA.toString() + "] " + ChatColor.BLACK;

		this.displayTitle =  this.title;
		
		
	}

}
