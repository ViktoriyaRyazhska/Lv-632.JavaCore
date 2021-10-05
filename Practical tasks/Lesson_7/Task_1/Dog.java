package Task_1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Am a Dog. I say Woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog eats bones");
    }
}
