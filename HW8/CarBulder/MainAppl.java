

public class MainAppl {
	public static void main(String[] args) {
		
		Car.CarBuilder car = Car.getCar().addColor("black").addModel("Subaru").addPassangerCapacity(5).addEngineCapacity(425);
		System.out.println(car);
		Car.CarBuilder someCar = Car.getCar().addColor("White").addModel("Opel").addPassangerCapacity(4).addEngineCapacity(330);
		System.out.println(someCar);
	}
	
	
}
