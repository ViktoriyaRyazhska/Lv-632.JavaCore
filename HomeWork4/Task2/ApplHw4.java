package com.softserve.javaCore.homework4.Task2;

public class ApplHw4 {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Phibi", Breed.SHEPHERD, 5);
		Dog dog2 = new Dog("Helga", Breed.JACK_RUSSEL, 3);
		Dog dog3 = new Dog("Jack", Breed.SPANIEL, 4);
  
		
		Dog.theSameName(dog1, dog2, dog3);
		Dog.theOldestDog(dog1, dog2, dog3);
	}

	
	}


