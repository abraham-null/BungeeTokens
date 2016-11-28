package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Splash extends Particles{
	


	
	public Splash(){
		
		this.material = Material.WHEAT;
		this.invPosition = 28;
		this.perm = "thelasthero.particles.splash";
		this.cost = 4500;
		this.trailID = 20;
		
		this.title = ChatColor.DARK_BLUE.toString() + "Splash";
		this.displayTitle =  this.title;
		
		
	}

}
