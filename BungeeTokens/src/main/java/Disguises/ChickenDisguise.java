package Disguises;

import org.bukkit.Material;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;

public class ChickenDisguise extends Disguises{
	


	
	public ChickenDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 25;
		this.perm = "thelasthero.disguises.chicken";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.CHICKEN, false);
		this.mobDisguise.setShowName(true);
	
		this.title = ChatColor.GREEN.toString() + "Chicken Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
