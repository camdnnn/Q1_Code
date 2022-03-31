package Modifiers;

import Items.Clothing;

public class FireResistance extends ModifierDecorator {

    protected String modifier = "Fire Resistance + 5";

    public FireResistance(Clothing clothing) {
        super(clothing);
    }

}
