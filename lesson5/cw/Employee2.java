package lesson5.cw;

public class Employee2 {
	private String name;
	private int departmentNumber;
	private int salary;
	
    public static void main(String[] args) {
    	Employee2[] emp = new Employee2[5];
    	emp[0] = new Employee2("John", 1, 1000);
    	emp[1] = new Employee2("Alex", 3, 1200);
    	emp[2] = new Employee2("Max", 2, 1100);
    	emp[3] = new Employee2("Alex", 1, 1300);
    	emp[4] = new Employee2("Alex", 3, 1500);
    	
    	
	}

    
    
	public Employee2(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

    
}
