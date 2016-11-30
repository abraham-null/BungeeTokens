package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Void extends Particles{
	


	
	public Void(){
		
		this.material = Material.ENDER_STONE;
		this.invPosition = 31;
		this.perm = "thelasthero.particles.void";
		this.cost = 4500;
		this.trailID = 25;
		
		this.title = ChatColor.GRAY.toString() + "Void";
		this.displayTitle =  this.title;
		
		
	}

}
