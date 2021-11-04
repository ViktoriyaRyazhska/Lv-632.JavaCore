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
                "feathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Fly bird " + getName() + " "
                + getFeathers() + " "
                + getLayEggs() + " "
                + getColor());
    }
}
