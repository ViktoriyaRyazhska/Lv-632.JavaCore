package HW6;
//Support we have a class Employee
public class Employee {
	private String name;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 public Employee ( ) {}
	 
	 public Employee (String name, int age, double salary) {
	 this.name=name;
	 this.age=age;
	 this.salary=salary;
	 }
	 
	 public void report () {
			System.out.printf("Name: %s, Age: %s years, Salary:%s ", this.name, this.age, this.salary);
		 }

	 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}