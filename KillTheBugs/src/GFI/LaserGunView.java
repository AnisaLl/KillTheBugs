/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;

/**
 *
 * @author USER
 */

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class LaserGunView {
	private BufferedImage laserGun;
	
	public LaserGunView() {
		try {
			this.laserGun = ImageIO.read(new File("pictures\\worm.png"));
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
