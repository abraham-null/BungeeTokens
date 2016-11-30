package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Creature extends Prefixes{
	


	
	public Creature(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 25;
		this.perm = "thelasthero.creature";
		this.cost = 4750;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.GOLD.toString() + "Cr" + ChatColor.DARK_GREEN.toString() + "ea" + ChatColor.DARK_BLUE.toString() + "tu" + ChatColor.RED.toString() + "re"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_AQUA;

		this.displayTitle =  this.title;
		
		
	}

}
