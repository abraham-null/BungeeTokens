package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Warrior extends Prefixes{
	


	
	public Warrior(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 41;
		this.perm = "thelasthero.warrior";
		this.cost = 5000;
		
		this.title = ChatColor.BLACK.toString() + "["+ ChatColor.DARK_RED.toString() + "Warrior"
				 + ChatColor.BLACK.toString() + "] " + ChatColor.BLACK;

		this.displayTitle =  this.title;
		
		
	}

}
