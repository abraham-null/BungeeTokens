package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Ender extends Particles{
	


	
	public Ender(){
		
		this.material = Material.ENDER_CHEST;
		this.invPosition = 15;
		this.perm = "thelasthero.particles.ender";
		this.cost = 5450;
		this.trailID = 7;
		
		this.title = ChatColor.GREEN.toString() + "Ender";
		this.displayTitle =  this.title;
		
		
	}

}
