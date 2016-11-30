package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Spark extends Particles{
	


	
	public Spark(){
		
		this.material = Material.FLINT;
		this.invPosition = 17;
		this.perm = "thelasthero.particles.spark";
		this.cost = 4500;
		this.trailID = 9;
		
		this.title = ChatColor.WHITE.toString() + "Spark";
		this.displayTitle =  this.title;
		
		
	}

}
