package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Enchant extends Particles{
	


	
	public Enchant(){
		
		this.material = Material.ENCHANTMENT_TABLE;
		this.invPosition = 27;
		this.perm = "thelasthero.particles.enchant";
		this.cost = 4500;
		this.trailID = 19;
		
		this.title = ChatColor.WHITE.toString() + "Enchant";
		this.displayTitle =  this.title;
		
		
	}

}
