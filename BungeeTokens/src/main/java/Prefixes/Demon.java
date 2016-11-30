package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Demon extends Prefixes{
	


	
	public Demon(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 18;
		this.perm = "thelasthero.demon";
		this.cost = 6200;
		
		this.title = ChatColor.BLACK.toString() + "["+ ChatColor.GRAY.toString() + "☪ " + ChatColor.BOLD.toString() + ChatColor.DARK_RED.toString() + "Demon " + ChatColor.MAGIC.toString() + " ☪"
				 + ChatColor.BLACK.toString() + "] " + ChatColor.BLACK;

		this.displayTitle =  this.title;
		
		
	}

}
