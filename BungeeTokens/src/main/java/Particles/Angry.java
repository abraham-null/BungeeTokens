package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Angry extends Particles{
	


	
	public Angry(){
		
		this.material = Material.FIREWORK;
		this.invPosition = 10;
		this.perm = "thelasthero.particles.angry";
		this.cost = 4500;
		this.trailID = 2;
		
		this.title = ChatColor.GOLD.toString() + "Angry";
		this.displayTitle =  this.title;
		
		
	}

}
