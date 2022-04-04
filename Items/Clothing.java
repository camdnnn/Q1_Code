package Items;

import Rarities.Rarity;

public interface Clothing {
	public abstract String getDescription();
	public Rarity getRarity();
	public int getCount();
}
