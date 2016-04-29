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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BugView extends GMActor{
	//private BufferedImage spiderImg,wormImg,cockroachImg,fleaImg;
        private BufferedImage img;
        private int lastX = 0;
    
	public BugView(String path) {
            try {
                    this.img = ImageIO.read(new File(path));
                    add(new JLabel(new ImageIcon(img)));

            } catch (IOException e) {
                    System.out.println(this.toString() + " exception : "+ e);
            }
                
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(10);} catch (Exception ex) {}
                }
            }
        });

        animationThread.start();
	}
        
        public void paintComponent(Graphics g) {
            //Graphics2D gg = (Graphics2D) g;

            int w = getWidth();
            int h = getHeight();

            int bugW = 100;
            int bugH = 10;
            int trainSpeed = 1;

            int x = lastX + trainSpeed;

            if (x > w + bugW) {
                x = -bugW;
            }

            g.drawImage(img, x, x, this);
            
            lastX = x;
        }

}

