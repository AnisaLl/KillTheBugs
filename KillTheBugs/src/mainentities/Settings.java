/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainentities;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 12.04.2016
 */
public class Settings extends Observable{
    private int themeID;
    private int musicVol;
    private int gameVol;

    
    public Settings(int themeID, int musicVol, int gameVol){
        this.themeID = themeID;
        this.musicVol = musicVol;
        this.gameVol = gameVol;
    }
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getGameVol() {
        return gameVol;
    }

    public int getMusicVol() {
        return musicVol;
    }

    public int getThemeID() {
        return themeID;
    }

    public void setGameVol(int gameVol) {
        this.gameVol = gameVol;
    }

    public void setMusicVol(int musicVol) {
        this.musicVol = musicVol;
    }

    public void setThemeID(int themeID) {
        this.themeID = themeID;
    }
   
}