package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class WhiteMagic extends Particles{
	


	
	public WhiteMagic(){
		
		this.material = Material.SPIDER_EYE;
		this.invPosition = 19;
		this.perm = "thelasthero.particles.whitemagic";
		this.cost = 4500;
		this.trailID = 11;
		
		this.title = ChatColor.DARK_AQUA.toString() + "White Magic";
		this.displayTitle =  this.title;
		
		
	}

}
