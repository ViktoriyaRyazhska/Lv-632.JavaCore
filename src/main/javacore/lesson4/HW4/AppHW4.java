package lesson4.HW4;

import lesson4.HW4.model.Breed;
import lesson4.HW4.model.Dog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppHW4 {
    public static void main(String[] args) {
        Dog dog = new Dog("Sultan", Breed.STAFARD, 7);
        Dog dog1 = new Dog("Cezar", Breed.LABRADOR, 3);
        Dog dog2 = new Dog("Sultan", Breed.MOBS, 5);

        if (dog.getName().equals(dog1.getName()) || dog.getName().equals(dog2.getName())) {
            System.out.println("There is a name match: " + dog.getName());
        } else if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog.getName())) {
            System.out.println("There is a name match: " + dog1.getName());
        } else {
            System.out.println("No name matches!");
        }
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.sort(Comparator.comparing(Dog::getAge).reversed());
        System.out.println(dogs.get(0));
    }
}
