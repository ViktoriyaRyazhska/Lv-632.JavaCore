package Lesson6.HomeWork;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("I can't fly");
    }
}
