package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Champion extends Prefixes{
	


	
	public Champion(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 35;
		this.perm = "thelasthero.champion";
		this.cost = 2100;
		
		this.title = ChatColor.YELLOW.toString() + "[" + ChatColor.DARK_BLUE.toString() + ChatColor.ITALIC.toString() + "Champion"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
