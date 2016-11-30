package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Colors extends Particles{
	


	
	public Colors(){
		
		this.material = Material.REDSTONE;
		this.invPosition = 12;
		this.perm = "thelasthero.particles.colors";
		this.cost = 4500;
		this.trailID = 4;
		
		this.title = ChatColor.YELLOW.toString() + "Colors";
		this.displayTitle =  this.title;
		
		
	}

}
