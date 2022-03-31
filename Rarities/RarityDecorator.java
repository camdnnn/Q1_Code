package Rarities;
import Items.Clothing;

public abstract class RarityDecorator implements Clothing{

    protected Clothing clothing;
	protected String rarity;

    public RarityDecorator(Clothing clothing){
        this.clothing = clothing;
    }

    public String getDescription() {
        return rarity + " " + clothing.getDescription() + ":\n";
    }
    
}
