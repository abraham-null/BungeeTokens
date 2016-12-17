package Disguises;

import org.bukkit.Material;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;

public class CowDisguise extends Disguises{
	


	
	public CowDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 26;
		this.perm = "thelasthero.disguises.cow";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.COW, false);
		this.mobDisguise.setShowName(true);
	
		this.title = ChatColor.GREEN.toString() + "Cow Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
