package lesson012b;

public class Run implements Runnable {
	  private String message;
	  private int seconds;

	  public Run(String message, int seconds) {
			this.message = message;
			this.seconds = seconds;
	  }

	  @Override
	  public void run() {
			for (int i = 0; i < 5; i++) {
				  try {
						Thread.sleep(seconds);
				  } catch (InterruptedException e) {
						e.printStackTrace();
				  }
				  System.out.println(i + ". " + message);
			}
	  }

}