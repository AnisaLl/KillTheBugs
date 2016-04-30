/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;

import gamefieldentities.Bug;
import gamefieldentities.Bullet;
import gamefieldentities.SuperWeapon;
import gamefieldentities.Tile;
import gamefieldentities.Weapon;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GameManagement.GameManager;
import maininterface.Button;

public class GameView extends JPanel {
	private final int BUTTONWIDTH = 50, BUTTONHEIGHT = 60;
	// JPanel buttonsPanel;
	JLabel moneyLabel;
	JLabel scoreLabel;
	private Button pistol, rifle, machineGun, laserGun, grenade;
	private Button pauseButton;

	// Views
	FieldView fieldView;
	GroceriesView groceriesView;
	GameManager controller;
	BugView bugView;
	WeaponView weaponView;
	LaserGunView laserGunView;
	GrenadeView grenadeView;

	public GameView(GameManager controller) {
		this.controller = controller;
		this.setLayout(null);
		bugView = new BugView();
		weaponView = new WeaponView();
		groceriesView = new GroceriesView();
		laserGunView = new LaserGunView();
		grenadeView = new GrenadeView();

		moneyLabel = new JLabel("Money = " + controller.getMoneyAccount().toString());
		moneyLabel.setBounds(20, 0, 100, 100);
		this.add(moneyLabel);
		scoreLabel = new JLabel("Score = " + controller.getScore().toString());
		scoreLabel.setBounds(150, 0, 100, 100);
		this.add(scoreLabel);

		pistol = new Button("Buy", "src/pictures/pistol.png");
		pistol.addActionListener(controller);
		pistol.setBounds(400, 0, BUTTONWIDTH, BUTTONHEIGHT);
		this.add(pistol);
		rifle = new Button("Buy", "src/pictures/rifle.png");
		rifle.addActionListener(controller);
		rifle.setBounds(400 + BUTTONWIDTH + 5, 0, BUTTONWIDTH, BUTTONHEIGHT);
		this.add(rifle);
		machineGun = new Button("Buy", "src/pictures/machineGun.png");
		machineGun.addActionListener(controller);
		machineGun.setBounds(400 + 2 * (BUTTONWIDTH + 5), 0, BUTTONWIDTH, BUTTONHEIGHT);
		this.add(machineGun);

		laserGun = new Button("Buy", "src/pictures/laserGun.png");
		laserGun.addActionListener(controller);
		laserGun.setBounds(400 + 3 * (BUTTONWIDTH + 5) + 20, 0, BUTTONWIDTH, BUTTONHEIGHT);
		this.add(laserGun);
		grenade = new Button("Buy", "src/pictures/grenade.png");
		grenade.addActionListener(controller);
		grenade.setBounds(400 + 4 * (BUTTONWIDTH + 5) + 20, 0, BUTTONWIDTH, BUTTONHEIGHT);
		this.add(grenade);

		pauseButton = new Button("Pause");
		pauseButton.addActionListener(controller);
		pauseButton.setBounds(250, 0, BUTTONWIDTH * 2, BUTTONHEIGHT);
		this.add(pauseButton);
	}

	public void paint(Graphics g) {
		super.paint(g);
		displayTiles(g);
		displayBug(g);
		displayWeapon(g);
		displaySuperWeapon(g);
		displayBullet(g);
		displayGroceries(g);
		moneyLabel.setText("Money = " + controller.getMoneyAccount().toString());
		scoreLabel.setText("Score = " + controller.getScore().toString());
		controller.mainFrame.validate();
	}

	public void displayTiles(Graphics g) {
		// print tiles
		for (int i = 0, index = 0; i < controller.getTileBag().size(); i++, index++) {
			Tile tile = controller.getTileBag().get(i);
			if (index % 2 == 0)
				g.setColor(Color.green);
			else
				g.setColor(Color.yellow);
			if (i % 12 == 11)
				index--;
			g.fillRect(tile.getX(), tile.getY(), controller.TILE_WIDTH, controller.TILE_WIDTH);
		}
	}

	public void displayBug(Graphics g) {
		// print bugs
		g.setColor(Color.black);
		for (Bug bug : controller.getBugBag()) {
			if (bug.getType() == 0)
				g.drawImage(bugView.getSpiderImg(), bug.getX(), bug.getY(), null);
			else if (bug.getType() == 1)
				g.drawImage(bugView.getCockroachImg(), bug.getX(), bug.getY(), null);
			else if (bug.getType() == 2)
				g.drawImage(bugView.getWormImg(), bug.getX(), bug.getY(), null);
			else if (bug.getType() == 3)
				g.drawImage(bugView.getAntImg(), bug.getX(), bug.getY(), null);
			else
				g.drawImage(bugView.getFleaImg(), bug.getX(), bug.getY(), null);
		}
	}

	public void displayWeapon(Graphics g) {
		for (Weapon weapon : controller.getWeaponBag()) {
			if (weapon.getType() == 0)
				g.drawImage(weaponView.getPistol(), weapon.getX(), weapon.getY(), null);
			else if (weapon.getType() == 1)
				g.drawImage(weaponView.getRifle(), weapon.getX(), weapon.getY(), null);
			else if (weapon.getType() == 2)
				g.drawImage(weaponView.getMachineGun(), weapon.getX(), weapon.getY(), null);
		}
	}

	public void displaySuperWeapon(Graphics g) {
		for (SuperWeapon superWeapon : controller.getSuperWeaponBag()) {
			if (superWeapon.getType() == 0)
				g.drawImage(laserGunView.getLaserGun(), superWeapon.getX(), superWeapon.getY(), null);
			else
				g.drawImage(grenadeView.getGrenade(), superWeapon.getX(), superWeapon.getY(), null);
		}
	}

	public void displayGroceries(Graphics g) {
		g.drawImage(groceriesView.getBread(), 0, 80, null);
		g.drawImage(groceriesView.getCheese(), 0, 140, null);
		g.drawImage(groceriesView.getFlower(), 0, 200, null);
		g.drawImage(groceriesView.getChocolate(), 0, 260, null);
		g.drawImage(groceriesView.getFruitBasket(), 0, 320, null);
	}

	public void displayBullet(Graphics g) {
		for (Bullet bullet : controller.getBulletBag()) {
			g.fillOval(bullet.getX(), bullet.getY(), 10, 10);
		}
	}

	public Button getPistol() {
		return pistol;
	}

	public void setPistol(Button pistol) {
		this.pistol = pistol;
	}

	public Button getRifle() {
		return rifle;
	}

	public void setRifle(Button rifle) {
		this.rifle = rifle;
	}

	public Button getMachineGun() {
		return machineGun;
	}

	public void setMachineGun(Button machineGun) {
		this.machineGun = machineGun;
	}

	public Button getLaserGun() {
		return laserGun;
	}

	public void setLaserGun(Button laserGun) {
		this.laserGun = laserGun;
	}

	public Button getGrenade() {
		return grenade;
	}

	public void setGrenade(Button grenade) {
		this.grenade = grenade;
	}

	public Button getPauseButton() {
		return pauseButton;
	}

	public void setPauseButton(Button pauseButton) {
		this.pauseButton = pauseButton;
	}

}
