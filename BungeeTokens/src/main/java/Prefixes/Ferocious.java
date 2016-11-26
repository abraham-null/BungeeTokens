package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Ferocious extends Prefixes{
	


	
	public Ferocious(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 26;
		this.perm = "thelasthero.ferocious";
		this.cost = 6000;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_RED.toString() + "Ferocious " + ChatColor.DARK_BLUE.toString() + "☢"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GRAY;

		this.displayTitle =  this.title;
		
		
	}

}
