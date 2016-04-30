
package gamefieldentities;

import GameMapUtility.GMActor;

public class Bullet extends GMActor{
	private final int SPEED = 5;
	private final int DAMAGE = 20;

	public Bullet(int x, int y,int row) {
            super(x, y,row);
	}
	
	public int getSpeed() {
		return SPEED;
	}

	public int getDAMAGE() {
		return DAMAGE;
	}
	
}
