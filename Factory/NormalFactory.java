package Factory;

import Items.*;
import Modifiers.*;
import Rarities.*;

public class NormalFactory extends ClothingFactory {

    @Override
    protected Rarity rarity() {
        double rarity = random.nextDouble();

        if (rarity < 0.5){
            return new Common();
        } else if (rarity < 0.75) {
            return new Uncommon();
        } else if (rarity < 0.825) {
            return new Rare();
        } else {
            return new Epic();
        }
    }

    @Override
    protected BaseClothing slot(Rarity rarity) {
        int slot = random.nextInt(4);

        if (slot == 0){
            return new Belt(rarity);
        } else if (slot == 1) {
            return new Boots(rarity);
        } else if (slot == 2) {
            return new Gloves(rarity);
        } else {
            return new Pants(rarity);
        }
    }

    @Override
    protected Clothing addModifier(Clothing clothing) throws Exception{
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
