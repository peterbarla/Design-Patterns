package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab9.Corn;
import lab9.Pizza;
import lab9.PizzaBase;

public class testPizzaBaseBehaviour {

	@Test
	public void shouldBeAbleToGetPizzaBaseIngredientsWithAddedDecorator() {

		// Given
		String ingredients = "flour cheese egg corn";

		// when
		Pizza pizza = new Corn(new PizzaBase());

		// then
		assertTrue(pizza.getIngridients().equals(ingredients));

	}
	
	@Test
	public void shouldBeAbleToGetPizzaBasePrice() {

		// Given
		int pizzaBasePrice = 10;
		
		//when
		Pizza pizza = new PizzaBase();
		
		//then
		assertEquals(pizza.getPrice(),pizzaBasePrice);
	}

	@Test
	public void shouldBeAbleToGetPizzaBaseIngredients() {

		// Given
		String pizzaBaseIngredients = "flour cheese egg";
		
		//when
		Pizza pizza = new PizzaBase();
		
		//then
		assertTrue(pizza.getIngridients().equals(pizzaBaseIngredients));
	}

	@Test
	public void shouldBeAbleToGetPizzaBaseType() {

		// Given
		String pizzaBaseType = "Dry";

		// when
		Pizza pizza = new PizzaBase();

		// then
		assertTrue(pizza.getPizzaBaseType().equals(pizzaBaseType));
	}
}
