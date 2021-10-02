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
//		Set<Dog> dublicated = new HashSet<Dog>();
//		for (Dog dog : dogs) {
//			if (!sets.add(dog)) {
//				dublicated.add(dog);
//			}
//		}
//		System.out.println(dublicated);

		Dog sameName1 = Dog.searchSameName(dog01, dog02, dog03);
		if (sameName1 != null) {
			sets.add(sameName1);
		}
		;
		Dog sameName2 = Dog.searchSameName(dog01, dog02, dog04);
		if (sameName2 != null) {
			sets.add(sameName2);
		}
		;
		Dog sameName3 = Dog.searchSameName(dog01, dog02, dog05);
		if (sameName3 != null) {
			sets.add(sameName3);
		}
		;
		Dog sameName4 = Dog.searchSameName(dog01, dog02, dog06);
		if (sameName4 != null) {
			sets.add(sameName4);
		}
		;
		Dog sameName5 = Dog.searchSameName(dog01, dog02, dog07);
		if (sameName5 != null) {
			sets.add(sameName5);
		}
		;
		Dog sameName6 = Dog.searchSameName(dog01, dog02, dog08);
		if (sameName6 != null) {
			sets.add(sameName6);
		}
		;
		Dog sameName7 = Dog.searchSameName(dog01, dog03, dog04);
		if (sameName7 != null) {
			sets.add(sameName7);
		}
		;
		Dog sameName8 = Dog.searchSameName(dog01, dog03, dog05);
		if (sameName8 != null) {
			sets.add(sameName8);
		}
		;
		Dog sameName9 = Dog.searchSameName(dog01, dog03, dog06);
		if (sameName9 != null) {
			sets.add(sameName9);
		}
		;
		Dog sameName10 = Dog.searchSameName(dog01, dog03, dog07);
		if (sameName10 != null) {
			sets.add(sameName10);
		}
		;
		Dog sameName11 = Dog.searchSameName(dog01, dog03, dog08);
		if (sameName11 != null) {
			sets.add(sameName11);
		}
		;
		Dog sameName12 = Dog.searchSameName(dog01, dog04, dog05);
		if (sameName12 != null) {
			sets.add(sameName12);
		}
		;
		Dog sameName13 = Dog.searchSameName(dog01, dog04, dog06);
		if (sameName13 != null) {
			sets.add(sameName13);
		}
		;
		Dog sameName14 = Dog.searchSameName(dog01, dog04, dog07);
		if (sameName14 != null) {
			sets.add(sameName14);
		}
		;
		Dog sameName15 = Dog.searchSameName(dog01, dog04, dog08);
		if (sameName15 != null) {
			sets.add(sameName15);
		}
		;
		Dog sameName16 = Dog.searchSameName(dog01, dog05, dog06);
		if (sameName16 != null) {
			sets.add(sameName16);
		}
		;
		Dog sameName17 = Dog.searchSameName(dog01, dog05, dog07);
		if (sameName17 != null) {
			sets.add(sameName17);
		}
		;
		Dog sameName18 = Dog.searchSameName(dog01, dog05, dog08);
		if (sameName18 != null) {
			sets.add(sameName18);
		}
		;
		Dog sameName19 = Dog.searchSameName(dog01, dog06, dog07);
		if (sameName19 != null) {
			sets.add(sameName19);
		}
		;
		Dog sameName20 = Dog.searchSameName(dog01, dog06, dog08);
		if (sameName20 != null) {
			sets.add(sameName20);
		}
		;
		Dog sameName21 = Dog.searchSameName(dog02, dog03, dog04);
		if (sameName21 != null) {
			sets.add(sameName21);
		}
		;
		Dog sameName22 = Dog.searchSameName(dog02, dog03, dog05);
		if (sameName22 != null) {
			sets.add(sameName22);
		}
		;
		Dog sameName23 = Dog.searchSameName(dog02, dog03, dog06);
		if (sameName23 != null) {
			sets.add(sameName23);
		}
		;
		Dog sameName24 = Dog.searchSameName(dog02, dog03, dog07);
		if (sameName24 != null) {
			sets.add(sameName24);
		}
		;
		Dog sameName25 = Dog.searchSameName(dog02, dog03, dog08);
		if (sameName25 != null) {
			sets.add(sameName25);
		}
		;
		Dog sameName26 = Dog.searchSameName(dog02, dog04, dog05);
		if (sameName26 != null) {
			sets.add(sameName26);
		}
		;
		Dog sameName27 = Dog.searchSameName(dog02, dog04, dog06);
		if (sameName27 != null) {
			sets.add(sameName27);
		}
		;
		Dog sameName28 = Dog.searchSameName(dog02, dog04, dog07);
		if (sameName28 != null) {
			sets.add(sameName28);
		}
		;
		Dog sameName29 = Dog.searchSameName(dog02, dog04, dog08);
		if (sameName29 != null) {
			sets.add(sameName29);
		}
		;
		Dog sameName30 = Dog.searchSameName(dog02, dog05, dog06);
		if (sameName30 != null) {
			sets.add(sameName30);
		}
		;
		Dog sameName31 = Dog.searchSameName(dog02, dog05, dog07);
		if (sameName31 != null) {
			sets.add(sameName31);
		}
		;
		Dog sameName32 = Dog.searchSameName(dog02, dog05, dog08);
		if (sameName32 != null) {
			sets.add(sameName32);
		}
		;
		Dog sameName33 = Dog.searchSameName(dog02, dog06, dog07);
		if (sameName33 != null) {
			sets.add(sameName33);
		}
		;
		Dog sameName34 = Dog.searchSameName(dog02, dog06, dog08);
		if (sameName34 != null) {
			sets.add(sameName34);
		}
		;
		Dog sameName35 = Dog.searchSameName(dog02, dog07, dog08);
		if (sameName35 != null) {
			sets.add(sameName35);
		}
		;
		Dog sameName36 = Dog.searchSameName(dog03, dog04, dog05);
		if (sameName36 != null) {
			sets.add(sameName36);
		}
		;
		Dog sameName37 = Dog.searchSameName(dog03, dog04, dog06);
		if (sameName37 != null) {
			sets.add(sameName37);
		}
		;
		Dog sameName38 = Dog.searchSameName(dog03, dog04, dog07);
		if (sameName38 != null) {
			sets.add(sameName38);
		}
		;
		Dog sameName39 = Dog.searchSameName(dog03, dog04, dog08);
		if (sameName39 != null) {
			sets.add(sameName39);
		}
		;
		Dog sameName40 = Dog.searchSameName(dog03, dog05, dog06);
		if (sameName40 != null) {
			sets.add(sameName40);
		}
		;
		Dog sameName41 = Dog.searchSameName(dog03, dog05, dog07);
		if (sameName41 != null) {
			sets.add(sameName41);
		}
		;
		Dog sameName42 = Dog.searchSameName(dog03, dog05, dog08);
		if (sameName42 != null) {
			sets.add(sameName42);
		}
		;
		Dog sameName43 = Dog.searchSameName(dog03, dog06, dog07);
		if (sameName43 != null) {
			sets.add(sameName43);
		}
		;
		Dog sameName44 = Dog.searchSameName(dog03, dog06, dog08);
		if (sameName44 != null) {
			sets.add(sameName44);
		}
		;
		Dog sameName45 = Dog.searchSameName(dog03, dog07, dog08);
		if (sameName45 != null) {
			sets.add(sameName45);
		}
		;
		Dog sameName46 = Dog.searchSameName(dog04, dog05, dog06);
		if (sameName46 != null) {
			sets.add(sameName46);
		}
		;
		Dog sameName47 = Dog.searchSameName(dog04, dog05, dog07);
		if (sameName47 != null) {
			sets.add(sameName47);
		}
		;
		Dog sameName48 = Dog.searchSameName(dog04, dog05, dog08);
		if (sameName48 != null) {
			sets.add(sameName48);
		}
		;
		Dog sameName49 = Dog.searchSameName(dog04, dog06, dog07);
		if (sameName49 != null) {
			sets.add(sameName49);
		}
		;
		Dog sameName50 = Dog.searchSameName(dog04, dog06, dog08);
		if (sameName50 != null) {
			sets.add(sameName50);
		}
		;
		Dog sameName51 = Dog.searchSameName(dog04, dog07, dog08);
		if (sameName51 != null) {
			sets.add(sameName51);
		}
		;
		Dog sameName52 = Dog.searchSameName(dog05, dog06, dog07);
		if (sameName52 != null) {
			sets.add(sameName52);
		}
		;
		Dog sameName53 = Dog.searchSameName(dog05, dog06, dog08);
		if (sameName53 != null) {
			sets.add(sameName53);
		}
		;
		Dog sameName54 = Dog.searchSameName(dog05, dog07, dog08);
		if (sameName54 != null) {
			sets.add(sameName54);
		}
		;
		Dog sameName55 = Dog.searchSameName(dog06, dog07, dog08);
		if (sameName55 != null) {
			sets.add(sameName5);
		}
		;
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
