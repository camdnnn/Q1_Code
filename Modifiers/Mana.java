package Modifiers;

import Items.Clothing;

public class Mana extends ModifierDecorator {

    protected String modifier = "Mana + 5";

    public Mana(Clothing clothing) {
        super(clothing);
    }
    
}
