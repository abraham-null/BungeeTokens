package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Sand extends Particles{
	


	
	public Sand(){
		
		this.material = Material.SAND;
		this.invPosition = 37;
		this.perm = "thelasthero.particles.sand";
		this.cost = 4500;
		this.trailID = 31;
		
		this.title = ChatColor.YELLOW.toString() + "Sand";
		this.displayTitle =  this.title;
		
		
	}

}
