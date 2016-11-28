package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Water extends Particles{
	


	
	public Water(){
		
		this.material = Material.WATER_BUCKET;
		this.invPosition = 22;
		this.perm = "thelasthero.particles.water";
		this.cost = 4500;
		this.trailID = 14;
		
		this.title = ChatColor.BLUE.toString() + "Water";
		this.displayTitle =  this.title;
		
		
	}

}
