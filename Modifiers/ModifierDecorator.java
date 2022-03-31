package Modifiers;
import Items.Clothing;

public abstract class ModifierDecorator implements Clothing{

    protected Clothing clothing;
    protected String modifier;

    public ModifierDecorator(Clothing clothing){
        this.clothing = clothing;
    }
    
}
