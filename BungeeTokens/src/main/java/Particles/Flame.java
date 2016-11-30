package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Flame extends Particles{
	


	
	public Flame(){
		
		this.material = Material.FLINT_AND_STEEL;
		this.invPosition = 18;
		this.perm = "thelasthero.particles.flame";
		this.cost = 4500;
		this.trailID = 10;
		
		this.title = ChatColor.GOLD.toString() + "Flame";
		this.displayTitle =  this.title;
		
		
	}

}
