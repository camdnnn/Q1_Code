package Items;

import Rarities.Rarity;

public class Ring extends BaseClothing {
    protected String slot = "Helm";

    public Ring(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}