package lesson7.CW7;

import lesson7.CW7.model.*;

import java.util.ArrayList;
import java.util.List;

public class CW7App {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("Sultan"));
        animalList.add(new Dog("Cezar"));
        animalList.add(new Cat("Oscar"));
        animalList.add(new Cat("Simka"));

        for (Animal animal:animalList) {
            System.out.println(animal.voice());
            System.out.println(animal.feed());
        }

        List<Person> personList = new ArrayList<>();
        personList.add(new Teacher("Alex"));
        personList.add(new Cleaner("Jon"));
        personList.add(new Student("Den"));

        for (Person person:personList) {
            person.print();
            if (person instanceof Staff ){
                System.out.println("Salary = " + ((Staff) person).salary());
            }
        }
    }
}
