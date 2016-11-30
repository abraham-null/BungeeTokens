package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Demigod extends Prefixes{
	


	
	public Demigod(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 29;
		this.perm = "thelasthero.demigod";
		this.cost = 5000;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_BLUE.toString() + "Demi" + ChatColor.DARK_AQUA.toString() + "God"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_GREEN;

		this.displayTitle =  this.title;
		
		
	}

}
