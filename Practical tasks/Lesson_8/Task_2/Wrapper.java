package Task_2;

public class Wrapper <T extends Shape>{

    public Wrapper(T figure) {
    }

    Wrapper<Circle> circleWrapper = new Wrapper<>(new Circle());
    Wrapper<Square> squareWrapper = new Wrapper<>(new Square());
    Wrapper<String> stringWrapper = new Wrapper<>("Hello");

}
