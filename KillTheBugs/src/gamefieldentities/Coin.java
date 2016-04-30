
package gamefieldentities;
import GameMapUtility.GMActor;

public class Coin extends GMActor {
	private int value;
	
	public Coin(int x, int y, int value,int row) {
            super(x, y,row);
            this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}