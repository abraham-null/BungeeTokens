package Disguises;

import org.bukkit.Material;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;

public class CreeperDisguise extends Disguises{
	


	
	public CreeperDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 27;
		this.perm = "thelasthero.disguises.creeper";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.CREEPER, false);
		this.mobDisguise.setShowName(true);
	
		this.title = ChatColor.GREEN.toString() + "Creeper Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
