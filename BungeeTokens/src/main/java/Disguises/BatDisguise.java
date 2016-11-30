package Disguises;

import org.bukkit.Material;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;

public class BatDisguise extends Disguises{
	


	
	public BatDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 23;
		this.perm = "thelasthero.disguises.bat";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.BAT, false);
		this.mobDisguise.setShowName(true);
		
		
		this.title = ChatColor.GREEN.toString() + "Bat Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
