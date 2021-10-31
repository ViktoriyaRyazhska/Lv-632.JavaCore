
public class ThreeTreads {
	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread() {

			public void run() {
				System.out.println("Thread 1 " + getName() + " has been started!");
				for (int i = 4; i > 0; i--) {
					System.out.println("Thread 1 will end in: " + i);

				}
				System.out.println("Thread 2" + getName() + " has stoped");
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("Thread 2 " + getName() + " runs!");
				for (int i = 4; i > 0; i--) {
					System.out.println("Thread 2 will end in: " + i);
				}
				System.out.println("Thread 2" + getName() + " is dead!=)");
			}

		};
		Thread thread3 = new Thread() {
			public void run() {
				System.out.println("Thread 3 " + getName() + " starts!");
				for (int i = 4; i > 0; i--) {
					System.out.println("Thread 3 will end in: " + i);
				}
				System.out.println("Thread 3" + getName() + " has finished!");
			}
		};

		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		thread3.start();
		
	}
}