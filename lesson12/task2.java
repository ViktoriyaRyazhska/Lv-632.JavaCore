package lesson12;

public class task2 {

	public static void main(String[] args) {

		Runnable r1 = new run1("Hello, world", 2000);
		Thread t1 = new Thread(r1);
		Runnable r2 = new run1("Peace in the peace", 3000);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("My name is Andriy");
	}

}
