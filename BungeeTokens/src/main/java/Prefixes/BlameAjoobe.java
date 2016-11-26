package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class BlameAjoobe extends Prefixes{
	


	
	public BlameAjoobe(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 23;
		this.perm = "thelasthero.blamegoldie";
		this.cost = 3000;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD.toString() + "#Blame"
				+ ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD.toString() + "Goldie" + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
