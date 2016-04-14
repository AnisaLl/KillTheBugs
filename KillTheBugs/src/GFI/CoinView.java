/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Cüneyt EREM
 */

public class CoinView {
	static ImageIcon icon;      //this will change later
	 JLabel label;
	
public CoinView() {
		icon = new ImageIcon("",
            "coin");
		label = new JLabel(icon);
	}
}
