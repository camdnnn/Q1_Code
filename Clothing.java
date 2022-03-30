import java.util.Random;

public abstract class Clothing {
    protected Random random = new Random();
	protected int rarity;
	protected String slot;
	protected String mod1;
	protected String mod2;
	protected String mod3;

	protected abstract String getRandomAttribute();
	protected abstract String getRarityDescription();
	public abstract String getDescription();
}
