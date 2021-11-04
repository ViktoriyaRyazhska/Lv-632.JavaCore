package Lesson6.HomeWork;

public class Main {
    public static void main(String[] args) {
        Bird birds[] = new Bird[4];

        birds[0] = new Eagle("Black", "Yes");
        birds[0].fly();
        System.out.println(birds[0].toString());

        birds[1] = new Swallow("Black and white", "Yes");
        birds[1].fly();
        System.out.println(birds[1].toString());

        birds[2] = new Penguin("Blue", "Yes");
        birds[2].fly();
        System.out.println(birds[2].toString());

        birds[3] = new Chicken("Black and white and brown", "Yes");
        birds[3].fly();
        System.out.println(birds[3].toString());
    }
}
