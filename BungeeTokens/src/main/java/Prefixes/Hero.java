package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Hero extends Prefixes{
	


	
	public Hero(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 40;
		this.perm = "thelasthero.hero";
		this.cost = 850;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_GREEN.toString() + "Hero"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
