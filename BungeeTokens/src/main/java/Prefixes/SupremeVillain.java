package Prefixes;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class SupremeVillain extends Prefixes{
	


	
	public SupremeVillain(){
		
		this.material = Material.NAME_TAG;
		this.invPosition = 6;
		this.perm = "thelasthero.supremevillain";
		this.cost = 9250;
		
		this.title = ChatColor.BLACK.toString() + "[" + ChatColor.DARK_RED.toString() + "☠ " + ChatColor.BLACK.toString() + "Supreme"
				 + ChatColor.DARK_RED.toString() + ChatColor.ITALIC.toString() + "Villain " + ChatColor.DARK_RED.toString() + "☠" + ChatColor.BLACK.toString() + "] " + ChatColor.DARK_GRAY;

		this.displayTitle =  this.title;
		
		
	}

}
