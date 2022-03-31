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
    protected abstract Clothing addModifier(Clothing clothing);

    protected Clothing modifiers(BaseClothing clothing) {
        int count = clothing.getRarirty().getCount();

        Clothing modClothing = (Clothing) clothing;
        for (int i = 0; i < count; i++){
            modClothing = addModifier(modClothing);
        }

        return modClothing;
    }

    
}
