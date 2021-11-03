package lesson6.HW6.model;

public class FlyingBird extends Bird{
   private String name;

    public FlyingBird(String feathers, String layEggs, String name) {
        super(feathers, layEggs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFeathers() {
        return super.getFeathers();
    }

    @Override
    public void setFeathers(String feathers) {
        super.setFeathers(feathers);
    }

    @Override
    public String getLayEggs() {
        return super.getLayEggs();
    }

    @Override
    public void setLayEggs(String layEggs) {
        super.setLayEggs(layEggs);
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "name='" + getName() + '\'' +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Fly bird " + getName() + " " + getFeathers() + " " + getLayEggs());
    }
}