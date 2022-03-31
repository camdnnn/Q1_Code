package Items;
import Rarities.Rarirty;

public class Amulet extends BaseClothing {
    protected String slot = "Amulet";

    public Amulet(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}
