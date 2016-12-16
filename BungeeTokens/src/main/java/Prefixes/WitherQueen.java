package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class WitherQueen extends Prefixes{
	


	
	public WitherQueen(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 33;
		this.perm = "thelasthero.witherqueen";
		this.cost = 4125;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.BLACK.toString() + "Wither" + ChatColor.RED.toString() + "Queen"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.DARK_PURPLE;

		this.displayTitle =  this.title;
		
		
	}

}
