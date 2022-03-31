package Factory;

import java.util.Random;

import Items.BaseClothing;
import Items.Clothing;
import Rarities.Rarity;

public abstract class ClothingFactory {

    Random random = new Random();

    public Clothing generate() throws Exception {
        return modifiers(slot(rarity()));
    }

    protected abstract Rarity rarity();
    protected abstract BaseClothing slot(Rarity rarity);
    protected abstract Clothing addModifier(Clothing clothing) throws Exception;

    protected Clothing modifiers(BaseClothing clothing) throws Exception {
        int count = clothing.getRarity().getCount();

        Clothing modClothing = (Clothing) clothing;
        for (int i = 0; i < count; i++){
            modClothing = addModifier(modClothing);
        }

        return modClothing;
    }
    
}
