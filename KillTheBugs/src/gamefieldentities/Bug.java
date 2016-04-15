package gamefieldentities;
import GFI.BugView;

public class Bug{
	
	private int health;
	private int speed;
	private int scoreValue;
	private String name;
	Static BugView view;
	
	public Bug(String name, int health, int speed, int scoreValue)
	{
		this.name = name;
		this.health = health;
		this.speed = speed;
		this.scoreValue = scoreValue;
		view = new BugView();
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
	
}
