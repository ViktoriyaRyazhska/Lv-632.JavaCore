package lesson12;

public class run1 implements Runnable {

	String m1;
	int n1;
	public run1(String m1, int n1) {
		this.m1=m1;
		this.n1=n1;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(m1);
			try {
				Thread.sleep(n1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
