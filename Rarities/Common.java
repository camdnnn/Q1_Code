package Rarities;

import Items.Clothing;

public class Common extends RarityDecorator {

	protected String rarity = "Common";
    protected int rarityCount = 0;

    public Common(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return rarity + " " + clothing.getDescription() + "\n";
    }

    @Override
    public int getRarity() {
        return rarityCount;
    }
    
}
