package Items;

import Rarities.Rarity;

public class Pants extends BaseClothing {
    protected String slot = "Pants";

    public Pants(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}