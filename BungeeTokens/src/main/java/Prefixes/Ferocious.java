package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Ferocious extends Prefixes{
	


	
	public Ferocious(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 26;
		this.perm = "thelasthero.ferocious";
		this.cost = 6000;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_RED.toString() + "Ferocious " + ChatColor.DARK_BLUE.toString() + "☢"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GRAY;

		this.displayTitle =  this.title;
		
		
	}

}
