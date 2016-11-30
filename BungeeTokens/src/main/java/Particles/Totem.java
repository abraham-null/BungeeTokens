package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Totem extends Particles{
	


	
	public Totem(){
		
		this.material = Material.TOTEM;
		this.invPosition = 37;
		this.perm = "thelasthero.particles.totem";
		this.cost = 4500;
		this.trailID = 32;
		
		this.title = ChatColor.GRAY.toString() + "Totem";
		this.displayTitle =  this.title;
		
		
	}

}
