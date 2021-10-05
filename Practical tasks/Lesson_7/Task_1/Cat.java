package Task_1;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("A'm a cat. I say Mau");
    }

    @Override
    public void feed() {
        System.out.println("Cat eats wiskas");
    }
}
