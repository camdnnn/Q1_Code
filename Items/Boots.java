package Items;
import Rarities.Rarity;

public class Boots extends BaseClothing {
    protected String slot = "Boots";

    public Boots(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}
