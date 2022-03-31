package Factory;

import Items.*;
import Modifiers.*;
import Rarities.*;

public class EvenFactory extends ClothingFactory {

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
    protected BaseClothing slot(Rarirty rarirty) {
        int slot = random.nextInt(10);

        slot = 1;

        if (slot == 0){
            return new Amulet(rarirty);
        } else if (slot == 1) {
            return new Belt(rarirty);
        } else if (slot == 2) {
            return new Boots(rarirty);
        } else if (slot == 3) {
            return new ChestPiece(rarirty);
        } else if (slot == 4) {
            return new Gloves(rarirty);
        } else if (slot == 5) {
            return new Helm(rarirty);
        } else if (slot == 6) {
            return new Pants(rarirty);
        } else if (slot == 7) {
            return new Pauldron(rarirty);
        } else if (slot == 8) {
            return new Ring(rarirty);
        } else {
            return new Shield(rarirty);
        }
    }

    @Override
    protected Clothing addModifier(Clothing clothing){
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
