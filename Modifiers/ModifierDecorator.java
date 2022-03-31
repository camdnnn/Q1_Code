package Modifiers;

import Items.Clothing;
import Rarities.Rarity;

public abstract class ModifierDecorator implements Clothing{
    protected int count;
    protected Clothing clothing;
    protected String modifier;

    @Override
	public Rarity getRarity() {
        return clothing.getRarity();
    }

    @Override
    public int getCount(){
        return count;
    }

    public ModifierDecorator(Clothing clothing) throws Exception{
        count = clothing.getCount();
        if(clothing.getRarity().getCount() > count){
            this.clothing = clothing;
            count++;
        } else {
            throw new Exception("Too many modifiers added");
        }
    }
    
}
