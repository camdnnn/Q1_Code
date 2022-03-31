package Items;

import Rarities.Rarirty;

public class ChestPiece extends BaseClothing {
    protected String slot = "Chest Piece";

    public ChestPiece(Rarirty rarirty) {
        super(rarirty);
    }

    @Override
    public String getDescription() {
        return rarirty.getRarity() + " " + slot + ":\n";
    }
    
}
