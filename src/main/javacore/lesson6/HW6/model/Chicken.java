package lesson6.HW6.model;

public class Chicken extends NonFlyingBird{
    private String nameChiken;

    public Chicken(String feathers, String layEggs, String nameCountry, String nameChiken) {
        super(feathers, layEggs, nameCountry);
        this.nameChiken = nameChiken;
    }

    public String getNameChiken() {
        return nameChiken;
    }

    public void setNameChiken(String nameChiken) {
        this.nameChiken = nameChiken;
    }

    @Override
    public void fly() {
        System.out.println("Not fly bird " + super.getFeathers() + " "
                + super.getLayEggs() + " "
                + super.getNameCountry() + " "
                + getNameChiken());
    }
}
