
public class DogAppl {

	public static void main(String[] args) {

		Dog jackie = new Dog("Jack", 6, Breed.GERMAN_SHEPHED);
		Dog jack = new Dog("Jack", 3, Breed.CANE_CORSO);
		Dog zeus = new Dog("Zeus", 3, Breed.DOBERMAN);
		Dog tyson = new Dog("Tyson", 7, Breed.DOBERMAN);
		System.out.println(jackie.toString());
		System.out.println(jack.toString());
		System.out.println(zeus.toString());
		System.out.println(tyson.toString());

		jackie.checkName(jack.getNameOfDog());
		jack.checkAge(zeus.getAgeOfDog());
		tyson.checkAge(zeus.getAgeOfDog());
		tyson.checkName(zeus.getNameOfDog());

	}
}