package Rarities;

public class Unique extends Rarirty {

	protected String rarity = "Unique";
    protected int count = 6;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}
