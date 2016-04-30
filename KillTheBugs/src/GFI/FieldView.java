/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import gamefieldentities.*;

/**
 *
 * @author USER
 */

public class FieldView extends JPanel{
	private BugView bugView;
	private CoinView coinView;
	private WeaponView weaponView;
	private GrenadeView grenadeView;
	private LaserGunView laserGunView;
	private BulletView bulletView;
	
	private ArrayList<Bug> bugs;
	private ArrayList<Bullet> bullets;
	private ArrayList<Coin> coins;
	private ArrayList<Weapon> weapons;
	private ArrayList<SuperWeapon> superWeapons;
	private ArrayList<Tile> tiles;
	public FieldView(ArrayList<Bug> bugs, ArrayList<Bullet> bullets, ArrayList<Coin> coins, ArrayList<Weapon> weapons,
			ArrayList<SuperWeapon> superWeapons, ArrayList<Tile> tiles) {
		super();
		this.bugs = bugs;
		this.bullets = bullets;
		this.coins = coins;
		this.weapons = weapons;
		this.superWeapons = superWeapons;
		this.tiles = tiles;
		bugView = new BugView();
		coinView = new CoinView();
		weaponView = new WeaponView();
		grenadeView = new GrenadeView();
		laserGunView = new LaserGunView();
		bulletView = new BulletView();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Bug bug : bugs) {
			//g.drawImage(img, x, y, observer);
		}
	}
	
	
	
	
	
}