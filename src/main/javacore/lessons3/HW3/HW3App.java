package lessons3.HW3;

import lessons3.HW3.model.Person;
import lessons3.HW3.utils.OperationPerson;

import java.util.ArrayList;
import java.util.List;

public class HW3App {
    public static void main(String[] args) {
        OperationPerson operationPerson = new OperationPerson();
        System.out.println("Hello! ");
        List<Person> personList = new ArrayList<Person>();

        Person person1 = new Person("Anton","Sh");
        person1.changeName("Denys","Sh");
        operationPerson.output(person1);

        personList.add(person1);
        personList.add(new Person("Max","Sh"));
        personList.add(new Person("Makar","Sh"));
        personList.add(new Person("Anton","Sh"));
        personList.add(new Person("Alex","Sh"));

        for (Person person : personList) {
            person.setbYear(Integer.parseInt(operationPerson.input()));
            System.out.println("Your age: " + operationPerson.getAge(person));
            operationPerson.output(person);
        }
    }
}
