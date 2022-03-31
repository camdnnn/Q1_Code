package Items;

import Rarities.Rarirty;

public abstract class BaseClothing implements Clothing {
	protected String slot;
	protected Rarirty rarirty;
	
	protected abstract void setRarity();
	public Rarirty getRarirty() {
        return rarirty;
    }

	public BaseClothing(Rarirty rarirty){
		this.rarirty = rarirty;
	}
}
