package lesson12.hw;

public class HW1 {
	
	public static void main(String[] args) {

		MyThread thread1 = new MyThread("Thread1");
		MyThread thread2 = new MyThread("Thread2");
		MyThread thread3 = new MyThread("Thread3");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread3.start();	
		
	}

}
