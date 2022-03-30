package Modifiers;
import Items.Clothing;

public abstract class ClothingDecorator extends Clothing{

    protected Clothing clothing;

    public ClothingDecorator(Clothing clothing){
        this.clothing = clothing;
    }
    
}
