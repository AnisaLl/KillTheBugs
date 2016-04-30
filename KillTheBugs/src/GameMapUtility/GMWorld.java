
package GameMapUtility;
import java.util.ArrayList;

public class GMWorld {

    protected ArrayList<GMActor> currentActorList;
    
    public GMWorld()
    {
    	currentActorList = new ArrayList<GMActor>();
        
    }
    
    public boolean addObject(GMActor actor)
    {
    	return currentActorList.add(actor);
    }
    
    public boolean removeObject(GMActor actor)
    {
       if(isActorExists(actor)){
    	    currentActorList.remove(actor);
    	    return true;
       }
       return false;
    }
      
    public boolean isActorExists(GMActor actor){
    	return currentActorList.contains(actor);
    }
    
}
