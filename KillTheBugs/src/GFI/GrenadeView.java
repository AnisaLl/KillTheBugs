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

public class GrenadeView extends GMActor{
	private BufferedImage grenade;
	
	public GrenadeView() {
		try {
			this.grenade = ImageIO.read(new File("src/pictures/grenade.png"));
                        this.add(new JLabel(new ImageIcon(grenade)));
                        
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
