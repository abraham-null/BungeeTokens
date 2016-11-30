package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Endrod extends Particles{
	


	
	public Endrod(){
		
		this.material = Material.END_ROD;
		this.invPosition = 35;
		this.perm = "thelasthero.particles.endrod";
		this.cost = 4500;
		this.trailID = 29;
		
		this.title = ChatColor.WHITE.toString() + "End Rod";
		this.displayTitle =  this.title;
		
		
	}

}
