package lab9;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private Pizza pizza;

	public MyPanel() {
		pizza = new Tomato(new Salami(new Mushroom(new Corn(new Olive(new PizzaBase())))));
		System.out.println(pizza.getPrice() + pizza.getIngridients());

	}

	@Override
	protected void paintComponent(Graphics g) {
		pizza.bake(g);
	}

}
