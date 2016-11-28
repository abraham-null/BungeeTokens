package Pets;

import org.bukkit.Material;

import com.dsh105.echopet.compat.api.entity.PetType;


public class Pets {

	public Material material;
	public int invPosition;
	public int cost;
	public String perm;
	public String title;
	public String displayTitle;
	public PetType petID;
	public String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public PetType getPetID() {
		return petID;
	}

	public void setPetID(PetType petID) {
		this.petID = petID;
	}

	public String getDisplayTitle() {
		return displayTitle;
	}

	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
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

	public Pets() {

	}
}
