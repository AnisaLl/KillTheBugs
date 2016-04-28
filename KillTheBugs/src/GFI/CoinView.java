
package GFI;

/**
 *
 * @author USER
 */


import GameMapUtility.GMActor;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CoinView extends GMActor{
	private BufferedImage coin;
	
	public CoinView() {
		try {
			this.coin = ImageIO.read(new File("pictures\\coin.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getCoin() {
		return coin;
	}

	public void setCoin(BufferedImage coin) {
		this.coin = coin;
	}

}
