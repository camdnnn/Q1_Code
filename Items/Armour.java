package Items;

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
		if(rarity == 3) {
			getRandomAttribute();
			getRandomAttribute();
			getRandomAttribute();
		}
		else if(rarity == 2) {
			getRandomAttribute();
			getRandomAttribute();
		}
		else if(rarity == 1) {
			getRandomAttribute();
		}
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
		return slot;
	}
	
}
