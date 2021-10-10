package lesson4.hw;

public class Dog {
	String name;
	int age;
	Breed breed;
	
	public static void main(String[] args) {
		Dog[] array = new Dog[3];
		array[0] = new Dog("Rex", 5, Breed.HUSKY);
		array[1] = new Dog("Jack", 8, Breed.DOBERMAN);
		array[2] = new Dog("Loki", 6, Breed.SPANIEL);
		System.out.println(oldestDog(array));
		System.out.println(sameDog(array));
	}
	
	
	public static Dog oldestDog (Dog[] array) {
		Dog oldestDog = array[0];
		for (Dog dog : array) {
			if (dog.getAge() > oldestDog.getAge()) {
				oldestDog = dog;
			}
		}
		return oldestDog;
	}
	
	public static String sameDog (Dog[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getName().equals(array[j].getName())) {
					return "There are two dogs with the same name";
				}
			}
		}
		return "There are no two dogs with the same name";
	}

	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return breed + " " + name + ", " + age + " years old";
	}
	
}
