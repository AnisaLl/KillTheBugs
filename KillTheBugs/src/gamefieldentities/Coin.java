/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefieldentities;
import GFI.CoinView;

/**
 *
 * @author Cüneyt EREM
 */

public class Coin extends GMActor {
	private int value;
	static CoinView view;
	
	public Coin(int x, int y, int value) {
            super(x, y);
            this.value = value;
            view = new CoinView();
	}
}