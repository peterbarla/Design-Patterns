package lab8.simple;

import lab8.Plant;

public class OakTree implements Plant {
	public double getOxigenAmountPerYear() {
		return 6.7;
	}

	public int getLifeTime() {
		return 150;
	}

	public String getRepresentation() {
		return "O";
	}
}
