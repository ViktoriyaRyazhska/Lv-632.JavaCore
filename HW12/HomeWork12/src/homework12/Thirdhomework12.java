package homework12;

public class Thirdhomework12 {

	public static void main(String[] args) {
		
		Thread two = new Thread();
		two.run();
		for (int i = 0; i < 3; i++) {
				System.out.println("Thread number 2");
			}
		
		Thread third = new Thread();
		third.run();
		for (int i = 0; i < 5; i++) {
					System.out.println("Thread number 3");
				}
		
		Thread one = new Thread();
		one.run();
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number 1");
		}
		
		third.start();
	
		two.start();
	
		one.start();

	}
}

