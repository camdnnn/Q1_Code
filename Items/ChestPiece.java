package Items;

import Rarities.Rarity;

public class ChestPiece extends BaseClothing {
    protected String slot = "Chest Piece";

    public ChestPiece(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }
    
}
