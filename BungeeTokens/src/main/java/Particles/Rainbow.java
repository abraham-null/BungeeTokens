package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Rainbow extends Particles{
	


	
	public Rainbow(){
		
		this.material = Material.RED_MUSHROOM;
		this.invPosition = 33;
		this.perm = "thelasthero.particles.rainbow";
		this.cost = 4500;
		this.trailID = 27;
		
		this.title = ChatColor.GOLD.toString() + "Rainbow";
		this.displayTitle =  this.title;
		
		
	}

}
