package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class BlameAjoobe extends Prefixes{
	


	
	public BlameAjoobe(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 23;
		this.perm = "thelasthero.blameajoobe";
		this.cost = 7500;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD.toString() + "#Blame"
				+ ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD.toString() + "Goldie" + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
