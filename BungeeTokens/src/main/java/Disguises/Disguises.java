package Disguises;

import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;

import me.libraryaddict.disguise.disguisetypes.MobDisguise;

public class Disguises {

	public Material material;
	public int invPosition;
	public int cost;
	public String perm;
	public String title;
	public String displayTitle;
	public MobDisguise mobDisguise;

	public String getDisplayTitle() {
		return displayTitle;
	}

	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}

	public MobDisguise getMobDisguise() {
		return mobDisguise;
	}

	public void setMobDisguise(MobDisguise mobDisguise) {
		this.mobDisguise = mobDisguise;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getInvPosition() {
		return invPosition;
	}

	public void setInvPosition(int invPosition) {
		this.invPosition = invPosition;
	}

	public String getPerm() {
		return perm;
	}

	public void setPerm(String perm) {
		this.perm = perm;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Disguises() {

	}
}
