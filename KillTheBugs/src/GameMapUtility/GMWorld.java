/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMapUtility;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 27.04.2016
 */
public class GMWorld {

    protected ImageIcon background;
    protected int width;
    protected int height;
    protected ArrayList<GMActor> currentActorList;
    
    public GMWorld(int width, int height)
    {
        this.width = width;
        this.height = height;
        
        
    }
    
    public boolean addObject(GMActor actor, int x, int y)
    {
        actor.addToWorld(x,y,this);
        
        if (this.isActorExists(actor)){
            System.out.println("Actor is added in the world.");
            return true;
        }
        else{
            System.out.println("Actor could not be added in the world.");
            return false;
        }
    }
    
    public boolean removeObject(GMActor actor)
    {
       actor.removeActor(this);
       
       
       if (!(this.isActorExists(actor))){
            System.out.println("Actor is added in the world.");
            return true;
        }
        else{
            System.out.println("Actor could not be added in the world.");
            return false;
        }
    }
      
    public boolean isActorExists(GMActor actor){
        int counter = -1;
        
        for(int i = 0 ;i<currentActorList.size();i++)
            if(actor.getName().equalsIgnoreCase(currentActorList.get(i).getName()))
                counter++;
        
        if(counter > -1)
            return true;
        else
            return false;
            
    }
    
}
