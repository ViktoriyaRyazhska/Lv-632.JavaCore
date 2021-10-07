package lesson005m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Car car01 = new Car("AUDI Q5", 2019, 2.4);
		Car car02 = new Car("Chevrolet Tahoe", 2019, 5.3);
		Car car03 = new Car("Mazda CX-5", 2019, 2.0);
		Car car04 = new Car("Lada Granta", 2020, 1.6);
		Car car05 = new Car("Chrysler Grand Voyager", 2010, 3.6);
		Car car06 = new Car("Volkswagen Up", 2020, 1.0);

		Car[] cars = new Car[6];
		cars[0] = car01;
		cars[1] = car02;
		cars[2] = car03;
		cars[3] = car04;
		cars[4] = car05;
		cars[5] = car06;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("nSelect the Year of the car [for example 2010, 2019, 2020]: ");
		int inputY = Integer.parseInt(br.readLine());
		Car.carsFromThisYear(cars, inputY);

		System.out.print("\nSort source data (1 - by Model, 2 - by Year, 3 - by Engine Capacity): ");
		Car.sortAllFieldCar(cars);

	}
}
