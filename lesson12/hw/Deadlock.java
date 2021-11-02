package lesson12.hw;

public class Deadlock {
	public static String str1 = "1";
	public static String str2 = "2";
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (str1) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (str2) {
						
					}
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (str2) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (str1) {
						
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
