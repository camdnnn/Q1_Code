package Rarities;

public class Rare extends Rarirty {

	protected String rarity = "Rare";
    protected int count = 2;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getCount() {
        return count;
    }

}
