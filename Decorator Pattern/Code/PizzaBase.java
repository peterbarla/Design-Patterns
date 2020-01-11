package lab9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PizzaBase implements Pizza {
	private BufferedImage img;
	private String pizzaBaseType;

	public PizzaBase() {

		try {
			img = ImageIO.read(new File("Resources/pizza_base.png"));

		} catch (IOException e) {
			System.out.println("Could not load image pizza_base!");
		}
	}

	public void bake(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

	public int getPrice() {
		return 10;
	}

	public String getIngridients() {
		return "flour cheese egg";
	}
	//added for TDD test type try
	public String getPizzaBaseType() {
		return "Dry";
	}

}
