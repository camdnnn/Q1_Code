package Items;
import Rarities.Rarirty;

public class Belt extends BaseClothing {
    protected String slot = "Belt";

    public Belt(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}
