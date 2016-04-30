package gamefieldentities;

import GameMapUtility.GMActor;


public class Weapon extends GMActor{
	private int price;
	private int frequency;
	private int type;
	private int remainingTime = 0;
	
	public Weapon(int x, int y,  int type,int row)
	{
        super(x, y,row);
        this.type = type;
        if(type == 0){
        	price = 10;
        	frequency = 1;
        }else if(type == 1){
        	price = 35;
        	frequency = 2;
        }else if(type == 2){
        	price = 50;
        	frequency = 3;
        }
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getFrequency()
	{
		return frequency;
	}
	
	public void setFrequency(int frequency)
	{
		this.frequency = frequency;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(int remainingTime) {
		this.remainingTime = remainingTime;
	}
	
	
	
}
