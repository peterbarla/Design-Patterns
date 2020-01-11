package lab8;

import lab8.composite.Field;
import lab8.composite.Forest;
import lab8.simple.Flower;
import lab8.simple.Grass;
import lab8.simple.Mushroom;
import lab8.simple.OakTree;
import lab8.simple.PineTree;

public class Main {

	public static void main(String[] args) {
		Forest forest = new Forest();
		Field field1 = new Field();
		Grass g1 = new Grass();
		Flower f1 = new Flower();
		field1.add(g1);
		field1.add(f1);
		forest.add(field1);

		Field field2 = new Field();
		Mushroom m1 = new Mushroom();
		Mushroom m2 = new Mushroom();
		field2.add(m1);
		field2.add(m2);
		forest.add(field2);

		PineTree p1 = new PineTree();
		OakTree o1 = new OakTree();
		forest.add(p1);
		forest.add(o1);

		System.out.println(forest.getRepresentation());
		System.out.println(forest.getLifeTime());
		System.out.println(forest.getOxigenAmountPerYear());

		System.out.println(field1.getOxigenAmountPerYear());
		System.out.println(field1.getLifeTime());

		System.out.println(field2.getOxigenAmountPerYear());
		System.out.println(field2.getLifeTime());

	}

}
