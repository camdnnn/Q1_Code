package Items;

import Rarities.*;

public class Belt extends BaseClothing {
    public Belt(Rarirty rarirty) {
        super(rarirty);
    }

    protected String slot = "Belt";

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }

    @Override
    protected void setRarity() {
        rarirty = new Epic();
    }
    
}
