/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GE;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 12.04.2016
 */
public class Account extends Observable {
    
    private int value;
    
    public Account(int value){
        this.value = value;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
