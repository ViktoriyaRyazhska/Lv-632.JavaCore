package lesson12.HW12;

public class task2 {

	public static void main(String[] args) {
		Object first = new Object();
		Object second = new Object();
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						System.out.println("New thread done!");
					}
				}
			}
		};
		t1.start();
		test(first, second);
	}

	public static void test(Object a1, Object a2) {
		synchronized (a2) {
			Thread.yield();
			synchronized (a1) {
				System.out.println("Main done!");
			}
		}
	}
}
