package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Demon extends Prefixes{
	


	
	public Demon(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 18;
		this.perm = "thelasthero.demon";
		this.cost = 2850;
		
		this.title = ChatColor.BLACK.toString() + "["+ ChatColor.BOLD.toString() + ChatColor.DARK_RED.toString() + "Demon"
				 + ChatColor.BLACK.toString() + "] " + ChatColor.BLACK;

		this.displayTitle =  this.title;
		
		
	}

}
