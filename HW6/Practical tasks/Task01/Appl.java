package lesson006c;

public class Appl {

	public static void main(String[] args) {
		Car[] cars = new Car[4];
		cars[0] = new Truck("Toyota Tundra", 160, 2014);
		cars[1] = new Truck("Toyota Tacoma", 140, 2000);
		cars[2] = new Sedan("Toyota Camry", 180, 2007);
		cars[3] = new Sedan("Toyota Avalon", 240, 2016);

		for (Car car : cars) {
			car.print();
		}
	}

}
