package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Smoke extends Particles{
	


	
	public Smoke(){
		
		this.material = Material.COAL_BLOCK;
		this.invPosition = 25;
		this.perm = "thelasthero.particles.smoke";
		this.cost = 4500;
		this.trailID = 17;
		
		this.title = ChatColor.DARK_GRAY.toString() + "Smoke";
		this.displayTitle =  this.title;
		
		
	}

}
