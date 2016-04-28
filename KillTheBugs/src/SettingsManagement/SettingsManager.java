/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SettingsManagement;

import java.util.ArrayList;
import mainentities.Settings;
import maininterface.Sound;
import maininterface.Theme;
import maininterface.SettingsView;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 26.04.2016
 */
public class SettingsManager {
    private Settings currentSettings;
    private SettingsManager settingsManager;
    private ArrayList<Sound> gameSound;
    private Theme theme;
    private SettingsView settingsView;
    private static int themeID = 1;
    private int gameVol;
    private int musicVol;
    private boolean changeTheme(int ID){
        theme.changeTheme(ID);  
        if(theme.getID == ID)
            return true;
        else
            return false;
        
    }
    
    private void setTheme1(){
        settingsView.getRadioButton1().addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e){
                themeID = 1;
                if(e.getStateChange() == ItemEvent.SELECTED){
                    changeTheme(1);
                }
            }
        });
    }
    
    private void setTheme2(){
        settingsView.getRadioButton2().addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e){
                themeID = 2;
                if(e.getStateChange() == ItemEvent.SELECTED){
                    changeTheme(2);
                }
            }
        });
    }
    
    private void setTheme3(){
        settingsView.getRadioButton3().addItemListener(new ItemListener(){

           @Override
           public void itemStateChanged(ItemEvent e){
               themeID = 3;
               if(e.getStateChange() == ItemEvent.SELECTED){
                   changeTheme(3);
               }
           }
        });
        
    }
    private int setBackgroundSound(){ 
        settingsView.getBackgroundSlider().addChangeListener(new ChangeListener() {
             public void stateChanged(ChangeEvent e) {
                musicVol = ((JSlider)e.getSource()).getValue();
                settingsView.getBackgroundStatusLabel().setText("Value : " + musicVol);

             }
        }); 
        //setting sound
        //to do
        return musicVol;
    }
    
    private int setGameSound(){ 
        settingsView.getGameSlider().addChangeListener(new ChangeListener() {
             public void stateChanged(ChangeEvent e) {
                gameVol = ((JSlider)e.getSource()).getValue();
                settingsView.getGameStatusLabel().setText("Value : " +gameVol);
             }
        });
        //setting sound
        // to do
        return gameVol;
    } 
    
    private void setTheme(int ID){
        if(ID == 1){
            this.setTheme1();
            System.out.println("Theme 1 is successfully applied");
        }
        else if (ID == 2){
            this.setTheme2();
            System.out.println("Theme 2 is successfully applied");
        }
        else if (ID == 3){
            this.setTheme3();
            System.out.println("Theme 3 is successfully applied");
        }
        else
            System.out.println("Theme ID not found!");
        
        
    }
    
    public SettingsManager getInstance(int ID){
        this.setTheme(ID);
        this.setBackgroundSound();
        this.setGameSound();
        settingsManager = this;
        return settingsManager;
    }
}
