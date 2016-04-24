
package GameManagement;

import GE.Account;
import gamefieldentities.Bug;
import gamefieldentities.Bullet;
import gamefieldentities.SuperWeapon;
import gamefieldentities.Weapon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * GameManager	- TODO
 *
 * @author Anisa Llaveshi
 * @version 1.00 2016/4/24
 */
public class GameManager implements ActionListener{
    //An instance of itself to ensure the singleton pattern
    private GameManager gameManager;
    private ArrayList<Bug> bugBag;
    private ArrayList<Bullet> bulletBag;
    private Weapon pistol;
    private Weapon machineGun;
    private SuperWeapon grenade;
    private SuperWeapon laserGun;
    private Account moneyAccount;
    private Account score;
    
    private GameManager()
    {
        bugBag = new ArrayList<Bug>();
        bulletBag = new ArrayList<Bullet>();
        pistol = new Weapon();
        machineGun = new Weapon();
        //SuperWeapon needs a default constructor?
        grenade = new SuperWeapon(0, true);
        laserGun = new SuperWeapon(0, true);
        moneyAccount = new Account(0);
        score = new Account(0);
    }
    
    public GameManager getInstance()
    {
        if (gameManager != null)
            return gameManager;
        else
            return new GameManager();            
    }
    
    public void manageCollisions()
    {
    }
    public boolean checkCollision(Bug bug, Bullet bullet)
    {
    }
    
    public boolean updateMoneyAccount(int coinValue)
    {
    }
    
    public boolean pause()
    {
    }
    
    public boolean continueGame()
    {
        
    }
    
    public void gameOver()
    {
    }
    
    public boolean loadGame()
    {
    }
    
    public boolean updateScore(int scoreValue)
    {
    }
    
    public void destroyRow(Tile tile)
    {
    }
    
    public void destroySquare(Tile tile)
    {
    }
    
    public void getBitsNPieces()
    {
    }
    
    public void genCoins()
    {
    }
    
    

    /**
     * @return the bugBag
     */
    public ArrayList<Bug> getBugBag() {
        return bugBag;
    }

    /**
     * @param bugBag the bugBag to set
     */
    public void setBugBag(ArrayList<Bug> bugBag) {
        this.bugBag = bugBag;
    }

    /**
     * @return the bulletBag
     */
    public ArrayList<Bullet> getBulletBag() {
        return bulletBag;
    }

    /**
     * @param bulletBag the bulletBag to set
     */
    public void setBulletBag(ArrayList<Bullet> bulletBag) {
        this.bulletBag = bulletBag;
    }

    /**
     * @return the pistol
     */
    public Weapon getPistol() {
        return pistol;
    }

    /**
     * @param pistol the pistol to set
     */
    public void setPistol(Weapon pistol) {
        this.pistol = pistol;
    }

    /**
     * @return the machineGun
     */
    public Weapon getMachineGun() {
        return machineGun;
    }

    /**
     * @param machineGun the machineGun to set
     */
    public void setMachineGun(Weapon machineGun) {
        this.machineGun = machineGun;
    }

    /**
     * @return the grenade
     */
    public SuperWeapon getGrenade() {
        return grenade;
    }

    /**
     * @param grenade the grenade to set
     */
    public void setGrenade(SuperWeapon grenade) {
        this.grenade = grenade;
    }

    /**
     * @return the laserGun
     */
    public SuperWeapon getLaserGun() {
        return laserGun;
    }

    /**
     * @param laserGun the laserGun to set
     */
    public void setLaserGun(SuperWeapon laserGun) {
        this.laserGun = laserGun;
    }

    /**
     * @return the moneyAccount
     */
    public Account getMoneyAccount() {
        return moneyAccount;
    }

    /**
     * @param moneyAccount the moneyAccount to set
     */
    public void setMoneyAccount(Account moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    /**
     * @return the score
     */
    public Account getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Account score) {
        this.score = score;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
