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
    private ArrayList<Button> buttonList;
    private Button normalWeaponButton1;
    private Button normalWeaponButton2;
    private Button normalWeaponButton3;
    private Button superWeaponButton1;
    private Button superWeaponButton2;
    
    //Views
    private FieldView fieldView;
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
        fieldView = new FieldView(5, 15);
        this.add(groceriesView, BorderLayout.WEST);
        this.add(toolbarPanel, BorderLayout.NORTH);
        this.add(fieldView, BorderLayout.CENTER);
        this.add(new JPanel(), BorderLayout.SOUTH);
        this.add(new JPanel(), BorderLayout.EAST);
    }
    
    private void setButtonList()
    {
        setNormalWeaponButton1(new Button("Buy", "src/pictures/pistol.png"));
        setNormalWeaponButton2(new Button("Buy", "src/pictures/rifle.png"));
        setNormalWeaponButton3(new Button("Buy", "src/pictures/machinegun.png"));
        setSuperWeaponButton1(new Button("Buy", "src/pictures/grenade.png"));
        setSuperWeaponButton2(new Button("Buy", "src/pictures/lasergun.png"));
    
        getButtonList().add(getNormalWeaponButton1());
        getButtonList().add(getNormalWeaponButton2());
        getButtonList().add(getNormalWeaponButton3());
        getButtonList().add(getSuperWeaponButton1());
        getButtonList().add(getSuperWeaponButton2());
        
        pauseButton = new Button("Pause");
        continueButton  = new Button("Continue");
    }
    
    public void setAccountLabels()
    {
        moneyLabel = new JLabel("Account");
        scoreLabel = new JLabel("Score");
        
    }

    /**
     * @return the buttonList
     */
    public ArrayList<Button> getButtonList() {
        return buttonList;
    }

    /**
     * @param buttonList the buttonList to set
     */
    public void setButtonList(ArrayList<Button> buttonList) {
        this.buttonList = buttonList;
    }

    /**
     * @return the normalWeaponButton1
     */
    public Button getNormalWeaponButton1() {
        return normalWeaponButton1;
    }

    /**
     * @param normalWeaponButton1 the normalWeaponButton1 to set
     */
    public void setNormalWeaponButton1(Button normalWeaponButton1) {
        this.normalWeaponButton1 = normalWeaponButton1;
    }

    /**
     * @return the normalWeaponButton2
     */
    public Button getNormalWeaponButton2() {
        return normalWeaponButton2;
    }

    /**
     * @param normalWeaponButton2 the normalWeaponButton2 to set
     */
    public void setNormalWeaponButton2(Button normalWeaponButton2) {
        this.normalWeaponButton2 = normalWeaponButton2;
    }

    /**
     * @return the normalWeaponButton3
     */
    public Button getNormalWeaponButton3() {
        return normalWeaponButton3;
    }

    /**
     * @param normalWeaponButton3 the normalWeaponButton3 to set
     */
    public void setNormalWeaponButton3(Button normalWeaponButton3) {
        this.normalWeaponButton3 = normalWeaponButton3;
    }

    /**
     * @return the superWeaponButton1
     */
    public Button getSuperWeaponButton1() {
        return superWeaponButton1;
    }

    /**
     * @param superWeaponButton1 the superWeaponButton1 to set
     */
    public void setSuperWeaponButton1(Button superWeaponButton1) {
        this.superWeaponButton1 = superWeaponButton1;
    }

    /**
     * @return the superWeaponButton2
     */
    public Button getSuperWeaponButton2() {
        return superWeaponButton2;
    }

    /**
     * @param superWeaponButton2 the superWeaponButton2 to set
     */
    public void setSuperWeaponButton2(Button superWeaponButton2) {
        this.superWeaponButton2 = superWeaponButton2;
    }

    /**
     * @return the fieldView
     */
    public FieldView getFieldView() {
        return fieldView;
    }

    /**
     * @param fieldView the fieldView to set
     */
    public void setFieldView(FieldView fieldView) {
        this.fieldView = fieldView;
    }
}
