package Items;

import java.util.ArrayList;

public class Armour extends BaseClothing{

	public Armour() {
		
		int gearSlot = random.nextInt(4);
		if(gearSlot == 0) {
			slot = "Helm"; 
		}
		else if(gearSlot == 1) {
			slot = "Chest Piece";
		}
		else if(gearSlot == 2) {
			slot = "Gloves";
		}
		else if(gearSlot == 3) {
			slot = "Boots";
		}
		
		rarity = random.nextInt(4);
		int modLength = modifications.length;
		String [] modTemp = new String[modLength + 3];
		if(rarity == 3) {
			modTemp[modLength] = getRandomAttribute();
			modTemp[modLength+1] = getRandomAttribute();
			modTemp[modLength+2] = getRandomAttribute();
		}
		else if(rarity == 2) {
			modTemp[modLength] = getRandomAttribute();
			modTemp[modLength+1] = getRandomAttribute();
		}
		else if(rarity == 1) {
			modTemp[modLength] = getRandomAttribute();
		}
	}

	public String[] getAttributes(){
		return modifications;
	}

	public String getRarityDescription() {
		if(rarity == 0) return "Common";
		if(rarity == 1) return "Uncommon";
		if(rarity == 2) return "Rare";
		return "Epic";
	}

	protected String getRandomAttribute() {
		int r = random.nextInt(3);
		if(r == 0) return "Strength + 5"; ; 
		if(r == 1) return "Intelligence + 5"; 
		return "Dexterity + 5"; 
	}
	
	public String getDescription() {
		String descript = getRarityDescription() + " " + slot + ":\n";
		if(rarity == 3) {
			descript = descript + modifications[0] + "\n";
			descript = descript + modifications[1] + "\n";
			descript = descript + modifications[2] + "\n";
		}
		if(rarity == 2) {
			descript = descript + modifications[0] + "\n";
			descript = descript + modifications[1] + "\n";
		}
		if(rarity == 1) {
			descript = descript + modifications[0] + "\n";
		}
		return descript;
	}
	
}
