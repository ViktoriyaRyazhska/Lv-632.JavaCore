package lesson12.HW12;

public class task3 {

	public static void main(String[] args) {
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
					try {
						sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
					try {
						sleep(1300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				t3.start();
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				t2.start();
			}
		};
		t1.start();
	}

}
