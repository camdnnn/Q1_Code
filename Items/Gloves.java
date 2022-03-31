package Items;

import Rarities.Rarirty;

public class Gloves extends BaseClothing {
    protected String slot = "Gloves";

    public Gloves(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}