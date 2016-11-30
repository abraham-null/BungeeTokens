package Particles;

import org.bukkit.Material;

import net.md_5.bungee.api.ChatColor;

public class Spell extends Particles{
	


	
	public Spell(){
		
		this.material = Material.STICK;
		this.invPosition = 26;
		this.perm = "thelasthero.particles.spell";
		this.cost = 4500;
		this.trailID = 18;
		
		this.title = ChatColor.DARK_PURPLE.toString() + "Spell";
		this.displayTitle =  this.title;
		
		
	}

}
