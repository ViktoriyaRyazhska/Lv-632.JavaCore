package lesson8.hw;

public abstract class Person {
	
	private FullName fullName;
	private int age;
	
	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FullName getFullName() {
		return fullName;
	}
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}


	public static class FullName {
		private String firstName;
		private String lastName;
		
		public FullName(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		@Override
		public String toString() {
			return String.format("First name: %s, Last name: %s", 
					firstName, lastName);
		}		
	}
	
	public String info() {
		return String.format("%s, Age: %d years old", fullName, age);
	}
	
	public abstract String activity();

}
