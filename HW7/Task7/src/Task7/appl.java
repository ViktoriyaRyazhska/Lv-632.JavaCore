package Task7;

public class appl {

	public static void main(String[] args) {
		Animals [] animal = new Animals [3];
		
		animal [0]= new Cat ("Maja");
		animal [1]= new Dog ("Djek");
		animal [2]= new Cat ("Nyca");
		
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].feed();
			animal[i].voice();
		}
	}
}