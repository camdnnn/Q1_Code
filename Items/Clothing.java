package Items;
import java.util.ArrayList;
import java.util.Random;

public abstract class Clothing {
    protected Random random = new Random();
	protected int rarity;
	protected String slot;
	public ArrayList<String> modifications;

	protected abstract String getRandomAttribute();
	protected abstract String getRarityDescription();
	public abstract String getDescription();
}
