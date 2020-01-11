package lab8.composite;

import java.util.HashSet;
import java.util.stream.Collectors;

import lab8.Plant;

public class Field implements Plant {
	private HashSet<Plant> set;

	public Field() {
		set = new HashSet();
	}

	public void add(Plant p) {
		set.add(p);
	}

	public void remove(Plant p) {
		set.remove(p);
	}

	public double getOxigenAmountPerYear() {
		return (set.stream().mapToDouble(x -> x.getOxigenAmountPerYear()).sum());
	}

	public int getLifeTime() {
		return (set.stream().mapToInt(x -> x.getLifeTime()).max().orElse(0));
	}

	public String getRepresentation() {
		return set.stream().map(n -> n.getRepresentation()).collect(Collectors.joining(",", "[", "]"));
	}
}
