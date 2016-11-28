package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Snow extends Particles{
	


	
	public Snow(){
		
		this.material = Material.SNOW_BLOCK;
		this.invPosition = 21;
		this.perm = "thelasthero.particles.snow";
		this.cost = 4500;
		this.trailID = 13;
		
		this.title = ChatColor.WHITE.toString() + "Snow";
		this.displayTitle =  this.title;
		
		
	}

}
