package lesson012a;

public class Appl {

	  public static void main(String[] args) {

			Thread thread = new MyThread(1000);
			thread.start();
			System.out.println("Output text «I study Java» 10 times with the intervals of one second: ");  
	  }
	  
}
