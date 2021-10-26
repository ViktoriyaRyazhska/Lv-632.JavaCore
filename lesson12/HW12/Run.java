package lesson12.HW12;

public class Run implements Runnable{
	String message;
	int time;
	
	public Run(String message, int time) {
		this.message = message;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(message);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
