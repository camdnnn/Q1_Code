package Rarities;

public class Mythic extends Rarity {

	protected String rarity = "Mythic";
    protected int count = 4;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}
