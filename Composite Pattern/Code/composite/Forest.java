package lab8.composite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

import lab8.Plant;

public class Forest implements Plant {
	private ArrayList<Plant> list;

	public Forest() {
		list = new ArrayList();
	}

	public void add(Plant p) {
		list.add(p);
	}

	public void remove(Plant p) {
		list.remove(p);
	}

	public double getOxigenAmountPerYear() {
		return (list.stream().mapToDouble(x -> x.getOxigenAmountPerYear()).sum());
	}

	public int getLifeTime() {
		return (list.stream().mapToInt(x -> x.getLifeTime()).max().orElse(0));
	}

	public String getRepresentation() {
		return list.stream().map(n -> n.getRepresentation()).collect(Collectors.joining(",", "{", "}"));
	}

}
