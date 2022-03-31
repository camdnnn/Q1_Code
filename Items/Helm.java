package Items;

import Rarities.Rarity;

public class Helm extends BaseClothing {
    protected String slot = "Helm";

    public Helm(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}
