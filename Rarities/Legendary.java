package Rarities;

public class Legendary extends Rarity {

	protected String rarity = "Legendary";
    protected int count = 5;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}
