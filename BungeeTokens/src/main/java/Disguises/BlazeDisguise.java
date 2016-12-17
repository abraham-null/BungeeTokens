package Disguises;

import org.bukkit.Material;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import net.md_5.bungee.api.ChatColor;

public class BlazeDisguise extends Disguises{
	


	
	public BlazeDisguise(){
		
		this.material = Material.ARROW;
		this.invPosition = 24;
		this.perm = "thelasthero.disguises.blaze";
		this.cost = 4500;
		this.mobDisguise = new MobDisguise(DisguiseType.BLAZE, false);
		this.mobDisguise.setShowName(true);
		
		
		this.title = ChatColor.GREEN.toString() + "Blaze Disguise";
		this.displayTitle =  this.title;
		
		
	}

}
