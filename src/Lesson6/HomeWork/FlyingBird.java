package Lesson6.HomeWork;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("I can fly");
    }
}
