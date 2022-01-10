package lesson012g;

public class ResolveDeadLockTest {
	  public final static Object first = new Object();
	  public final static Object second = new Object();

	  public static void main(String[] args) {

			Thread t0 = new Thread() {
				  @Override
				  public void run() {
						System.out.println("-> is running " + Thread.currentThread().getName());
						synchronized (first) {
							  Thread.yield();
							  synchronized (second) {
									System.out.println(Thread.currentThread().getName() + " has finished executing");
							  }
						}

				  }
			};

			Thread t1 = new Thread() {
				  @Override
				  public void run() {
						System.out.println("-> is running " + Thread.currentThread().getName());
						synchronized (second) {
							  Thread.yield();
							  synchronized (first) {
									System.out.println(Thread.currentThread().getName() + " has finished executing");
							  }
						}

				  }
			};

			t0.start();
			t1.start();
	  }
}