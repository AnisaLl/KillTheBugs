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

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GroceriesView {
	static ImageIcon icon;
	 public JLabel label;
	
public GroceriesView() {
		icon = new ImageIcon("",
            "groceriew");
		label = new JLabel(icon);
	}
}
