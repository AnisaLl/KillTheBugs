package GameManagement;

import GE.Account;
import GFI.CoinView;
import gamefieldentities.Bug;
import gamefieldentities.Bullet;
import gamefieldentities.SuperWeapon;
import gamefieldentities.Tile;
import gamefieldentities.Weapon;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.Timer;
import maininterface.*;

/**
 * GameManager	- TODO
 *
 * @author Anisa Llaveshi
 * @version 1.00 2016/4/24
 */
public class GameManager implements ActionListener{
    //An instance of itself to ensure the singleton pattern
    private GameManager gameManager = null;
    private ArrayList<Bug> bugBag;
    private ArrayList<Bullet> bulletBag;
    private Weapon pistol;
    private Weapon machineGun;
    private SuperWeapon grenade;
    private SuperWeapon laserGun;
    private Account moneyAccount;
    private Account score;   
    
    private MainMenuView mainMenuView;
    //private GameView gameView;
    private HighScoreView highScoresView;
    private SettingsView settingsView;
    private HelpView helpView;
    private CreditsView creditsView;   
    //private BitsNPiecesView bitsNPiecesView;
    private CoinView coinView;
    private Test test;
    //private GroceryView groceryView;
    
    private CardLayout cl;
    private JPanel cardPanel;
    
    //private GameManager()
    public GameManager()
    {
        bugBag = new ArrayList<Bug>();
        bulletBag = new ArrayList<Bullet>();
        pistol = new Weapon(0, 0);
        machineGun = new Weapon(0, 0);
        //SuperWeapon needs a default constructor?
        grenade = new SuperWeapon(0, 0, 0, true);
        laserGun = new SuperWeapon(0, 0, 0, true);
        moneyAccount = new Account(0);
        score = new Account(0);
    }
    
    public GameManager getInstance()
    {
        if (gameManager == null)
            gameManager = new GameManager();
        
        return gameManager;            
    }
    
    //PROBLEMS
    //We are keeping a bug and bullet but the x and y coordinates of each are int their views!
    //I implemented it supposign we have getters for their views
//    public boolean checkCollision(Bug bug, Bullet bullet)
//    {
//       if (bug.getBugView().getX() == bullet.getView().getX() && bug.getView().getY() = bullet.getView().getY())
//           return true;
//       return false;
//    }
    
//    public void manageCollisions()
//    {
//        for (int i = 0; i < bugBag.size(); i++)
//        {
//            for (int j = 0; j < bulletBag.size(); j++)
//                if (checkCollision(bugBag.get(i), bulletBag.get(j)))
//                {
//                    bugBag.get(i).setHealth(bugBag.get(i).getHealth() - bulletBag.get(j).getDAMAGE());
//                    if (bugBag.get(i).getHealth() <= 0)
//                        updateScore(bugBag.get(i).getScoreValue());
//                }
//        }
//        //I need the width of the world to check if any bug is out of bounds
//        //Getters and setters are needed for the x and y coordinated of the views.
//        for (int i = 0; i < bugBag.size(); i++)
//        {
//            if (bugBag.get(i).getY() > GMWorld.WIDTH)
//                gameOver();
//        }
//    }
    
    public boolean updateMoneyAccount(int coinValue)
    {
        moneyAccount.setValue(moneyAccount.getValue() + coinValue);  
        return moneyAccount.getValue() >= 0;
    }
    
    //To be done in the end
    public boolean pause()
    {
        return true;
    }
    
    //To be done in the end
    public boolean continueGame()
    {
        return true;
    }
    
    public void gameOver()
    {
        //new GameOverDialog();
    }
    
    public boolean loadGame()
    {
        mainMenuView = new MainMenuView();
        //gameView = new GameView();
        highScoresView = new HighScoreView();
        settingsView = new SettingsView();
        helpView = new HelpView();
        creditsView = new CreditsView();
        test = new Test();
        addPanels();
        addListeners();   
        return true;
    }
    
    private void addPanels()
    {
        cl = new CardLayout();
        setCardPanel(new JPanel(cl));
        //getCardPanel().add(test, "0");
        getCardPanel().add(mainMenuView, "1");
        //cardPanel.add(gameView, "2");
        cardPanel.add(highScoresView, "3");
        cardPanel.add(settingsView, "4");
        cardPanel.add(helpView, "5");
        cardPanel.add(creditsView, "6");
        //cardPanel.add(bitsNPiecesView, "7");
        //cardPanel.add(coinView, "8");
	cl.show(getCardPanel(), "1");
    }
    
    public boolean updateScore(int scoreValue)
    {
        score.setValue(score.getValue() + scoreValue);  
        return score.getValue() >= 0;
    }
    
//    public void destroyRow(Tile tile)
//    {
//        for (int i = 0; i < bugBag.size(); i++)
//        {
//            if (bugBag.get(i).getView().getX() == tile.getX())
//            {
//                bugBag.remove(i);
//            }
//        }
//    }
    
//    public void destroySquare(Tile tile)
//    {
//        for (int i = 0; i < bugBag.size(); i++)
//        {
//            if (bugBag.get(i).getBugView().getX() == tile.getX())
//            {
//                bugBag.remove(i);
//            }
//        }
//    }
    
    //To be done
    public void getBitsNPieces()
    {
    }
    
    public void genCoins()
    {
        Timer timer = new Timer();
        //timer.schedule(new GenerateCoins(), 0, 5000);
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
    
    public void addListeners()
    {
        //Adding listeners to mainMenuView
        for (int i = 0; i < mainMenuView.getButtons().size(); i++)
        {
            mainMenuView.getButtons().get(i).addActionListener(this);
        } 
        highScoresView.getBackButton().addActionListener(this);
        creditsView.getBackButton().addActionListener(this);
        settingsView.getBackButton().addActionListener(this);
        helpView.getBackButton().addActionListener(this);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        
       
        
//        if (source == mainMenuView.getNewGameButton())
//        {
//            cl.show(getCardPanel(), "2");
//        }
        
//        for (int i = 0; i < gameView.getButtons().size(); i++)
//        {
//            gameView.getButtons().get(i).addActionListener(this);
//        }
        
        if (source == mainMenuView.getHighScoreButton())
        {
            cl.show(getCardPanel(), "3");
        }
        if (source == highScoresView.getBackButton()
                || source == settingsView.getBackButton()
                || source == creditsView.getBackButton()
                || source == helpView.getBackButton())
        {
            cl.show(getCardPanel(), "1");
        }
        
        if (source == mainMenuView.getSettingsButton())
        {
            cl.show(getCardPanel(), "4");
        }
//        for (int i = 0; i < settingsView.getButtons().get(i); i++)
//        {
//            mainMenuView.getButtons().get(i).addActionListener(this);
//        }
        
        if (source == mainMenuView.getHelpButton())
        {
            cl.show(getCardPanel(), "5");
        }
        if (source == mainMenuView.getCreditsButton())
        {
            cl.show(getCardPanel(), "6");
        }
    }
    
//    class GenerateCoins extends TimerTask
//    {
//        public void run()
//        {
//            gameView.getFieldView().addObject(new CoinView());
//        }
//    }
    
//    class GenerateBitsNPieces extends TimerTask
//    {
//        public void run()
//        {
//            gameView.getFieldView().addObject(new BitsNPiecesView());
//        }
//    }

    /**
     * @return the cardPanel
     */
    public JPanel getCardPanel() {
        return cardPanel;
    }

    /**
     * @param cardPanel the cardPanel to set
     */
    public void setCardPanel(JPanel cardPanel) {
        this.cardPanel = cardPanel;
    }
}
