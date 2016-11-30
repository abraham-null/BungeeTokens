package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Pikachu extends Prefixes{
	


	
	public Pikachu(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 30;
		this.perm = "thelasthero.pikachu";
		this.cost = 1750;
		
		this.title = ChatColor.DARK_BLUE.toString() + "["+ ChatColor.GOLD.toString() + "Pikachu" 
				 + ChatColor.DARK_BLUE.toString() + "] " + ChatColor.DARK_GREEN;

		this.displayTitle =  this.title;
		
		
	}

}
