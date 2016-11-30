package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Green extends Particles{
	


	
	public Green(){
		
		this.material = Material.EMERALD;
		this.invPosition = 16;
		this.perm = "thelasthero.particles.green";
		this.cost = 4500;
		this.trailID = 8;
		
		this.title = ChatColor.GREEN.toString() + "Green";
		this.displayTitle =  this.title;
		
		
	}

}
