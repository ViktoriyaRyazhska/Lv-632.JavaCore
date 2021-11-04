package lesson5.HW5.model;

import java.time.LocalDate;

public class Car {
    private String model;
    private int year;
    private Double engineCapacity;

    public Car(String model, int year, Double engineCapacity) {
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
