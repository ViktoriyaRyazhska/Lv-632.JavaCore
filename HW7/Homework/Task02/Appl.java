package lesson007m;

import java.util.ArrayList;
import java.util.List;

public class Appl {

	  public static void main(String[] args) {

			Liner liner01 = new Liner(2864, 4);
			Liner liner02 = new Liner(1860, 2);
			Boat boat01 = new Boat(6, 20);
			Boat boat02 = new Boat(2, 6);
			Plane plane01 = new Plane(182, 10000);
			Plane plane02 = new Plane(12, 4000);
			Helicopter helicopter01 = new Helicopter(8, 1000, 2500);
			Helicopter helicopter02 = new Helicopter(2, 500, 1000);
			Bus bus01 = new Bus(39, "Kyiv-Rivne-Lviv");
			Bus bus02 = new Bus(39, "Lviv-Rivne-Kyiv");
			Motorcycle motorcycle01 = new Motorcycle(1, 220);
			Motorcycle motorcycle02 = new Motorcycle(2, 80);
			Car car01 = new Car(5, "Toyota");
			Car car02 = new Car(3, "Tavria");

			List<Passengers> listPass = new ArrayList<Passengers>();
			listPass.add(liner01);
			listPass.add(liner02);
			listPass.add(boat01);
			listPass.add(boat02);
			listPass.add(plane01);
			listPass.add(plane02);
			listPass.add(helicopter01);
			listPass.add(helicopter02);
			listPass.add(bus01);
			listPass.add(bus02);
			listPass.add(motorcycle01);
			listPass.add(motorcycle02);
			listPass.add(car01);
			listPass.add(car02);
		
			for (Passengers p : listPass) {
			if (p instanceof Liner) {((Liner) p).isSalling();}
			if (p instanceof Boat) {((Boat) p).isSalling();}
			if (p instanceof Plane) {((Plane) p).fly();}
			if (p instanceof Plane) {((Plane) p).land();}
			if (p instanceof Helicopter) {((Helicopter) p).fly();}
			if (p instanceof Helicopter) {((Helicopter) p).land();}
			if (p instanceof Bus) {((Bus) p).drive();}
			if (p instanceof Motorcycle) {((Motorcycle) p).drive();}
			if (p instanceof Car) {((Car) p).drive();}
			}
	  }

}
