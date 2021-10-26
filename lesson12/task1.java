package lesson12;

public class task1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+". - I study Java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
