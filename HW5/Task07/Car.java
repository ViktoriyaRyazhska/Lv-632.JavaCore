package lesson005m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Car {

	private String model;
	private int year;
	private Double engineCapacity;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Car(String model, int year, Double engineCapacity) {
		this.model = model;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return model + " [" + engineCapacity + ", " + year + "]";
	}

	public static void carsFromThisYear(Car[] cars, int inputY) {
		for (int i = 0; i < cars.length; i++) {
			if (inputY == cars[i].getYear()) {
				System.out.println(cars[i]);
			}
		}
	}

	public static void sortAllFieldCar(Car[] cars) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (true) {
			int fieldC = Integer.parseInt(br.readLine());
			if ((fieldC >= 1) && (fieldC <= 3)) {
				if (fieldC == 1) {
					Arrays.sort(cars, Comparator.comparing(Car::getModel));
					for (Car s : cars) {
						System.out.println(s);
					}
				}
				if (fieldC == 2) {
					Arrays.sort(cars, Comparator.comparing(Car::getYear));
					for (Car s : cars) {
						System.out.println(s);
					}
				}
				if (fieldC == 3) {
					Arrays.sort(cars, Comparator.comparing(Car::getEngineCapacity));
					for (Car s : cars) {
						System.out.println(s);
					}
				}
			} else {
				System.out.print("Try again: ");
				flag = false;
			}
		}
	}
	
}