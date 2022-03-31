package Rarities;

import Items.Clothing;

public class Legendary extends RarityDecorator {

	protected String rarity = "Legendary";
    protected int rarityCount = 5;

    public Legendary(Clothing clothing) {
        super(clothing);
    }

    public String getDescription() {
        return rarity + " " + clothing.getDescription() + ":\n";
    }

    @Override
    public int getRarity() {
        return rarityCount;
    }
    
}
