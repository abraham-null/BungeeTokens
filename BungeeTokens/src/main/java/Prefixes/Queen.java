package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Queen extends Prefixes{
	


	
	public Queen(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 27;
		this.perm = "thelasthero.queen";
		this.cost = 1500;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.LIGHT_PURPLE.toString() + "Queen"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
