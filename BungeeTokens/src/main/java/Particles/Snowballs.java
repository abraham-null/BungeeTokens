package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

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
