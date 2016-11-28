package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Damage extends Particles{
	


	
	public Damage(){
		
		this.material = Material.FERMENTED_SPIDER_EYE;
		this.invPosition = 36;
		this.perm = "thelasthero.particles.damage";
		this.cost = 4500;
		this.trailID = 30;
		
		this.title = ChatColor.DARK_RED.toString() + "Damage";
		this.displayTitle =  this.title;
		
		
	}

}
