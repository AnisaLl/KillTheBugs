/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;
import gamefieldentities.Bug;
import java.util.ArrayList;

/**
 *
 * @author USER
 */

public class FieldView {

	private ArrayList<Integer> bugViewBag = new ArrayList<>();
	private ArrayList<Bug> bugs = new ArrayList<Bug>();
	private ArrayList<BulletView> bulletViewBag = new ArrayList<>();
	private ArrayList<BulletView> TILE_BAG = new ArrayList<>();
	private ArrayList<BulletView> weaponViewBag = new ArrayList<>();
	private ArrayList<BulletView> grenadeViewBag = new ArrayList<>();
	private ArrayList<BulletView> laserGunViewBag = new ArrayList<>();
	private final BulletView GROCERY_BAG = new BulletView();
	
	
	public FieldView() {
		bugViewBag.add(0);
		bugViewBag.add(1);
		//draw(bugs.get(0).getX() , bugs.get(0).getY(),bugview.image)
        }
}