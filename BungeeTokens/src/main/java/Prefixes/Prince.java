package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Prince extends Prefixes{
	


	
	public Prince(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 20;
		this.perm = "thelasthero.prince";
		this.cost = 3000;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.GOLD.toString() + "Prince"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_AQUA;

		this.displayTitle =  this.title;
		
		
	}

}
