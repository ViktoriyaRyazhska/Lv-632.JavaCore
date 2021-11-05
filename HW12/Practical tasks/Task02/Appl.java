package lesson012b;

public class Appl {
	  public static void main(String[] args) {
			Run run1 = new Run("Hello world!", 2000);
			Run run2 = new Run("Peace in the peace", 3000);
			Thread thread1 = new Thread(run1);
			Thread thread2 = new Thread(run2);

			thread1.start();
			thread2.start();
			
			try {
				  thread1.join();
				  thread2.join();
			} catch (InterruptedException e) {
				  e.printStackTrace();
			}
			System.out.println("My name is Vulook");
	  }

}
