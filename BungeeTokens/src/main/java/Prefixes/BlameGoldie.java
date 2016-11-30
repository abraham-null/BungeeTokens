package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class BlameGoldie extends Prefixes{
	


	
	public BlameGoldie(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 24;
		this.perm = "thelasthero.blamegoldie";
		this.cost = 7500;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD.toString() + "#Blame"
				+ ChatColor.DARK_GREEN.toString() + ChatColor.BOLD.toString() + "Ajoobe" + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_BLUE;

		this.displayTitle =  this.title;
		
		
	}

}
