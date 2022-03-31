package Rarities;

import Items.Clothing;

public class Uncommon extends RarityDecorator {

	protected String rarity = "Uncommon";
    protected int rarityCount = 1;

    public Uncommon(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return rarity + " " + clothing.getDescription() + ":\n";
    }

    @Override
    public int getRarity() {
        return rarityCount;
    }
    
}
