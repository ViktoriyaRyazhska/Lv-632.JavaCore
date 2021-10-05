	
public class MainAppl {
	public static void main(String[] args) {
		
		Animal[] someAnimal = new Animal[2];
		someAnimal[0] = new Cat();
		someAnimal[1] = new Dog();
		
		for (int i = 0; i < someAnimal.length; i++) {
			someAnimal[i].feed();
			someAnimal[i].voice();
		}
	}
}
