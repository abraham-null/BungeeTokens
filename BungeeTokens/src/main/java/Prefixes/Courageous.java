package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Courageous extends Prefixes{
	


	
	public Courageous(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 37;
		this.perm = "thelasthero.courageous";
		this.cost = 2500;
		
		this.title = ChatColor.YELLOW.toString() + "[" + ChatColor.DARK_AQUA.toString() + ChatColor.BOLD.toString() +  "Courageous"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.BLUE;

		this.displayTitle =  this.title;
		
		
	}

}
