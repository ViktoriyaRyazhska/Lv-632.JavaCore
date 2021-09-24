import java.util.Objects;

public class Dog {
	private String nameOfDog;
	private int ageOfDog;
	private Breed dogsBreed;

	public void checkAge(int b) {
		if(this.ageOfDog>b) {System.out.println(this.nameOfDog+" is older");}
		else if(this.ageOfDog==b) {System.out.println("They have same age");}
		else {System.out.println(this.nameOfDog + " is younger");}
	}
	
	public void checkName(String x) {
		if (this.nameOfDog.equals(x)) {
			System.out.println("They have same names");
		} else {
			System.out.println("They have defferent names");
		}
	}

	public Dog() {

	}

	public Dog(String nameOfDog) {

		this.nameOfDog = nameOfDog;
	}

	public Dog(String nameOfDog, int ageOfDog) {
		super();
		this.nameOfDog = nameOfDog;
		this.ageOfDog = ageOfDog;
	}

	public Dog(String nameOfDog, int ageOfDog, Breed dogsBreed) {
		super();
		this.nameOfDog = nameOfDog;
		this.ageOfDog = ageOfDog;
		this.dogsBreed = dogsBreed;
	}

	public String getNameOfDog() {
		return nameOfDog;
	}

	public void setNameOfDog(String nameOfDog) {
		this.nameOfDog = nameOfDog;
	}

	public int getAgeOfDog() {
		return ageOfDog;
	}

	public void setAgeOfDog(int ageOfDog) {
		this.ageOfDog = ageOfDog;
	}

	public Breed getDogsBreed() {
		return dogsBreed;
	}

	public void setDogsBreed(Breed dogsBreed) {
		this.dogsBreed = dogsBreed;
	}

	@Override
	public String toString() {
		return "Dog [nameOfDog=" + nameOfDog + ", ageOfDog=" + ageOfDog + ", dogsBreed=" + dogsBreed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageOfDog, dogsBreed, nameOfDog);
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
		return ageOfDog == other.ageOfDog && dogsBreed == other.dogsBreed && Objects.equals(nameOfDog, other.nameOfDog);
	}

}
