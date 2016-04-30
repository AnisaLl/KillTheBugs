package GFI;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class BugView {
	private BufferedImage spiderImg,wormImg,cockroachImg,fleaImg,antImg;
	
	public BugView() {
		try {
			this.spiderImg = ImageIO.read(new File("src\\pictures\\spider.png"));
			this.wormImg = ImageIO.read(new File("src\\pictures\\worm.png"));
			this.cockroachImg = ImageIO.read(new File("src\\pictures\\cockroach.png"));
			this.fleaImg = ImageIO.read(new File("src\\pictures\\flea.png"));
			this.antImg = ImageIO.read(new File("src\\pictures\\ant.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getSpiderImg() {
		return spiderImg;
	}

	public void setSpiderImg(BufferedImage spiderImg) {
		this.spiderImg = spiderImg;
	}

	public BufferedImage getWormImg() {
		return wormImg;
	}

	public void setWormImg(BufferedImage wormImg) {
		this.wormImg = wormImg;
	}

	public BufferedImage getCockroachImg() {
		return cockroachImg;
	}

	public void setCockroachImg(BufferedImage cockroachImg) {
		this.cockroachImg = cockroachImg;
	}

	public BufferedImage getFleaImg() {
		return fleaImg;
	}

	public void setFleaImg(BufferedImage fleaImg) {
		this.fleaImg = fleaImg;
	}

	public BufferedImage getAntImg() {
		return antImg;
	}

	public void setAntImg(BufferedImage antImg) {
		this.antImg = antImg;
	}
	
	

}
