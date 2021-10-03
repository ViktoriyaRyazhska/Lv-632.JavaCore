

public class ApplCars {
	public static void main(String[] args) {
		
		Car[] cars = new Car[4];
		cars[0] =  new Truck("Truck N1",90,2009);
		cars[1] = new Truck("Truck N2",100,2011);
		cars[2] = new Sedan("Sedan N1",110,2007);
		cars[3] = new Sedan("Sedan N2",130,2021);
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].run();
			cars[i].stop();
		}
		
	}
}
