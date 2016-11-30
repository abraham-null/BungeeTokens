package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Breath extends Particles{
	


	
	public Breath(){
		
		this.material = Material.DRAGONS_BREATH;
		this.invPosition = 34;
		this.perm = "thelasthero.particles.breath";
		this.cost = 4500;
		this.trailID = 28;
		
		this.title = ChatColor.DARK_PURPLE.toString() + "Breath";
		this.displayTitle =  this.title;
		
		
	}

}
