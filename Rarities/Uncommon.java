package Rarities;

public class Uncommon extends Rarirty {

	protected String rarity = "Uncommon";
    protected int count = 1;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}
