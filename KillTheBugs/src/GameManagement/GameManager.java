package GameManagement;

import GFI.GameView;
import gamefieldentities.*;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import GE.Account;
import maininterface.*;

public class GameManager implements ActionListener, MouseListener {
	public final int REFRESH_TIME = 40; // refresh time in milliseconds
	public final int TILE_WIDTH = 60; // a tile width
	private int bugFrequency = 100;
	public JFrame mainFrame;
	public Timer t;
	private int bugCounter = 0;
	private boolean isPistol = false, isRifle = false, isMachineGun = false, isLaserGun = false, isGrenade = false;
	// An instance of itself to ensure the singleton pattern
	private ArrayList<Bug> bugBag;
	private ArrayList<Bullet> bulletBag;
	private ArrayList<Weapon> weaponBag;
	private ArrayList<SuperWeapon> superWeaponBag;
	private ArrayList<Tile> tileBag;

	private Account moneyAccount;
	private Account score;

	private MainMenuView mainMenuView;
	private GameView gameView;
	private HighScoreView highScoresView;
	private SettingsView settingsView;
	private HelpView helpView;
	private CreditsView creditsView;

	private CardLayout cl;
	private JPanel cardPanel;

	public GameManager(GameFrame frame) {
		this.mainFrame = frame;
		bugBag = new ArrayList<Bug>();
		bulletBag = new ArrayList<Bullet>();
		t = new Timer(REFRESH_TIME, this);
		moneyAccount = new Account(1000);
		score = new Account(0);
	}

	public void updateMoneyAccount(int coinValue) {
		moneyAccount.setValue(moneyAccount.getValue() + coinValue);
	}



	public boolean gameOver() {
		for (Bug bug : bugBag) {
			if(bug.getX() < 0)
				return true;
		}
		return false;
	}

	public boolean loadGame() {
		mainMenuView = new MainMenuView();
		gameView = new GameView(this);
		highScoresView = new HighScoreView();
		settingsView = new SettingsView();
		helpView = new HelpView();
		creditsView = new CreditsView();
		// gameView = new GameView(bugBag, bulletBag);
		addPanels();
		addListeners();
		return true;
	}

	private void addPanels() {
		cl = new CardLayout();
		setCardPanel(new JPanel(cl));
		// getCardPanel().add(test, "0");
		getCardPanel().add(mainMenuView, "1");
		cardPanel.add(gameView, "2");
		cardPanel.add(highScoresView, "3");
		cardPanel.add(settingsView, "4");
		cardPanel.add(helpView, "5");
		cardPanel.add(creditsView, "6");
		// cardPanel.add(bitsNPiecesView, "7");
		// cardPanel.add(coinView, "8");
		cl.show(getCardPanel(), "1");
	}

	public void updateScore(int scoreValue) {
		score.setValue(score.getValue() + scoreValue);
	}

	public void addListeners() {
		// Adding listeners to mainMenuView
		for (int i = 0; i < mainMenuView.getButtons().size(); i++) {
			mainMenuView.getButtons().get(i).addActionListener(this);
		}
		highScoresView.getBackButton().addActionListener(this);
		creditsView.getBackButton().addActionListener(this);
		settingsView.getBackButton().addActionListener(this);
		helpView.getBackButton().addActionListener(this);
	}

