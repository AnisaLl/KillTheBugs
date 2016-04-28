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
import javax.swing.JPanel;

public class BugView extends GMActor{
	//private BufferedImage spiderImg,wormImg,cockroachImg,fleaImg;
        private BufferedImage img;
    
	public BugView(String path) {
		try {
//			this.spiderImg = ImageIO.read(new File("pictures\\spider.png"));
//			this.wormImg = ImageIO.read(new File("pictures\\worm.png"));
//			this.cockroachImg = ImageIO.read(new File("pictures\\cockroach.png"));
//			this.fleaImg = ImageIO.read(new File("pictures\\flea.png"));
                        this.img = ImageIO.read(new File(path));
                        add(new JLabel(new ImageIcon(img)));
                        
		} catch (IOException e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

//	public BufferedImage getSpiderImg() {
//		return spiderImg;
//	}
//
//	public void setSpiderImg(BufferedImage spiderImg) {
//		this.spiderImg = spiderImg;
//	}
//
//	public BufferedImage getWormImg() {
//		return wormImg;
//	}
//
//	public void setWormImg(BufferedImage wormImg) {
//		this.wormImg = wormImg;
//	}
//
//	public BufferedImage getCockroachImg() {
//		return cockroachImg;
//	}
//
//	public void setCockroachImg(BufferedImage cockroachImg) {
//		this.cockroachImg = cockroachImg;
//	}
//
//	public BufferedImage getFleaImg() {
//		return fleaImg;
//	}
//
//	public void setFleaImg(BufferedImage fleaImg) {
//		this.fleaImg = fleaImg;
//	}
//	

}
