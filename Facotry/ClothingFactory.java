package Facotry;

import java.util.Random;

import Items.Clothing;
import Rarities.RarityDecorator;

public abstract class ClothingFactory {

    Random random = new Random();

    public Clothing generate() {
        return modifiers(rarity(slot()));
    }
    protected abstract Clothing slot();
    protected abstract RarityDecorator rarity(Clothing clothing);
    protected abstract Clothing modifiers(RarityDecorator clothing);
    protected abstract Clothing chooseModifier(Clothing clothing);

    
}
