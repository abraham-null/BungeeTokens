package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class WitherKing extends Prefixes{
	


	
	public WitherKing(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 32;
		this.perm = "thelasthero.witherking";
		this.cost = 4125;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.BLACK.toString() + "Wither" + ChatColor.GOLD.toString() + "King"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_RED;

		this.displayTitle =  this.title;
		
		
	}

}
