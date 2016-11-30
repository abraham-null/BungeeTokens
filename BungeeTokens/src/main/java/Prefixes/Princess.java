package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Princess extends Prefixes{
	


	
	public Princess(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 19;
		this.perm = "thelasthero.princess";
		this.cost = 2500;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.LIGHT_PURPLE.toString() + "Princess"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_PURPLE;

		this.displayTitle =  this.title;
		
		
	}

}
