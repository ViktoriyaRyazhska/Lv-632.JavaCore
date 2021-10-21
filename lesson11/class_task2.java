package lesson11;

import lesson11.Plant.Color;
import lesson11.Plant.ColorException;
import lesson11.Plant.Type;
import lesson11.Plant.TypeException;

public class class_task2 {

	public static void main(String[] args) throws ColorException, TypeException {

		Plant[] flowers = new Plant[4];
		try {
			flowers[0] = new Plant(100, "Red", "Rose"); // ok
			System.out.println(flowers[0]);
		} catch (ColorException | TypeException e) {
			System.out.println(e.getMessage());
		}
		try {
			flowers[1] = new Plant(24, " Orange", "Camelia"); // Exception color and type
			System.out.println(flowers[1]);
		} catch (ColorException | TypeException e) {
			System.out.println(e.getMessage());
		}
		try {
			flowers[2] = new Plant(222, "Pink", "Lily");// ok
			System.out.println(flowers[2]);
		} catch (ColorException | TypeException e) {
			System.out.println(e.getMessage());
		}
		try {
			flowers[3] = new Plant(10, "White", "Orchid"); // Exception color
			System.out.println(flowers[3]);
		} catch (ColorException | TypeException e) {
			System.out.println(e.getMessage());
		}

	}
}
