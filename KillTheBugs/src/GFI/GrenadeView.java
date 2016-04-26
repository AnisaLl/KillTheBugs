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

public class GrenadeView {
	private BufferedImage grenade;
	
	public GrenadeView() {
		try {
			this.grenade = ImageIO.read(new File("pictures\\grenade.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getGrenade() {
		return grenade;
	}

	public void setGrenade(BufferedImage grenade) {
		this.grenade = grenade;
	}

}
