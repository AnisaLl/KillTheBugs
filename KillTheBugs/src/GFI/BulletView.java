/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;
import gamefieldentities.Bullet;

import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Cüneyt EREM
 */

public class BulletView{
	 private static final String Filename = null;
	 ImageIcon icon;
	 public JLabel label;
	 Bullet x;
	
	public BulletView() {
		icon = new ImageIcon("",
	            "bullet");
		label = new JLabel(icon);
		
		try {
                        FileInputStream in = new FileInputStream(Filename);
			AudioInputStream as = new AudioInputStream((TargetDataLine) in);
			Clip clip = AudioSystem.getClip();
			clip.open(as);
                        clip.start();
			 
		}catch (LineUnavailableException | IOException e) {
	        System.err.println(e.getMessage());
	    }
		
	}
	public void act() {
		//later on		
	}
}