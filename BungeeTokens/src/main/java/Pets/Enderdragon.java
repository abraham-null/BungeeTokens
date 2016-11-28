package Pets;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;

public class Enderdragon extends Pets{
	


	
	public Enderdragon(){
		
		this.material = Material.SKULL_ITEM;
		this.invPosition = 21;
		this.perm = "thelasthero.pets.enderdragon";
		this.cost = 8750;
		this.petID = PetType.ENDERDRAGON;
		this.owner = "MHF_Enderdragon";
		
		this.title = ChatColor.GREEN.toString() + "Ender Dragon";
		this.displayTitle =  this.title;
		
		
	}

}
