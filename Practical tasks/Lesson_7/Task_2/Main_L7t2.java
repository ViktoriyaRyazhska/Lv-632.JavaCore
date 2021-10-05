package Task_2;

public class Main_L7t2 {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons [0] = new Student("Mikola");
        persons [1] = new Teacher("Vasil");
        persons [2] = new Cleaner("Vova");

        for (Person person: persons){
            person.print();
            if (person instanceof Staff)
                System.out.println("Salary: "+ ((Staff)person).salary());
        }
    }
}
