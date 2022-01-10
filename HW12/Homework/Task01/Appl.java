package lesson012d;


public class Appl {

	  public static void main(String[] args) {

			MyThread thread1 = new MyThread(1, "Message 1");
			MyThread thread2 = new MyThread(2, "Message 2");
			MyThread thread3 = new MyThread(3, "Message 3");

			thread1.start();
			thread2.start();

			try {
				  thread1.join();
				  thread2.join();
			} catch (InterruptedException e) {
				  e.printStackTrace();
			}

			thread3.start();
			try {
				  thread3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	  }

}