package Items;
import Rarities.Rarirty;

public class Boots extends BaseClothing {
    protected String slot = "Boots";

    public Boots(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}
