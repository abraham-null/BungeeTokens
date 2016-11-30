package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Buttercup extends Prefixes{
	


	
	public Buttercup(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 31;
		this.perm = "thelasthero.buttercup";
		this.cost = 1750;
		
		this.title = ChatColor.DARK_BLUE.toString() + "["+ ChatColor.RED.toString() + "buttercup" 
				 + ChatColor.DARK_BLUE.toString() + "] " + ChatColor.LIGHT_PURPLE;

		this.displayTitle =  this.title;
		
		
	}

}
