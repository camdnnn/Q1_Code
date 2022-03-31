package Facotry;

import java.util.Random;

import Items.Clothing;
import Modifiers.*;
import Rarities.RarityDecorator;

public class AddModifiers {

    static Clothing addModifiers(RarityDecorator clothing){
        int count = clothing.getRarity();

        Clothing modClothing = (Clothing) clothing;
        for (int i = 0; i < count; i++){
            modClothing = chooseModifier(modClothing);
        }

        return modClothing;
    }

    private static Clothing chooseModifier(Clothing clothing){
        Random random = new Random();
        int modifier = random.nextInt(7);

        if (modifier == 0){
            return new Dexterity(clothing);
        } else if (modifier == 1) {
            return new ExpGain(clothing);
        } else if (modifier == 2) {
            return new FireResistance(clothing);
        } else if (modifier == 3) {
            return new Health(clothing);
        } else if (modifier == 4) {
            return new Intelligence(clothing);
        } else if (modifier == 5) {
            return new Mana(clothing);
        } else {
            return new Strength(clothing);
        }

    }


    
}
