package lesson6.HW6.model;

public class NonFlyingBird extends Bird {
    private String nameCountry;

    public NonFlyingBird(String feathers, String layEggs, String nameCountry) {
        super(feathers, layEggs);
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public void fly() {
        System.out.println("Not fly bird " + getFeathers() + " " + getLayEggs() + " " + getNameCountry());
    }
}
