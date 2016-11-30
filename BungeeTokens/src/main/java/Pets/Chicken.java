package Pets;

import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;

import net.md_5.bungee.api.ChatColor;

public class Chicken extends Pets{
	


	
	public Chicken(){
		
		this.material = Material.SKULL_ITEM;
		this.invPosition = 20;
		this.perm = "thelasthero.pets.chicken";
		this.cost = 1200;
		this.petID = PetType.CHICKEN;
		this.owner = "MHF_Chicken";
		
		this.title = ChatColor.GREEN.toString() + "Chicken";
		this.displayTitle =  this.title;
		
		
	}

}
