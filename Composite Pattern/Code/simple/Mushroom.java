package lab8.simple;

import lab8.Plant;

public class Mushroom implements Plant {
	public double getOxigenAmountPerYear() {
		return 1.3;
	}

	public int getLifeTime() {
		return 3;
	}

	public String getRepresentation() {
		return "M";
	}
}
