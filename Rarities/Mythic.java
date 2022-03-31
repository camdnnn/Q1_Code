package Rarities;

import Items.Clothing;

public class Mythic extends RarityDecorator {

	protected String rarity = "Mythic";
    protected int rarityCount = 4;

    public Mythic(Clothing clothing) {
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
