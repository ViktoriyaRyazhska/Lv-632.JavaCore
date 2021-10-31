
public class CreateDeadlock {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) {

		Thread thread1 = new Thread() {

			public void run() {
				synchronized (first) {

					Thread.yield();
					synchronized (second) {
						System.out.println("Thread1 finished");
					}
				}

			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				synchronized (second) {

					Thread.yield();
					synchronized (first) {
						System.out.println("Thread2 finished");
					}
				}

			}
		};

		thread1.start();
		thread2.start();

	}
}
