package Prefixes;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class ProPvper extends Prefixes{
	


	
	public ProPvper(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 21;
		this.perm = "thelasthero.propvper";
		this.cost = 2500;
		
		this.title = ChatColor.YELLOW.toString() + "[" + ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Pro"
				+ ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Pvper" + ChatColor.YELLOW.toString() + "] " + ChatColor.GOLD;
		this.displayTitle =  this.title;

		
		
	}

}
