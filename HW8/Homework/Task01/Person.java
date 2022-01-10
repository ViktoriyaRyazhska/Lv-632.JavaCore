package lesson008d.copy;

public abstract class Person {
	  private FullName fullName;
	  private int age;

	  public abstract void activity();

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

	  public Person(int age) {
			this.age = age;
	  }

	  public Person(FullName fullName) {
			this.fullName = fullName;
	  }

	  public class FullName {
			private String firstName;
			private String lastName;

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

			public FullName(String firstName, String lastName) {
				  this.firstName = firstName;
				  this.lastName = lastName;
			}

			public String info() {
				  return String.format("First name: %s, Last name: %s, Age: %d years old.", getFirstName(),
							  getLastName(), getAge());
			}
	  }

}