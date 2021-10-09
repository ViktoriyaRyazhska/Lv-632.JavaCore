package HW7task2;

public class Appl {

	public static void main(String[] args) {
		
		Passengers[] pas=new Passengers[7];
		pas[0]=new Liner("Lincoln", 150, 3);
		pas[1]=new Boat("Pobeda", 15, 15);
		pas[2]=new Plane("Skyup", 200, 4500);
		pas[3]=new Helicopter("Black Hawk", 10, 3000, 4000);
		pas[4]=new Bus("Kyiv-Dnipro", 45);
		pas[5]=new Motorcycle(1, 300);
		pas[6]=new Car("Opel", 4);
		
		((Liner)pas[0]).isSalling();
		((Boat)pas[1]).isSalling();
		((Plane)pas[2]).fly();
		((Plane)pas[2]).land();
		((Helicopter)pas[3]).fly();
		((Helicopter)pas[3]).land();
		((Bus)pas[4]).drive();
		((Motorcycle)pas[5]).drive();
		((Car)pas[6]).drive();
		
		
		
		
	}

}
