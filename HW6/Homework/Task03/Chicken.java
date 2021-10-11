package lesson006f;

public class Chicken extends NonFlyingBird {

	private String groupOfBirds;

	public String getGroupOfBirds() {
		return groupOfBirds;
	}

	public void setGroupOfBirds(String groupOfBirds) {
		this.groupOfBirds = groupOfBirds;
	}

	public Chicken(String feathers, String layEggs, int bodyMass, String groupOfBirds) {
		super(feathers, layEggs, bodyMass);
		this.groupOfBirds = groupOfBirds;
	}

	@Override
	public String toString() {
		return getGroupOfBirds() + ", " + super.toString();
	}

	@Override
	public void fly() {
		System.out.println("Chicken: group - " + this);
	}

}
