package Rarities;

import Items.Clothing;

public class Epic extends RarityDecorator {

	protected String rarity = "Epic";
    protected int rarityCount = 3;

    public Epic(Clothing clothing) {
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
