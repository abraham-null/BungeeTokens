package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Music extends Particles{
	


	
	public Music(){
		
		this.material = Material.RECORD_10;
		this.invPosition = 20;
		this.perm = "thelasthero.particles.music";
		this.cost = 4500;
		this.trailID = 12;
		
		this.title = ChatColor.LIGHT_PURPLE.toString() + "Music";
		this.displayTitle =  this.title;
		
		
	}

}
