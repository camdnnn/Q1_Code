package Rarities;

public class Common extends Rarity {

	protected String rarity = "Common";
    protected int count = 0;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}
