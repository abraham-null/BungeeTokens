package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Cloud extends Particles{
	


	
	public Cloud(){
		
		this.material = Material.WEB;
		this.invPosition = 13;
		this.perm = "thelasthero.particles.cloud";
		this.cost = 4500;
		this.trailID = 5;
		
		this.title = ChatColor.WHITE.toString() + "Cloud";
		this.displayTitle =  this.title;
		
		
	}

}
