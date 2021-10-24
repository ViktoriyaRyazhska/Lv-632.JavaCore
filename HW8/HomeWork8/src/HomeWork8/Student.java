package HomeWork8;

public class Student extends Person {		
		private int course;
//Develop a Student class with an int field that matches the course the student is taking		
		public int getCourse() { 
			return course;
		}

		public void setCourse(int course) {
			this.course = course;
		}

		public Student(FullName fullName, int age) {
			super(fullName, age);
		}

		public Student(FullName fullName, int age, int course) {
			super(fullName, age);
			this.course = course;
		}

//		In the Student class, create a constructor with parameters to initialize all fields in the class
	
		@Override
		public String toString() {
			return "Student [course=" + course + "]";
		}
//override the activity() method from the Person class
//student - this could be the value "I study at university". 
		@Override
		public String activity() {
			return "I study at university";
		}
// and override the info() method 	
		@Override
		public void info () {
			System.out.println (" FirstName = " + super.getFullName().getFirstName() + ", LastName = " +super.getFullName().getLastName() + " Age = " + this.getAge() +" Course = " +course ); 
		};
}