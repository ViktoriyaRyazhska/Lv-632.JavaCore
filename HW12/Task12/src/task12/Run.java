package task12;

public class Run implements Runnable {
	
	String messages;
	int number;
	
	public Run (String messages, int number) {
		this.messages= messages;
		this.number=number;
	}
	public void run() {
		for (int i=0; i<5;i++) {
			try {
				Thread.sleep(number);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(messages); 
		}
		System.out.println("My name is Svetlana");
	}
}