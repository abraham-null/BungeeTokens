package Disguises;

import org.bukkit.Material;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;

public class DonkeyDisguise extends Disguises{
	


	
	public DonkeyDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 28;
		this.perm = "thelasthero.disguises.donkey";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.DONKEY, false);
		this.mobDisguise.setShowName(true);
	
		this.title = ChatColor.GREEN.toString() + "Donkey Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
