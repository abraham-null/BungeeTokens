package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class God extends Prefixes{
	


	
	public God(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 29;
		this.perm = "thelasthero.god";
		this.cost = 7200;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.GOLD.toString() + "☯ " + ChatColor.DARK_BLUE.toString() + "G" + ChatColor.DARK_GREEN.toString() + "O" + ChatColor.DARK_RED.toString() + "D " + ChatColor.GOLD.toString() + "☯"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_GREEN;

		this.displayTitle =  this.title;
		
		
	}

}
