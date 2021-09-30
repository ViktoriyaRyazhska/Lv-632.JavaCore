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
}
