package gamefieldentities;

import GameMapUtility.GMActor;

public class Bug extends GMActor{
	
	private int health;
	private int speed;
	private int scoreValue;
	private int type;
	
	public Bug(int x, int y ,int type,int row)
	{
        super(x,y,row);
		this.setType(type);
        if(type == 0){//0 for spider
        	this.speed = 10;
        	this.health = 120;
        }else if(type == 1){//1 for Cockroach
        	this.speed = 50;
        	this.health = 80;
        }else if(type == 2){//2 for Worm
        	this.speed = 40;
        	this.health = 50;
        }else if(type == 3){//3 for ant
        	this.speed = 20;
        	this.health = 30;
        }else{//other for Flea
        	this.speed = 10;
        	this.health = 10;
        }
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	
}
