package GFI;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CoinView {
	private BufferedImage coin;
	
	public CoinView() {
		try {
			this.coin = ImageIO.read(new File("pictures\\coin.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getGrenade() {
		return coin;
	}

	public void setGrenade(BufferedImage coin) {
		this.coin = coin;
	}

	
	

}
