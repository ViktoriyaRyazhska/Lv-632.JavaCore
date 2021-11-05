package Lesson7.HomeWork;

public class ContractEmployee extends Employee implements Payment{

    private int federalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(int id, String name, int federalTaxIdmember, double fixedMonthlyPayment) {
        super(id, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee - " + super.getName() + " EmployeeID = " + super.getId()
                + " [federal tax Id member = " + getFederalTaxIdmember() + "]" + " salary = " + calculatePay();

    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
