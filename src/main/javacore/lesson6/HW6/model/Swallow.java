package lesson6.HW6.model;

public class Swallow extends FlyingBird{
    private int year;

    public Swallow(String feathers, String layEggs, String name, int year) {
        super(feathers, layEggs, name);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "name='" + super.getName() + '\'' +
                ", feathers='" + super.getFeathers() + '\'' +
                ", layEggs='" + super.getLayEggs() + '\'' +
                ", year=" + getYear() +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Fly bird! = " + this);
    }
}
