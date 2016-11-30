package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

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
