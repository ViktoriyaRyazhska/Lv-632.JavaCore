package HW6;

public class Main {

	public static void main(String[] args) {
		
		Bird [] bird = new Bird[5];
		
		bird [0] = new Penguin ("yes","yes","not", 3.2);
		bird [1] = new Eagle ("yes","yes","yes", 25.5);
		bird [2] = new Swallow ("yes","yes","yes", 2.1);
		bird [3] = new Eagle ("yes","yes","yes", 15.5);
		bird [4] = new Chicken ("yes","yes","not", 4.3);
		
		
		for (int i = 0; i < bird.length; i++) {
			bird[i].fly();
			bird[i].println();
		}		
	}
}