package lesson004h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Appl {

	public static void main(String[] args) {
		Dog dog01 = new Dog("Alfred", Breed.BULLDOG, 10);
		Dog dog02 = new Dog("Duke", Breed.LABRADOR, 3);
		Dog dog03 = new Dog("Alfred", Breed.KOMONDOR, 12);
		Dog dog04 = new Dog("A.J.", Breed.CHOW_CHOW, 7);
		Dog dog05 = new Dog("Chica", Breed.HUSKY, 6);
		Dog dog06 = new Dog("Gatsby", Breed.SHEPHERD, 4);
		Dog dog07 = new Dog("Chica", Breed.HUSKY, 3);
		Dog dog08 = new Dog("Alfred", Breed.ROTTWEILER, 9);

		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(dog01);
		dogs.add(dog02);
		dogs.add(dog03);
		dogs.add(dog04);
		dogs.add(dog05);
		dogs.add(dog06);
		dogs.add(dog07);
		dogs.add(dog08);

	
		Set<Dog> sets = new HashSet<Dog>();
		for (Dog s : dogs) {

			Dog sameName1 = Dog.searchSameName(dog01, dog02, dog03, s);
			if (sameName1 != null) {
				sets.add(sameName1);
			};
			Dog sameName2 = Dog.searchSameName(dog05, dog06, dog07, s);
			if (sameName2 != null) {
				sets.add(sameName2);
			};
		}

		System.out.println("Duplicate dog names: ");
		for (Dog s : sets)
			System.out.println(s.getName());

		
		Dog oldestDog = null;
		for (Dog k : dogs) {
			if (oldestDog != null) {
				oldestDog = Dog.searchOldestDog(k, oldestDog);
			} else {
				oldestDog = k;
			}
		}

		System.out.println("\nOldest dog:=> " + oldestDog.getName());
		System.out.println("Breed: " + oldestDog.getBreed() + " Age: " + oldestDog.getAge());

	}
}
