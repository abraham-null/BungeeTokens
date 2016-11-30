package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class WitchMagic extends Particles{
	


	
	public WitchMagic(){
		
		this.material = Material.BREWING_STAND;
		this.invPosition = 14;
		this.perm = "thelasthero.particles.witchmagic";
		this.cost = 4500;
		this.trailID = 6;
		
		this.title = ChatColor.DARK_AQUA.toString() + "Witch Magic";
		this.displayTitle =  this.title;
		
		
	}

}
