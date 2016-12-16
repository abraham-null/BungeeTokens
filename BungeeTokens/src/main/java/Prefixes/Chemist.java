package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Chemist extends Prefixes{
	


	
	public Chemist(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 36;
		this.perm = "thelasthero.chemist";
		this.cost = 4000;
		
		this.title = ChatColor.YELLOW.toString() + "["+ ChatColor.DARK_GREEN.toString() + "☢ " + ChatColor.ITALIC.toString() + ChatColor.GREEN.toString() + "Chemist " + ChatColor.DARK_GREEN.toString() + "☢"
				 + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;

		this.displayTitle =  this.title;
		
		
	}

}
