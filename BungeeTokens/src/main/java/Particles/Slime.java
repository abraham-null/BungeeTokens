package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Slime extends Particles{
	


	
	public Slime(){
		
		this.material = Material.SLIME_BALL;
		this.invPosition = 23;
		this.perm = "thelasthero.particles.slime";
		this.cost = 4500;
		this.trailID = 21;
		
		this.title = ChatColor.GREEN.toString() + "Slime";
		this.displayTitle =  this.title;
		
		
	}

}
