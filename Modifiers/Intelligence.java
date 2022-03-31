package Modifiers;

import Items.Clothing;

public class Intelligence extends ModifierDecorator {

    protected String modifier = "Intelligence + 5";

    public Intelligence(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + modifier + "\n";
    }
    
}
