package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Lava extends Particles{
	


	
	public Lava(){
		
		this.material = Material.LAVA_BUCKET;
		this.invPosition = 23;
		this.perm = "thelasthero.particles.lava";
		this.cost = 4500;
		this.trailID = 15;
		
		this.title = ChatColor.GOLD.toString() + "Lava";
		this.displayTitle =  this.title;
		
		
	}

}
