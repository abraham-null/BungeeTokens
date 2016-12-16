package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Rogue extends Prefixes{
	


	
	public Rogue(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 38;
		this.perm = "thelasthero.rogue";
		this.cost = 6700;
		
		this.title = ChatColor.BLACK.toString() + "["+ ChatColor.DARK_GREEN.toString() + ChatColor.MAGIC.toString() + "A" + ChatColor.DARK_RED.toString() + "Rogue" + ChatColor.DARK_RED.toString() + ChatColor.MAGIC.toString() + "A" + ChatColor.DARK_GREEN.toString() + "Hero"
				 + ChatColor.BLACK.toString() + "] " + ChatColor.BLACK;

		this.displayTitle =  this.title;
		
		
	}

}
