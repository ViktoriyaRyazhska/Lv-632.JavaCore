package lesson7.HW7;

import lesson7.HW7.model.ContractEmployee;
import lesson7.HW7.model.Employee;
import lesson7.HW7.model.Payment;
import lesson7.HW7.model.SalariedEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HW7App {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new SalariedEmployee(101, "Den", "Sh", 38.5, 40.0, "EC4566"));
        employeeList.add(new SalariedEmployee(103, "Alex", "Ad", 110.5, 30.0, "EC4577"));
        employeeList.add(new ContractEmployee(102, "Jony", "Reg", 12589, 1100));
        employeeList.add(new ContractEmployee(104, "Jons", "Groov", 12541, 1050.45));

        employeeList.sort(Comparator.comparing(Payment::calculatePay));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
