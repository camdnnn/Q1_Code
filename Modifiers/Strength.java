package Modifiers;

import Items.Clothing;

public class Strength extends ClothingDecorator {

    public Strength(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return clothing.getDescription();
    }

    @Override
    public String[] getAttributes() {
        return clothing.getAttributes();
        
    }
    
}
