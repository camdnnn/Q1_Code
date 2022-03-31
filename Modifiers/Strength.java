package Modifiers;

import Items.Clothing;

public class Strength extends ModifierDecorator {

    protected String modifier = "Strength + 5";

    public Strength(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + modifier + "\n";
    }
    
}
