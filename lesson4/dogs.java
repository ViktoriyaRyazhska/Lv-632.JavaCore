package lesson3;

public class dogs {

	private String name;
	int age;
	public breed breed;
	public dogs(String name, int age, breed breed) {
		this.name=name;
		this.age=age;
		this.breed=breed;
		
	}
	
	public void changeBreed(breed breed) {
		this.breed = breed;
	}
	public void changeName(String name) {
		this.name = name;
	}	
	
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
	public breed getBreed() {
		return breed;
	}
	public void setBreed(breed breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "dogs [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dogs other = (dogs) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
		



}
