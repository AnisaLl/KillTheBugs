package GFI;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class WeaponView {
	private BufferedImage pistol,rifle,machineGun;
	
	public WeaponView() {
		try {
			this.pistol = ImageIO.read(new File("src\\pictures\\pistol.png"));
			this.rifle = ImageIO.read(new File("src\\pictures\\rifle.png"));
			this.machineGun = ImageIO.read(new File("src\\pictures\\machineGun.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getPistol() {
		return pistol;
	}

	public void setPistol(BufferedImage pistol) {
		this.pistol = pistol;
	}

	public BufferedImage getRifle() {
		return rifle;
	}

	public void setRifle(BufferedImage rifle) {
		this.rifle = rifle;
	}

	public BufferedImage getMachineGun() {
		return machineGun;
	}

	public void setMachineGun(BufferedImage machineGun) {
		this.machineGun = machineGun;
	}
	
	

}
