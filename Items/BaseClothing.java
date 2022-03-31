package Items;

import Rarities.Rarity;

public abstract class BaseClothing implements Clothing {
	protected String slot;
	protected Rarity rarity;

	public BaseClothing(Rarity rarity){
		this.rarity = rarity;
	}

	@Override
	public Rarity getRarity() {
        return rarity;
    }

	@Override
	public int getCount(){
		return 0;
	}

	@Override
	public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
}
