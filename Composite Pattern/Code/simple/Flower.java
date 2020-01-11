package lab8.simple;

import lab8.Plant;

public class Flower implements Plant {
	public double getOxigenAmountPerYear() {
		return 1.1;
	}

	public int getLifeTime() {
		return 1;
	}

	public String getRepresentation() {
		return "F";
	}

}
