/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefieldentities;
import GFI.BulletView;

/**
 *
 * @author Cüneyt EREM
 */

public class Bullet {
	private final int SPEED;
	private final int DAMAGE;
	static BulletView view;

	public Bullet() {
		SPEED = 5;
		DAMAGE = 10;
		view = new BulletView();
	}
	
	public int getSpeed() {
		return SPEED;
	}
}