/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;

import GameMapUtility.GMActor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author USER
 */
public class TileView extends GMActor{
    int x, y;
    
    public TileView()
    {
        //this.setText("Tile");
        
        setLayout(new BorderLayout());
        this.add(new JButton("sjnf"), BorderLayout.CENTER);
        Border border = LineBorder.createGrayLineBorder();
        //this.setBorder(border);
        
    }
    
    public TileView(int x, int y)
    {
        //this.setText("Button");
        this.setSize(new Dimension(50, 50));
    }
}
