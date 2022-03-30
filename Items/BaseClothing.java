package Items;
import java.util.Random;

public abstract class BaseClothing extends Clothing {
    protected Random random = new Random();
	protected int rarity;
	protected String slot;

	protected abstract String getRandomAttribute();
	protected abstract String getRarityDescription();
    
}
