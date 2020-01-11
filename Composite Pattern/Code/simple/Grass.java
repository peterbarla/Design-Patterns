package lab8.simple;

import lab8.Plant;

public class Grass implements Plant {
	public double getOxigenAmountPerYear() {
		return 1.2;
	}

	public int getLifeTime() {
		return 2;
	}

	public String getRepresentation() {
		return "G";
	}
}
