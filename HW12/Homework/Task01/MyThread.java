package lesson012d;

public class MyThread extends Thread {
	  private int id;
	  private String message;

	  public MyThread(int id, String message) {
			this.id = id;
			this.message = message;
	  }

	  @Override
	  public void run() {
			for (int i = 0; i < 5; i++) {

				  try {
						Thread.sleep(500);
				  } catch (InterruptedException e) {
						e.printStackTrace();
				  }
				  System.out.println((i + 1) + ". " + message + " from Thread " + id);
			}
	  }
}