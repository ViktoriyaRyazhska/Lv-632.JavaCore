package HomeWork8;

public abstract class Person  {
		private FullName fullName = new FullName();
		private int age;
//Create an abstract Person class with fullName field of type FullName and age of type int. 

//	In the Person class, create a constructor public Person(FullName fullName, int age)
		public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
		}

		public FullName getFullName() {
			return fullName;
		}

		public void setFullName(FullName fullName) {
			this.fullName = fullName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
// method called info(), which will return a string in the format 
//"First name: <firstName>, Last name: <lastName>, Age: <age>" 
		
		public void info () {
		System.out.println ("FirstName=" + this.fullName.getFirstName() + ", LastName=" +this.fullName.getLastName() + "Age" + age ); 
		};
//and an abstract public activity() method with a String return type
		abstract public String activity();
}