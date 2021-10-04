package lesson7.HW7.model;

public class SalariedEmployee extends Employee implements Payment{
    private double hourlyRate;
    private double numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(int id, String name, String employeeld, double hourlyRate,
                            double numberOfHoursWorked, String socialSecurityNumber) {
        super(id, name, employeeld);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee {" +
                "Id: " + getId() +
                ", Name: " + getName() +
                ", Salary: " + calculatePay() +
                '}';
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
