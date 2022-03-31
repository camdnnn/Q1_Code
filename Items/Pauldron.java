package Items;

import Rarities.Rarity;

public class Pauldron extends BaseClothing {
    protected String slot = "Pauldron";

    public Pauldron(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}