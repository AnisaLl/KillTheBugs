package gamefieldentities;

/**
 * Tile	- This class holds basic information about a tile of the game field
 *
 * @author Anisa Llaveshi
 * @version 1.00 2016/4/14
 */
public class Tile {
    
    private boolean status;
    
    public Tile(boolean status)
    {
        this.status = status;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
}
