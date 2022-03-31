package Items;

import Rarities.Rarirty;

public class Pauldron extends BaseClothing {
    protected String slot = "Pauldron";

    public Pauldron(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}