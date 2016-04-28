/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMapUtility;

import javax.swing.JPanel;

/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 27.04.2016
 */
public class GMActor extends JPanel{
    
    private int x, y;
    
    public GMActor(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public GMActor()
    {
        
    }

    void addToWorld(int x, int y, GMWorld aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void removeActor(GMWorld aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
