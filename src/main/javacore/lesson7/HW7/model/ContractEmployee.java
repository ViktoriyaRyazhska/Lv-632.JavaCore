package lesson7.HW7.model;

public class ContractEmployee extends Employee implements Payment{
    private int federalTaxIdmember;
    private  double fixedMonthlyPayment;

    public ContractEmployee(int id, String name, String employeeld,
                            int federalTaxIdmember, double fixedMonthlyPayment) {
        super(id, name, employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "ContractEmployee {" +
                "Id: " + getId() +
                ", Name: " + getName() +
                ", Salary: " + calculatePay() +
                '}';
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
