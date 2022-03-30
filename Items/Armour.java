package Items;
public class Armour extends Clothing{

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
			modifications.add(getRandomAttribute());
			modifications.add(getRandomAttribute());
			modifications.add(getRandomAttribute());
		}
		else if(rarity == 2) {
			modifications.add(getRandomAttribute());
			modifications.add(getRandomAttribute());
		}
		else if(rarity == 1) {
			modifications.add(getRandomAttribute());
		}
	}
	
	protected String getRandomAttribute() {
		int r = random.nextInt(3);
		if(r == 0) return "Strength + 5"; 
		if(r == 1) return "Intelligence + 5"; 
		return "Dexterity + 5"; 
	}
	
	protected String getRarityDescription() {
		if(rarity == 0) return "Common";
		if(rarity == 1) return "Uncommon";
		if(rarity == 2) return "Rare";
		return "Epic";
	}
	
	public String getDescription() {
		String descript = getRarityDescription() + " " + slot + ":\n";
		if(rarity == 3) {
			descript = descript + modifications.get(0) + "\n";
			descript = descript + modifications.get(1) + "\n";
			descript = descript + modifications.get(2) + "\n";
		}
		if(rarity == 2) {
			descript = descript + modifications.get(0) + "\n";
			descript = descript + modifications.get(1) + "\n";
		}
		if(rarity == 1) {
			descript = descript + modifications.get(0) + "\n";
		}
		return descript;
	}
	
}
