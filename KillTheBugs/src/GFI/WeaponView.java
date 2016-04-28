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
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WeaponView extends GMActor{
	private BufferedImage image;
	
	public WeaponView(String path) {
		try {
//			this.pistol = ImageIO.read(new File("pictures\\pistol.png"));
//			this.rifle = ImageIO.read(new File("pictures\\rifle.png"));
//			this.machineGun = ImageIO.read(new File("pictures\\machineGun.png"));
                        this.image = ImageIO.read(new File(path));
                        add(new JLabel(new ImageIcon(image)));
		} catch (IOException ex) {
			System.out.println(this.toString() + " exception : "+ ex);
		}
	}

}
