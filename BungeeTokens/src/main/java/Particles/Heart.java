package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Heart extends Particles{
	


	
	public Heart(){
		
		this.material = Material.BONE;
		this.invPosition = 22;
		this.perm = "thelasthero.particles.heart";
		this.cost = 4500;
		this.trailID = 1;
		
		this.title = ChatColor.RED.toString() + "Heart";
		this.displayTitle =  this.title;
		
		
	}

}
