package lab9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mushroom extends PizzaIngredient {

	private BufferedImage img;

	public Mushroom(Pizza p) {
		super(p);
		try {
			img = ImageIO.read(new File("Resources/mushroom.png"));

		} catch (IOException e) {
			System.out.println("Could not load image mushroom!");
		}

	}

	public void bake(Graphics g) {
		super.bake(g);
		g.drawImage(img, 0, 0, null);
	}

	public int getPrice() {
		return super.getPrice() + 5;
	}

	public String getIngridients() {
		return super.getIngridients() + " mushroom";
	}

}
