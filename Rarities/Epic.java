package Rarities;

public class Epic extends Rarirty {

	protected String rarity = "Epic";
    protected int count = 3;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}
