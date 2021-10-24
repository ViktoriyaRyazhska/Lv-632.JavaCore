package lesson6.hw;

public class Main {
	
	public static void main(String[] args) {
		//1.
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("gray-brown", "1-2 eggs");
		birds[1] = new Swallow("blue-green", "2-3 eggs");
		birds[2] = new Penguin("no", "1 egg");
		birds[3] = new Chicken("golden brown", "1 egg a day");
		
		for (Bird bird : birds) {
			System.out.print(bird + " ");
			bird.fly();
		}

		//2.
		Employee emp = new Employee("John", 25, 1250);
		System.out.println(emp.report());
		Developer dev = new Developer("Mark", 30, 4500, "Senior Java Developer");
		System.out.print(dev.report());
	}
}
