package lesson012f;

public class ThreadX implements Runnable {
	  private int count;
	  private String msg;
	  private Thread thread;

	  public ThreadX(int count, String msg) {
			this.count = count;
			this.msg = msg;
			this.thread = new Thread();
			System.out.println("START thread = " + thread);
			thread.start();
	  }

	  public ThreadX(int count, String msg, ThreadX threadX) {
			this.count = count;
			this.msg = msg;
			this.thread = new Thread();
			thread.start();
			Thread next = new Thread(threadX);
			next.start();
	  }

	  @Override
	  public void run() {
			for (int i = 0; i < count; i++) {
				  try {
						Thread.sleep(500);
				  } catch (InterruptedException e) {
						e.printStackTrace();
				  }
				  System.out.println((i + 1) + ". " + msg);
			}
	  }

}