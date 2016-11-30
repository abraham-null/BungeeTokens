package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Heart extends Particles{
	


	
	public Heart(){
		
		this.material = Material.BONE;
		this.invPosition = 9;
		this.perm = "thelasthero.particles.heart";
		this.cost = 4500;
		this.trailID = 1;
		
		this.title = ChatColor.RED.toString() + "Heart";
		this.displayTitle =  this.title;
		
		
	}

}
