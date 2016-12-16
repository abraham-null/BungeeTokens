package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Foxy extends Prefixes{
	


	
	public Foxy(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 34;
		this.perm = "thelasthero.foxy";
		this.cost = 1980;
		
		this.title = ChatColor.BLACK.toString() + "["+ ChatColor.YELLOW.toString() + ChatColor.ITALIC.toString() + "Foxy"
				 + ChatColor.BLACK.toString() + "] " + ChatColor.LIGHT_PURPLE;

		this.displayTitle =  this.title;
		
		
	}

}
