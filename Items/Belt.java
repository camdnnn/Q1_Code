package Items;
import Rarities.Rarity;

public class Belt extends BaseClothing {
    protected String slot = "Belt";

    public Belt(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}
