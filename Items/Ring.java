package Items;

import Rarities.Rarirty;

public class Ring extends BaseClothing {
    protected String slot = "Helm";

    public Ring(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return slot;
    }
    
}