package Factory;

import Items.*;
import Modifiers.*;
import Rarities.*;

public class BossFactory extends ClothingFactory {

    @Override
    protected Rarity rarity() {
        int rarity = random.nextInt(4);

        if (rarity == 0){
            return new Epic();
        } else if (rarity == 1) {
            return new Mythic();
        } else if (rarity == 2) {
            return new Legendary();
        } else {
            return new Unique();
        }
    }

    @Override
    protected BaseClothing slot(Rarity rarity) {
        int slot = random.nextInt(10);

        if (slot == 0){
            return new Amulet(rarity);
        } else if (slot == 1) {
            return new Belt(rarity);
        } else if (slot == 2) {
            return new Boots(rarity);
        } else if (slot == 3) {
            return new ChestPiece(rarity);
        } else if (slot == 4) {
            return new Gloves(rarity);
        } else if (slot == 5) {
            return new Helm(rarity);
        } else if (slot == 6) {
            return new Pants(rarity);
        } else if (slot == 7) {
            return new Pauldron(rarity);
        } else if (slot == 8) {
            return new Ring(rarity);
        } else {
            return new Shield(rarity);
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

