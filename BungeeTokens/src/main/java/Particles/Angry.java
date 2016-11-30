package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

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
