package gamefieldentities;
import GFI.WeaponView;

public class Weapon{
	private int price;
	private int frequency;
	private String name;
	private boolean status;
	static WeaponView view;
	
	public Weapon()
	{
		price = 0;
		frequency = 0;
		name ='';
		status = true;
		view = new WeaponView();
	
	}
	public Weapon(int price, int frequency, Strign name, boolean status)
	{
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
