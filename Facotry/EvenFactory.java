package Facotry;

import Items.*;
import Modifiers.*;
import Rarities.*;

public class EvenFactory extends ClothingFactory {

    @Override
    protected Clothing slot() {
        int slot = random.nextInt(10);

        if (slot == 0){
            return new Amulet();
        } else if (slot == 1) {
            return new Belt();
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
    protected RarityDecorator rarity(Clothing clothing) {
        int rarity = random.nextInt(7);

        if (rarity == 0){
            return new Common(clothing);
        } else if (rarity == 1) {
            return new Uncommon(clothing);
        } else if (rarity == 2) {
            return new Rare(clothing);
        } else if (rarity == 3) {
            return new Epic(clothing);
        } else if (rarity == 4) {
            return new Mythic(clothing);
        } else if (rarity == 5) {
            return new Legendary(clothing);
        } else {
            return new Unique(clothing);
        }
    }

    @Override
    protected Clothing modifiers(RarityDecorator clothing) {
        int count = clothing.getRarity();

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
