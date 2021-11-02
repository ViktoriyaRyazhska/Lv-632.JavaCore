package lesson12.hw;

public class HW2 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread("one") {
			@Override
			public void run () {
				Thread thread2 = new Thread("two") {
					@Override
					public void run() {
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread number " + Thread.currentThread().getName());
						}
					}
				};
				thread2.start();
			}
		};
		thread1.start();

		Thread thread3 = new Thread("tree") {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number " + Thread.currentThread().getName());
				}
			}
		};
		thread3.start();
	}

}
