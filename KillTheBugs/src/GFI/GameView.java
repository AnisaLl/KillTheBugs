/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;

import gamefieldentities.Bug;
import gamefieldentities.Bullet;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import maininterface.Button;

/**
 *
 * @author Anisa
 */
public class GameView extends JPanel{
    JPanel toolbarPanel;
    //JPanel buttonsPanel;
    JPanel fieldPanel;
    JPanel groceriesPanel;
    JPanel bugsPanel;
    JPanel buttonsPanel;
    JPanel accountsPanel;
    JLabel moneyLabel;
    JLabel scoreLabel;
    Button pauseButton;
    Button continueButton;
    ArrayList<JLabel> groceriesLabels;
    ArrayList<Button> buttonList;
    
    //Views
    FieldView fieldView;
    GroceriesView groceriesView;
    
    public GameView()
    {
        this.setLayout(new BorderLayout());
        buttonList = new ArrayList<Button>();
        setButtonList();
        setAccountLabels();
        //Panels initiliazation
        buttonsPanel = new JPanel(new GridLayout(1, 5));
        accountsPanel = new JPanel(new GridLayout(2, 2));
        toolbarPanel = new JPanel(new GridLayout(1, 2));
        
        accountsPanel.add(pauseButton);
        accountsPanel.add(continueButton);
        accountsPanel.add(moneyLabel);
        accountsPanel.add(scoreLabel);
        for (int i = 0; i < buttonList.size(); i++)
        {
            buttonsPanel.add(buttonList.get(i));
        }
        
        toolbarPanel.add(accountsPanel);
        toolbarPanel.add(buttonsPanel);
        
        groceriesView = new GroceriesView();
        this.add(groceriesView, BorderLayout.WEST);
        this.add(toolbarPanel, BorderLayout.NORTH);
    }
    
    private void setButtonList()
    {
//        JButton normalWeaponButton1;
//        JButton normalWeaponButton2;
//        JButton normalWeaponButton3;
//        JButton superWeaponButton1;
//        JButton superWeaponButton2;
        buttonList.add(new Button("Buy", "src/pictures/pistol.png"));
        buttonList.add(new Button("Buy", "src/pictures/rifle.png"));
        buttonList.add(new Button("Buy", "src/pictures/machinegun.png"));
        buttonList.add(new Button("Buy", "src/pictures/grenade.png"));
        buttonList.add(new Button("Buy", "src/pictures/lasergun.png"));
        
        pauseButton = new Button("Pause");
        continueButton  = new Button("Continue");
    }
    
    public void setAccountLabels()
    {
        moneyLabel = new JLabel("Account");
        scoreLabel = new JLabel("Score");
        
    }

    public GameView(ArrayList<Bug> bugBag, ArrayList<Bullet> bulletBag) {
        //fieldView = new FieldView(bugBag, bulletBag, coins, weapons, superWeapons, tiles)
    }
}
