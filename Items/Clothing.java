package Items;

import java.util.ArrayList;

import Rarities.Rarity;

public interface Clothing {
	public abstract String getDescription();
	public Rarity getRarity();
	public int getCount();
}
