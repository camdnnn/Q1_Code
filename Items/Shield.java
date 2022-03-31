package Items;

import Rarities.Rarirty;

public class Shield extends BaseClothing {
    protected String slot = "Shield";

    public Shield(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return slot;
    }
    
}