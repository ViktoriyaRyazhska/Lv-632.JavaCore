package Lesson7.HomeWork;

public class Main {

    public static void main(String[] args) {
        Employee employees[] = new Employee[4];

        employees[0] = new ContractEmployee(101, "Sasha", 17, 5000.75);
        employees[1] = new ContractEmployee(105, "Taras", 18, 5500.25);
        employees[2] = new SalariedEmployee(91, "Oksana", 100, 40, "B5");
        employees[3] = new SalariedEmployee(99, "Vira", 170, 30, "A9");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() > employees[j].calculatePay()) {
                    Employee temp;
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("Sort employees");
        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

    }


}
