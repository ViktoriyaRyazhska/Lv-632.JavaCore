package HW8;

public abstract class Person {
	private int age;
	private FullName fullname;
	
	public Person(FullName fullName, int age) {
		this.fullname=fullName;
		this.age=age;
	}
	
	public String info() {
		return String.format("First name: %s , Last name: %s, Age: %i", getFullname().getFirstName(), getFullname().getLastName(), getAge());
	}
	 public abstract String activity();
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", fullname=" + fullname + "]";
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FullName getFullname() {
		return fullname;
	}
	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}
	

}
