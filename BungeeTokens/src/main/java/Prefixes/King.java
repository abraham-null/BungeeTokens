package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class King extends Prefixes{
	


	
	public King(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 28;
		this.perm = "thelasthero.King";
		this.cost = 1250;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.GOLD.toString() + "King"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
