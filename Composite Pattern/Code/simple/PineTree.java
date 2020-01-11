package lab8.simple;

import lab8.Plant;

public class PineTree implements Plant {
	public double getOxigenAmountPerYear() {
		return 3.3;
	}

	public int getLifeTime() {
		return 100;
	}

	public String getRepresentation() {
		return "P";
	}
}
