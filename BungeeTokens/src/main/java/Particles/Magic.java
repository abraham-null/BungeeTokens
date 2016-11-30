package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Magic extends Particles{
	


	
	public Magic(){
		
		this.material = Material.BOOK;
		this.invPosition = 11;
		this.perm = "thelasthero.particles.magic";
		this.cost = 4500;
		this.trailID = 3;
		
		this.title = ChatColor.DARK_AQUA.toString() + "Magic";
		this.displayTitle =  this.title;
		
		
	}

}
