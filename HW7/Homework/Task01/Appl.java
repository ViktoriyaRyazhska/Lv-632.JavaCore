package lesson007g;

import java.util.Comparator;
import java.util.TreeSet;

public class Appl {

	  public class SalaryComparator implements Comparator<Employee> {
			public int compare(Employee a, Employee b) {
				  if (a.calculatePay() > b.calculatePay()) {
						return 1;
				  } else if (a.calculatePay() < b.calculatePay()) {
						return 1;
				  } else {
						return 0;
				  }
			}
	  }

	  public class NameComparator implements Comparator<Employee> {
			public int compare(Employee a, Employee b) {
				  return a.getName().compareTo(b.getName());
			}
	  }

	  public static void main(String[] args) {

			Comparator<Employee> empcomp = new Appl().new SalaryComparator().thenComparing(new Appl().new NameComparator());
			TreeSet<Employee> empls = new TreeSet<Employee>(empcomp);
			empls.add(new ContractEmployee("Training Specialist", 4560.50));
			empls.add(new ContractEmployee("Escrow Assistant", 4290.10));
			empls.add(new ContractEmployee("Assist Dir", 4290.10));
			empls.add(new SalariedEmployee("Drywall Finisher", 32, 147.50));
			empls.add(new SalariedEmployee("City Laborer", 20, 120.20));
			empls.add(new SalariedEmployee("Food Packer", 20, 120.20));

			for (Employee e : empls) {
				  System.out.println(e.toString());
			}
	  }

}
