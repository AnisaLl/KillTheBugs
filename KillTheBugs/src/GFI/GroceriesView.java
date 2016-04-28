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
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GroceriesView extends GMActor{
	private BufferedImage bread,cheese,chocolate,flower,fruitBasket;
        private JLabel breadLabel, cheeseLabel, chocolateLabel, flowerLabel, fruitBasketLabel;
	
	public GroceriesView() {
		try {
			this.bread = ImageIO.read(new File("src/pictures/bread.png"));
			this.cheese = ImageIO.read(new File("src/pictures/cheese.png"));
			this.chocolate = ImageIO.read(new File("src/pictures/chocolate.png"));
			this.flower = ImageIO.read(new File("src/pictures/flower.png"));
			this.fruitBasket = ImageIO.read(new File("src/pictures/fruitBasket.png"));
		} catch (Exception e) {
			System.out.println(this.toString() + " exception : "+ e);
		}
                this.setLayout(new GridLayout(5, 1));
                breadLabel = new JLabel(new ImageIcon(bread));
                cheeseLabel = new JLabel(new ImageIcon(cheese));
                chocolateLabel = new JLabel(new ImageIcon(chocolate));
                flowerLabel = new JLabel(new ImageIcon(flower));
                fruitBasketLabel = new JLabel(new ImageIcon(fruitBasket));
                
                this.add(breadLabel);
                this.add(cheeseLabel);
                this.add(chocolateLabel);
                this.add(flowerLabel);
                this.add(fruitBasketLabel);
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
