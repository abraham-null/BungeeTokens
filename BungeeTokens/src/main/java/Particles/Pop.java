package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Pop extends Particles{
	


	
	public Pop(){
		
		this.material = Material.BLAZE_ROD;
		this.invPosition = 32;
		this.perm = "thelasthero.particles.pop";
		this.cost = 4500;
		this.trailID = 26;
		
		this.title = ChatColor.YELLOW.toString() + "pop";
		this.displayTitle =  this.title;
		
		
	}

}
