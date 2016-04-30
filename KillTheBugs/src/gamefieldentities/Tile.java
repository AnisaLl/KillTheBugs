package gamefieldentities;

import GameMapUtility.GMActor;

public class Tile extends GMActor{
    
    private boolean status;
    
    public Tile(int x, int y, boolean status,int row)
    {
        super(x, y,row);
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
