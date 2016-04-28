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

import GameMapUtility.GMActor;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaserGunView extends GMActor{
	private BufferedImage laserGun;
	
	public LaserGunView() {
		try {
			this.laserGun = ImageIO.read(new File("src/pictures/worm.png"));
                        this.add(new JLabel(new ImageIcon(laserGun)));
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
