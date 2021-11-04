package Lesson6.HomeWork;

public abstract class Bird {

    private String feathers;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    private String layEggs;

    abstract void fly();
}
