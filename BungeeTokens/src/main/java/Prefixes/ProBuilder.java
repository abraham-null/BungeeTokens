package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class ProBuilder extends Prefixes{
	


	
	public ProBuilder(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 22;
		this.perm = "thelasthero.probuilder";
		this.cost = 2500;
		
		this.title = ChatColor.YELLOW.toString() + "[" + ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Pro"
				+ ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Builder" + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;
		this.displayTitle =  this.title;

		
		
	}

}
