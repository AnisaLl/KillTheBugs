package gamefieldentities;
import GFI.WeaponView;

public class Weapon extends GMActor{
	private int price;
	private int frequency;
	private String name;
	private boolean status;
	static WeaponView view;
	
	public Weapon(int x, int y)
	{
            super(x, y);
            price = 0;
            frequency = 0;
            name ="";
            status = true;
            view = new WeaponView();
	}
	public Weapon(int x, int y, int price, int frequency, String name, boolean status)
	{
            super(x, y);
		this.price = price;
		this.frequency = frequency;
		this.name = name;
		this.status = status;
		view = new WeaponView();
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
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean getStatus()
	{
		return status;
	}
	
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	
}
