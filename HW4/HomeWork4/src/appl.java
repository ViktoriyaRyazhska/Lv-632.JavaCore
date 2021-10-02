
public class appl {	
	//Create 3 instances of type Dog. 

	public static void main(String[] args) {
		Dog dog = new Dog ("Djek", Breed.Bulldog, 12);
		Dog dog1 = new Dog ("Gretta", Breed.Jack_Russel, 2);
		Dog dog2 = new Dog ("Dara", Breed.Mastiff, 1);
	
	//Check if there is no two dogs with the same name. 
		
		System.out.println(dog.equals(dog1));
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog));
		
		
	//Display the name and the kind of the oldest dog

		if (dog.getAge()>dog1.getAge()& dog.getAge()>dog2.getAge())
			System.out.println("The name of the oldest dog - "+ dog.getName() + " the kind of this dog is "+Breed.Bulldog);
		if (dog1.getAge()>dog.getAge()& dog1.getAge()>dog2.getAge())
			System.out.println("The name of the oldest dog - "+ dog.getName() + " the kind of this dog is "+Breed.Jack_Russel);
		if (dog2.getAge()>dog.getAge()& dog2.getAge()>dog1.getAge())
			System.out.println("The name of the oldest dog - "+ dog.getName() + " the kind of this dog is "+Breed.Mastiff);
	
	}

}
