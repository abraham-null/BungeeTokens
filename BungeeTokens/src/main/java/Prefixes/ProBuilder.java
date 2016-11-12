package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class ProBuilder extends Prefixes{
	


	
	public ProBuilder(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 22;
		this.perm = "thelasthero.probuilder";
		this.cost = 3000;
		
		this.title = ChatColor.YELLOW.toString() + "[" + ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Pro"
				+ ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Builder" + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;


		
		
	}

}
