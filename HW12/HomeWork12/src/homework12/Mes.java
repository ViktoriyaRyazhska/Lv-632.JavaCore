package homework12;

public class Mes extends Thread {
	String messages;
	int number;
	
	public Mes (String messages, int number) {
		this.messages= messages;
		this.number=number;
	}
	@Override
	public void run() {
		for (int i=0; i<5;i++) {
			try {
				Thread.sleep(number);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(messages); 
		}

	}
}