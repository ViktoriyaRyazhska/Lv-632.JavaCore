

public class Employee { 						//Class Employee should consist of

		private String name;
		private int rate;
		private int hours; 						//	three private fields: name, rate and hours; 
		
		public static double totalSum = 0;		//		static field totalSum
		public static double bonuses = 0;	
		public static double salary =0;
	
		public static double totalSalary = 0;
		
		//		properties for access to these fields;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}										
		public int getRate() {
			return rate;
		}
		public void setRate(int rate) {
				this.rate = rate;
		}											
		public int getHours() {
			return hours;
		}
		public void setHours(int hours) {
				this.hours = hours;
		}										
		public Employee (){							//		default constructor
		}
		public Employee (String name) {
			this.name = name;
		}
		public Employee (String name, int rate){	//constructor with 2 parameters (name and rate)
			this.name = name;					
			this.rate = rate;
		}
				public Employee (String name, int rate, int hours){
			this.name = name;						//constructor with 3 parameters 
			this.rate = rate;
			this.hours = hours;
		}
		//	methods:
		public void getSalary() {			//getSalary() - to calculate the salary of person (rate * hours)
			salary = rate * hours ;
			}
		public void getBonuses() {			//getBonuses() – to calculate 10% from salary
			bonuses = salary * 0.1 ;
			}
		public void totalSum () {			//totalSum() - to calculate total sum & totalSaraly of person
			totalSum = salary + bonuses;
			totalSalary = totalSum+totalSalary; 
		}
		
		@Override						//toString() - to output information about employee
		public String toString() {
		return "= " + name + ", rate = " + rate + ", hours = " + hours + ", salary = " + salary + ", bonus = "+ bonuses + " totalSum = " + totalSum +" totalSalary "+totalSalary ;
		} 									
														
		public  void changeRate (int n) {			//changeRate(int rate) - to change the rate of some employee and recalculate his salary
			totalSalary = totalSalary-totalSum; 
			this.rate=n;
			salary = rate * hours ;
			bonuses = salary * 0.1 ;
			totalSum = salary + bonuses;
			totalSalary = totalSum+totalSalary; 
		}		
	}