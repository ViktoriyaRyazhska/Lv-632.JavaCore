public abstract class Car {
    private String model;
    private int yearOfManufacture;

    Car (String model, int yearOfManufacture){
        this.model=model;
        this.yearOfManufacture=yearOfManufacture;
    }

    public static void print (Car car){
        System.out.println(car);
    }

    @Override
    public String toString() {
        return "Model: "+model+" | Year: "+yearOfManufacture;
    }
}
