package Pets;

import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;

import net.md_5.bungee.api.ChatColor;

public class Blaze extends Pets{
	


	
	public Blaze(){
		
		this.material = Material.SKULL_ITEM;
		this.invPosition = 22;
		this.perm = "thelasthero.pets.blaze";
		this.cost = 4500;
		this.petID = PetType.BLAZE;
		this.owner = "MHF_Blaze";
		
		this.title = ChatColor.GREEN.toString() + "Blaze";
		this.displayTitle =  this.title;
		
		
	}

}
