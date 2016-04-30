package GFI;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class LaserGunView {
	private BufferedImage laserGun;
	
	public LaserGunView() {
		try {
			this.laserGun = ImageIO.read(new File("src\\pictures\\laserGun.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getLaserGun() {
		return laserGun;
	}

	public void setLaserGun(BufferedImage laserGun) {
		this.laserGun = laserGun;
	}
	
}
