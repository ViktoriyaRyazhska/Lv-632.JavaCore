public class Dog {
	private String name;
	private Breed dogBreed;
	private int age;
	
									//default constructor and constructor with 3 parameters (name, breed, age)
	Dog() {
	}
	
	Dog (String name, Breed type, int age){
		this.name = name;
		this.dogBreed = type; 
		this.age = age;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(Breed dogBreed) {
		this.dogBreed = dogBreed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
// Check if there is no two dogs with the same name (equals &hashCode)

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
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	

}