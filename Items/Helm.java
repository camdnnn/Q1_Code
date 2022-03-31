package Items;

import Rarities.Rarirty;

public class Helm extends BaseClothing {
    protected String slot = "Helm";

    public Helm(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}
