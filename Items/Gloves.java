package Items;

import Rarities.Rarity;

public class Gloves extends BaseClothing {
    protected String slot = "Gloves";

    public Gloves(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}