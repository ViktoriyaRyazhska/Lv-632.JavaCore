public class Employee { 						//Class Employee should consist of

		private String name;
		private int department;
		private int salary; 						//	three private fields: name, department and salary; 
													//		properties for access to these fields;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDepartment() {
			return department;
		}
		public void setDepartment(int department) {
			this.department = department;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
		public Employee (){							//		default constructor
		}
		
		public Employee (String name, int department, int salary){
			this.name = name;						//constructor with 3 parameters 
			this.department = department;
			this.salary = salary;
		}
		
		@Override						//toString() - to output information about employee
		public String toString() {
		return "Employee = " + name + ",  department = " + department + ",  salary = "+ salary;
		} 	
	}