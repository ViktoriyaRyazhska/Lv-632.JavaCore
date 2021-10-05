package Task1;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[4];

        employee[0] = new SalariedEmployee("Vasil", 160);
        employee[1] = new SalariedEmployee("Vasia", 148);
        employee[2] = new ContractEmployee("Vitaliy");
        employee[3] = new ContractEmployee("Mikola");

        for (Employee person: employee){
            System.out.println(person);
        }

        System.out.println("");

        Employee.sortBySalary(employee);

        for (Employee person: employee){
            System.out.println(person);
        }
    }
}
