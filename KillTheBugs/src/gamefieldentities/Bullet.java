/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefieldentities;

/**
 *
 * @author Cüneyt EREM
 */

public class Bullet extends GMActor{
	private final int SPEED;
	private final int DAMAGE;

	public Bullet(int x, int y) {
            super(x, y);
            SPEED = 5;
            DAMAGE = 10;
	}
	
	public int getSpeed() {
		return SPEED;
	}
}
