
public class MainAppl {
	
	public static void main(String[] args) {
		Liner liner = new Liner(150,4);
		Boat boat = new Boat(20,15);
		Plane plane = new Plane(100,600);
		Helicopter heli = new Helicopter(6,1500,2300);
		Bus bus = new Bus(30,"Lviv");
		Motorcycle moto = new Motorcycle(2,220);
		Car car = new Car("Tesla",4);
		liner.isSailing();
		boat.isSailing();
		plane.fly();
		plane.land();
		heli.fly();
		heli.land();
		bus.drive();
		moto.drive();
		car.drive();
		
	}
	
}
