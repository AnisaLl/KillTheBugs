package gamefieldentities;

import GFI.BugView;
import GameMapUtility.GMActor;

public class Bug extends GMActor{
	
	private int health;
	private int speed;
	private int scoreValue;
	private String name;
        private BugView bugView;
	
	public Bug(int x, int y ,String name, int health, int speed, int scoreValue)
	{
                super(x,y);
		this.name = name;
		this.health = health;
		this.speed = speed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public int getScoreValue()
	{
		return scoreValue;
	}
	
	public void setScoreValue(int scoreValue)
	{
		this.scoreValue = scoreValue;
	}

    /**
     * @return the bugView
     */
    public BugView getBugView() {
        return bugView;
    }

    /**
     * @param bugView the bugView to set
     */
    public void setBugView(BugView bugView) {
        this.bugView = bugView;
    }
	
}
