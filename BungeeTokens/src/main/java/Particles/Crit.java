package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Crit extends Particles{
	


	
	public Crit(){
		
		this.material = Material.IRON_SWORD;
		this.invPosition = 24;
		this.perm = "thelasthero.particles.crit";
		this.cost = 4500;
		this.trailID = 16;
		
		this.title = ChatColor.GOLD.toString() + "Crit";
		this.displayTitle =  this.title;
		
		
	}

}
