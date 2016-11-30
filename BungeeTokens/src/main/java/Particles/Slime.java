package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Slime extends Particles{
	


	
	public Slime(){
		
		this.material = Material.SLIME_BALL;
		this.invPosition = 29;
		this.perm = "thelasthero.particles.slime";
		this.cost = 4500;
		this.trailID = 21;
		
		this.title = ChatColor.GREEN.toString() + "Slime";
		this.displayTitle =  this.title;
		
		
	}

}
