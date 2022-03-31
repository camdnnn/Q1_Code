package Factory;

import Items.*;
import Modifiers.*;
import Rarities.*;

public class EvenFactory extends ClothingFactory {

    @Override
    protected BaseClothing slot(Rarirty rarirty) {
        int slot = random.nextInt(10);

        slot = 1;

        if (slot == 0){
            return new Amulet();
        } else if (slot == 1) {
            return new Belt(rarirty);
        } else if (slot == 2) {
            return new Boots();
        } else if (slot == 3) {
            return new ChestPiece();
        } else if (slot == 4) {
            return new Gloves();
        } else if (slot == 5) {
            return new Helm();
        } else if (slot == 6) {
            return new Pants();
        } else if (slot == 7) {
            return new Pauldron();
        } else if (slot == 8) {
            return new Ring();
        } else {
            return new Shield();
        }
    }

    @Override
    protected Rarirty rarity() {
        int rarity = random.nextInt(7);

        if (rarity == 0){
            return new Common();
        } else if (rarity == 1) {
            return new Uncommon();
        } else if (rarity == 2) {
            return new Rare();
        } else if (rarity == 3) {
            return new Epic();
        } else if (rarity == 4) {
            return new Mythic();
        } else if (rarity == 5) {
            return new Legendary();
        } else {
            return new Unique();
        }
    }

    @Override
    protected Clothing modifiers(BaseClothing clothing) {
        int count = clothing.getRarirty().getCount();

        Clothing modClothing = (Clothing) clothing;
        for (int i = 0; i < count; i++){
            modClothing = chooseModifier(modClothing);
        }

        return modClothing;
    }

    @Override
    protected Clothing chooseModifier(Clothing clothing){
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
