package Lesson7.ClassTasks;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Bars");
        animals[1] = new Cat("Sharlota");
        animals[2] = new Dog("Pirat");
        animals[3] = new Cat("Masha");
        animals[4] = new Dog("Jack");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("My name is " + animals[i] + " " + animals[i].voice() + " and " + animals[i].feed());

        }

        System.out.println();

        Person[] people = new Person[3];

        people[0] = new Teacher("Sasha");
        people[1] = new Student();
        people[2] = new Cleaner();

        for (Person i : people) {
            i.print();
            if (i instanceof Staff) {
                System.out.println(((Staff) i).salary());
            }
        }
    }
}
