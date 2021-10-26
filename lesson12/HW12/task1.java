package lesson12.HW12;

import lesson12.run1;

public class task1 {

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = new Run("1st message, delay 1 sec", 1000);
		Thread t1 = new Thread(r1);
		Runnable r2 = new Run("2nd message, delay 2 sec", 2000);
		Thread t2 = new Thread(r2);
		Runnable r3 = new Run("3th message, delay 2,5 sec", 2500);
		Thread t3 = new Thread(r3);

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		
	}

}
