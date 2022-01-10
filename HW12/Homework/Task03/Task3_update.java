package lesson012f;

public class Task3 {

	  public static void main(String[] args) {

			Thread two = new Thread(() -> {
				  for (int i = 0; i < 3; i++) {
						System.out.println("Thread number 2");
				  }
				  Thread three = new Thread(() -> {
						for (int i = 0; i < 5; i++) {
							  System.out.println("Thread number 3");
						}
				  });
				  three.start();
			});

			Thread one = new Thread(() -> {
				  two.start();
			});

			one.start();
	  }
}