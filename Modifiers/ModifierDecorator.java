package Modifiers;
import Items.Clothing;

public abstract class ModifierDecorator implements Clothing{
    protected int layers;
    protected Clothing clothing;
    protected String modifier;

    public ModifierDecorator(Clothing clothing){
        if(clothing.getRarity().getCount() <= layers){
            this.clothing = clothing;
		}
    }
    
}
