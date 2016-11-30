package Pets;

import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;

import net.md_5.bungee.api.ChatColor;

public class Bat extends Pets{
	


	
	public Bat(){
		
		this.material = Material.SKULL_ITEM;
		this.invPosition = 23;
		this.perm = "thelasthero.pets.bat";
		this.cost = 4500;
		this.petID = PetType.BAT;
		this.owner = "MHF_BAT";
		
		this.title = ChatColor.GREEN.toString() + "Bat";
		this.displayTitle =  this.title;
		
		
	}

}
