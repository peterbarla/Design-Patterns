package lab9;

import java.awt.Graphics;

public class PizzaIngredient implements Pizza {

	protected Pizza pizza;

	public PizzaIngredient(Pizza p) {
		this.pizza = p;
	}

	@Override
	public void bake(Graphics g) {
		pizza.bake(g);

	}

	@Override
	public int getPrice() {
		// T
		return pizza.getPrice();
	}

	@Override
	public String getIngridients() {
		// TODO Auto-generated method stub
		return pizza.getIngridients();
	}
	
	public String getPizzaBaseType() {
		return pizza.getPizzaBaseType();
	}

}
