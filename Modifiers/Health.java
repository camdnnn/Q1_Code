package Modifiers;

import Items.Clothing;

public class Health extends ModifierDecorator {

    protected String modifier = "Health + 5";

    public Health(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + modifier + "\n";
    }
    
}
