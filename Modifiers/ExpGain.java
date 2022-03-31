package Modifiers;

import Items.Clothing;

public class ExpGain extends ModifierDecorator {

    protected String modifier = "Experiene Gain + 5";

    public ExpGain(Clothing clothing) {
        super(clothing);
    }

}
