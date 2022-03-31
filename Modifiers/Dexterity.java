package Modifiers;

import Items.Clothing;

public class Dexterity extends ModifierDecorator {

    protected String modifier = "Dexterity + 5";

    public Dexterity(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + modifier + "\n";
    }
    
}
