
package gamefieldentities;


import GameMapUtility.GMActor;

public class SuperWeapon extends GMActor{
    
    private int price;
    private int type;
    private int remainingTime;
    
    public SuperWeapon(int x, int y, int type ,int row){
        super(x,y,row);
        this.price = 500;
        this.type = type;
        this.remainingTime = 25;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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