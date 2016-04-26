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

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GroceriesView {
	private BufferedImage bread,cheese,chocolate,flower,fruitBasket;
	
	public GroceriesView() {
		try {
			this.bread = ImageIO.read(new File("pictures\\bread.png"));
			this.cheese = ImageIO.read(new File("pictures\\cheese.png"));
			this.chocolate = ImageIO.read(new File("pictures\\chocolate.png"));
			this.flower = ImageIO.read(new File("pictures\\flower.png"));
			this.fruitBasket = ImageIO.read(new File("pictures\\fruitBasket.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
	}

	public BufferedImage getBread() {
		return bread;
	}

	public void setBread(BufferedImage bread) {
		this.bread = bread;
	}

	public BufferedImage getCheese() {
		return cheese;
	}

	public void setCheese(BufferedImage cheese) {
		this.cheese = cheese;
	}

	public BufferedImage getChocolate() {
		return chocolate;
	}

	public void setChocolate(BufferedImage chocolate) {
		this.chocolate = chocolate;
	}

	public BufferedImage getFlower() {
		return flower;
	}

	public void setFlower(BufferedImage flower) {
		this.flower = flower;
	}

	public BufferedImage getFruitBasket() {
		return fruitBasket;
	}

	public void setFruitBasket(BufferedImage fruitBasket) {
		this.fruitBasket = fruitBasket;
	}

	
	

}
