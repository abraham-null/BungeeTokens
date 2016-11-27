package Disguises;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;

public class BatDisguise extends Disguises{
	


	
	public BatDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 23;
		this.perm = "thelasthero.disguises.bat";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.BAT, false);
		
		
		this.title = ChatColor.GREEN.toString() + "Bat Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
