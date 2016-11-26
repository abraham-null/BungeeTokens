package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Princess extends Prefixes{
	


	
	public Princess(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 20;
		this.perm = "thelasthero.princess";
		this.cost = 2500;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.LIGHT_PURPLE.toString() + "Princess"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_PURPLE;

		this.displayTitle =  this.title;
		
		
	}

}
