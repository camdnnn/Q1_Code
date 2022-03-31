package Rarities;

import Items.Clothing;

public class Unique extends RarityDecorator {

	protected String rarity = "Unique";
    protected int rarityCount = 6;

    public Unique(Clothing clothing) {
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
