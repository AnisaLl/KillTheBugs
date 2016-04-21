/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefieldentities;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 21100426
 */
public class SuperWeapon extends Observable{
    
    private int price;
    private boolean status;
    
    public SuperWeapon(int price, boolean status){
        this.price = price;
        this.status = status;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}