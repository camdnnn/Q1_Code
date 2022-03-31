package Rarities;

import Items.Clothing;

public class Common extends RarityDecorator {

	protected String rarity = "Common";

    public Common(Clothing clothing) {
        super(clothing);
    }
    
}