	public void startGame() {
		t.start();
		moneyAccount = new Account(1000);
		score = new Account(0);
		bugBag = new ArrayList<Bug>();
		bulletBag = new ArrayList<Bullet>();
		weaponBag = new ArrayList<Weapon>();
		superWeaponBag = new ArrayList<SuperWeapon>();
		tileBag = new ArrayList<Tile>();
		System.out.println("Game started!");
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 12; j++)
				tileBag.add(new Tile(50 + j * (this.TILE_WIDTH), 70 + i * (this.TILE_WIDTH), true, i));

	}

	public void addRandomBugs() {
		bugCounter++;
		if (bugCounter == bugFrequency) {
			int randomBug = (int) (Math.random() * 5);
			int randomCoordinate = (int) (Math.random() * 5);
			bugBag.add(new Bug(800, randomCoordinate * (this.TILE_WIDTH) + 75, randomBug, randomCoordinate));
			bugCounter = 0;
		}
	}

	public void addBullet() {
		for (Weapon weapon : weaponBag) {
			if (weapon.getRemainingTime() < 0) {
				bulletBag.add(new Bullet(weapon.getX() + 20, weapon.getY(), weapon.getRow()));
				if (weapon.getType() == 0)
					weapon.setRemainingTime(300);
				else if (weapon.getType() == 1)
					weapon.setRemainingTime(150);
				else if (weapon.getType() == 2)
					weapon.setRemainingTime(100);
			} else
				weapon.setRemainingTime(weapon.getRemainingTime() - 1);
		}
	}

	public void moveObjects() {
		for (Bug bug : bugBag)
			bug.setX(bug.getX() - bug.getSpeed() / 20);
		for (Bullet bullet : bulletBag)
			bullet.setX(bullet.getX() + bullet.getSpeed());
	}

	public void handleCollision() {
		for (int i = 0; i < bulletBag.size(); i++)
			if (bulletBag.get(i).getX() > 1200) {
				bulletBag.remove(i);
				i--;
			}
		for (int i = 0; i < bugBag.size(); i++) {
			for (int j = 0; j < bulletBag.size(); j++) {
				if (bugBag.get(i).getRow() == bulletBag.get(j).getRow()
						&& bugBag.get(i).getX() < bulletBag.get(j).getX()) {
					bugBag.get(i).setHealth(bugBag.get(i).getHealth() - bulletBag.get(j).getDAMAGE());
					if (bugBag.get(i).getHealth() <= 0) {
						killBug(i);
						i--;
						break;
					}
					bulletBag.remove(j);
					j--;
				}
			}
		}
	}

	public void handleSuperWeapons() {
		for (int i = 0; i < superWeaponBag.size(); i++) {
			SuperWeapon superWeapon = superWeaponBag.get(i);
			if (superWeapon.getRemainingTime() < 0) {
				if (superWeapon.getType() == 0) {
					for (int j = 0; j < bugBag.size(); j++)
						if (superWeapon.getRow() == bugBag.get(j).getRow()
								&& bugBag.get(j).getX() > superWeapon.getX()) {
							killBug(j);
							j--;
							score.setValue(score.getValue()+10);
						}
				} else {
					for (int j = 0; j < bugBag.size(); j++)
						if (Math.abs(superWeapon.getRow()-bugBag.get(j).getRow()) < 2
								&& Math.abs(bugBag.get(j).getX()- superWeapon.getX()) < 200) {
							killBug(j);
							j--;
							score.setValue(score.getValue()+10);
						}
				}
				superWeaponBag.remove(i);
				i--;
			} else
				superWeapon.setRemainingTime(superWeapon.getRemainingTime() - 1);

		}
	}
	public void killBug(int index){
		if(index >= 0 && index < bugBag.size()){
			if(bugBag.get(index).getType() == 0){
				updateScore(50);
				updateMoneyAccount(25);
			}else if(bugBag.get(index).getType() == 1){
				updateScore(40);
				updateMoneyAccount(20);
			}else if(bugBag.get(index).getType() == 2){
				updateScore(30);
				updateMoneyAccount(15);
			}else if(bugBag.get(index).getType() == 3){
				updateScore(20);
				updateMoneyAccount(10);
			}else {
				updateScore(10);
				updateMoneyAccount(5);
			}
			bugBag.remove(index);
		}
	}
	public void pauseGame(){
		t.stop();
		gameView.repaint();
		this.mainFrame.validate();
	}
	public void resumeGame(){
		t.start();
		gameView.repaint();
		this.mainFrame.validate();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(t)) {
			addRandomBugs();
			addBullet();
			moveObjects();
			handleCollision();
			handleSuperWeapons();
			gameView.repaint();
			this.mainFrame.validate();
			if(gameOver()){
				t.stop();
				cl.show(getCardPanel(), "1");
			}
			
		} else {

			JButton source = (JButton) e.getSource();

			if (source == mainMenuView.getNewGameButton()) {
				startGame();
				cl.show(getCardPanel(), "2");
			}
			if (source == mainMenuView.getHighScoreButton()) {
				cl.show(getCardPanel(), "3");
			}
			if (source == highScoresView.getBackButton() || source == settingsView.getBackButton()
					|| source == creditsView.getBackButton() || source == helpView.getBackButton()) {
				cl.show(getCardPanel(), "1");
			}

			if (source == mainMenuView.getSettingsButton()) {
				cl.show(getCardPanel(), "4");
			}

			if (source == mainMenuView.getHelpButton()) {
				cl.show(getCardPanel(), "5");
			}
			if (source == mainMenuView.getCreditsButton()) {
				cl.show(getCardPanel(), "6");
			}else if (source == mainMenuView.getQuitButton()) {
				System.exit(0);
			}
			if (source == gameView.getPistol()) {
				isPistol = true;
				gameView.getPistol().setEnabled(false);

			} else if (source == gameView.getRifle()) {
				isRifle = true;
				gameView.getRifle().setEnabled(false);
			} else if (source == gameView.getMachineGun()) {
				isMachineGun = true;
				gameView.getMachineGun().setEnabled(false);

			} else if (source == gameView.getLaserGun()) {
				isLaserGun = true;
				gameView.getLaserGun().setEnabled(false);

			} else if (source == gameView.getGrenade()) {
				isGrenade = true;
				gameView.getGrenade().setEnabled(false);
			}else if (source == gameView.getPauseButton()) {
				if(t.isRunning()){
					gameView.getPauseButton().setText("Resume");
					pauseGame();
				}
				else{
					gameView.getPauseButton().setText("Pause");
					resumeGame();
				}
			}
		}
	}

	public JPanel getCardPanel() {
		return cardPanel;
	}

	public void setCardPanel(JPanel cardPanel) {
		this.cardPanel = cardPanel;
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (tileBag != null) {
			for (Tile tiles : tileBag)
				if (x >= tiles.getX() && x <= tiles.getX() + TILE_WIDTH && y >= tiles.getY()
						&& y <= tiles.getY() + TILE_WIDTH) {
					if (tiles.isStatus()) {
						if (isPistol) {
							weaponBag.add(new Weapon(tiles.getX(), tiles.getY() + 10, 0, tiles.getRow()));
							tiles.setStatus(false);
						} else if (isRifle) {
							weaponBag.add(new Weapon(tiles.getX(), tiles.getY() + 10, 1, tiles.getRow()));
							tiles.setStatus(false);
						} else if (isMachineGun) {
							weaponBag.add(new Weapon(tiles.getX(), tiles.getY() + 10, 2, tiles.getRow()));
							tiles.setStatus(false);
						} else if (isLaserGun) {
							superWeaponBag.add(new SuperWeapon(tiles.getX(), tiles.getY(), 0, tiles.getRow()));
						} else if (isGrenade) {
							superWeaponBag.add(new SuperWeapon(tiles.getX(), tiles.getY(), 1, tiles.getRow()));
						}
						isPistol = false;
						isRifle = false;
						isMachineGun = false;
						isLaserGun = false;
						isGrenade = false;
						gameView.getPistol().setEnabled(true);
						gameView.getRifle().setEnabled(true);
						gameView.getMachineGun().setEnabled(true);
						gameView.getLaserGun().setEnabled(true);
						gameView.getGrenade().setEnabled(true);
					}
					break;
				}
		}
	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Bug> getBugBag() {
		return bugBag;
	}

	public void setBugBag(ArrayList<Bug> bugBag) {
		this.bugBag = bugBag;
	}

	public ArrayList<Bullet> getBulletBag() {
		return bulletBag;
	}

	public void setBulletBag(ArrayList<Bullet> bulletBag) {
		this.bulletBag = bulletBag;
	}

	public ArrayList<Weapon> getWeaponBag() {
		return weaponBag;
	}

	public void setWeaponBag(ArrayList<Weapon> weaponBag) {
		this.weaponBag = weaponBag;
	}

	public Timer getT() {
		return t;
	}

	public void setT(Timer t) {
		this.t = t;
	}

	public ArrayList<Tile> getTileBag() {
		return tileBag;
	}

	public void setTileBag(ArrayList<Tile> tileBag) {
		this.tileBag = tileBag;
	}

	public JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public ArrayList<SuperWeapon> getSuperWeaponBag() {
		return superWeaponBag;
	}

	public void setSuperWeaponBag(ArrayList<SuperWeapon> superWeaponBag) {
		this.superWeaponBag = superWeaponBag;
	}

	public Account getMoneyAccount() {
		return moneyAccount;
	}

	public void setMoneyAccount(Account moneyAccount) {
		this.moneyAccount = moneyAccount;
	}

	public Account getScore() {
		return score;
	}

	public void setScore(Account score) {
		this.score = score;
	}
	

}
