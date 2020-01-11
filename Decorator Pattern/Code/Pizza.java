package lab9;

import java.awt.Graphics;

public interface Pizza {

	public void bake(Graphics g);

	public int getPrice();

	public String getIngridients();
	
	public String getPizzaBaseType();

}
