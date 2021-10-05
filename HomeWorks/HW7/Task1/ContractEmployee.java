package Task1;

import java.util.Random;

public class ContractEmployee extends Employee implements Payment{

    private int federalTaxIdMember;
    private static int countId = 1;

    public ContractEmployee(String name){
        this.name=name;
        this.federalTaxIdMember = employeeId++;
        this.salary=calculatePay();
        ;
    }

    @Override
    public int calculatePay() {
        int rnd = new Random().nextInt(1000)+3000;
        return rnd;
    }

    @Override
    public String toString() {
        return "employee ID: "+ federalTaxIdMember + " |Name " + name + " |salary: " + salary;
    }
}
