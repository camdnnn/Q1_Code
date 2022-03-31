package Rarities;
import Items.Clothing;

public abstract class RarityDecorator implements Clothing{

    protected Clothing clothing;
	protected String rarity;
    protected int rarityCount;

    public abstract int getRarity();

    public RarityDecorator(Clothing clothing){
        this.clothing = clothing;
    }
    
}
