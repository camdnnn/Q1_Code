package Modifiers;

import Items.Clothing;

public class FireResistance extends ModifierDecorator {

    protected String modifier = "Fire Resistance + 5";

    public FireResistance(Clothing clothing) throws Exception {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + modifier + "\n";
    }
    
}
