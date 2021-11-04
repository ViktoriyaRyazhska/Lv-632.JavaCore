package Lesson6.HomeWork;

public class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report() {
        return super.report();
    }

    public static void main(String[] args) {
        Developer developer = new Developer("Taras", 32,32735.35 );
        System.out.println(developer.report());
    }
}
