package Lesson7.HomeWork;

public class SalariedEmployee extends Employee implements Payment{

    private double hourlyRate;
    private double numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(int id, String name, double hourlyRate, double numberOfHoursWorked, String socialSecurityNumber) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee - " + super.getName() + " EmployeeID = " + super.getId()
                + " [SocialSecurityNumber = " + getSocialSecurityNumber() + ", hourlyRate = " + getHourlyRate()
                + ", numberOfHours = " + getNumberOfHoursWorked() + "]" + " salary = " + calculatePay();
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
