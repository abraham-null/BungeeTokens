package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Villain extends Prefixes{
	


	
	public Villain(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 39;
		this.perm = "thelasthero.villain";
		this.cost = 2600;
		
		this.title = ChatColor.BLACK.toString() + "["+ ChatColor.DARK_RED.toString() + "Villain"
				 + ChatColor.BLACK.toString() + "] " + ChatColor.BLACK;

		this.displayTitle =  this.title;
		
		
	}

}
