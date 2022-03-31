package Factory;

import java.util.Random;

import Items.BaseClothing;
import Items.Clothing;
import Rarities.Rarirty;

public abstract class ClothingFactory {

    Random random = new Random();

    public Clothing generate() {
        return modifiers(slot(rarity()));
    }

    protected abstract Rarirty rarity();
    protected abstract BaseClothing slot(Rarirty rarirty);
    protected abstract Clothing modifiers(BaseClothing clothing);
    protected abstract Clothing chooseModifier(Clothing clothing);

    
}
