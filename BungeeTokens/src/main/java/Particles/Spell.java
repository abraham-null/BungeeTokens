package Particles;

import org.bukkit.ChatColor;
import org.bukkit.Material;

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
