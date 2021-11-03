package lesson6.HW6.model;

public class Penguin extends NonFlyingBird{
    public String namePenguin;

    public Penguin(String feathers, String layEggs, String nameCountry, String namePenguin) {
        super(feathers, layEggs, nameCountry);
        this.namePenguin = namePenguin;
    }

    public String getNamePenguin() {
        return namePenguin;
    }

    public void setNamePenguin(String namePenguin) {
        this.namePenguin = namePenguin;
    }

    @Override
    public void fly() {
        System.out.println("Not fly bird " + getFeathers() + " "
                + getLayEggs() + " "
                + getNameCountry() + " "
                + getNamePenguin());
    }
}