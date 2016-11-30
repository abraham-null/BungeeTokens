package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Snowballs extends Particles{
	


	
	public Snowballs(){
		
		this.material = Material.SNOW_BALL;
		this.invPosition = 30;
		this.perm = "thelasthero.particles.snowballs";
		this.cost = 4500;
		this.trailID = 22;
		
		this.title = ChatColor.WHITE.toString() + "Snowballs";
		this.displayTitle =  this.title;
		
		
	}

}
