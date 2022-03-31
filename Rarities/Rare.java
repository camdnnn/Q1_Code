package Rarities;

import Items.Clothing;

public class Rare extends RarityDecorator {

	protected String rarity = "Rare";
    protected int rarityCount = 2;
    

    public Rare(Clothing clothing) {
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
