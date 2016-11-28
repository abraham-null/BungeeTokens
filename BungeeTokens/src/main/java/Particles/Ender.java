package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

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
