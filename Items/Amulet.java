package Items;
import Rarities.Rarity;

public class Amulet extends BaseClothing {
    protected String slot = "Amulet";

    public Amulet(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}
