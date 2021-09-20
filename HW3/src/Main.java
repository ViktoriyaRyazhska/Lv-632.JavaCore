public class Main {
    public static void main(String[] args) {

        Person taras = new Person("Taras", "Chornyi");
        taras.setBirthYear(1988);

        Person teodor = new Person();
        teodor.input("Teodor", "Chornyi", 2021);

        Person oleg=new Person();
        oleg.input("Oleg","Kysiak", 1987);

        Person olenka=new Person("Olenka", "Kysiak");
        olenka.setBirthYear(2021);

        Person person =new Person("Person", "Person");
        person.setBirthYear(0);
        person.changeName("Vladuk","Pele");

        taras.output();
        System.out.println(" "+ taras.getAge());
        teodor.output();
        System.out.println(" "+ teodor.getAge());
        oleg.output();
        System.out.println(" "+ oleg.getAge());
        olenka.output();
        System.out.println(" "+ olenka.getAge());
    }
}
