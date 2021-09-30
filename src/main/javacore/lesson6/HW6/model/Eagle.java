package lesson6.HW6.model;

public class Eagle extends FlyingBird {
    private String color;

    public Eagle(String feathers, String layEggs, String name, String color) {
        super(feathers, layEggs, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + super.getFeathers() + '\'' +
                ", layEggs='" + super.getLayEggs() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getColor());
    }
}
