package Items;

import Rarities.Rarirty;

public class Pants extends BaseClothing {
    protected String slot = "Pants";

    public Pants(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}