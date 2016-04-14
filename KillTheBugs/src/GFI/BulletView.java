/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;
import gamefieldentities.Bullet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Cüneyt EREM
 */

public class BulletView{
	 ImageIcon icon;    //this will change later
	 public JLabel label;
	 Bullet x;
	
	public BulletView() {
		icon = new ImageIcon("",
	            "bullet");
		label = new JLabel(icon);
	}
	
	public void act() {
		//later on		
	}
}