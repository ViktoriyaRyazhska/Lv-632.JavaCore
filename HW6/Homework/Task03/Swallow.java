package lesson006f;

public class Swallow extends FlyingBird {

	private String groupOfBirds;

	public String getGroupOfBirds() {
		return groupOfBirds;
	}

	public void setGroupOfBirds(String groupOfBirds) {
		this.groupOfBirds = groupOfBirds;
	}

	public Swallow(String feathers, String layEggs, int sizeWings, String groupOfBirds) {
		super(feathers, layEggs, sizeWings);
		this.groupOfBirds = groupOfBirds;
	}

	@Override
	public String toString() {
		return getGroupOfBirds() + ", " + super.toString();
	}

	@Override
	public void fly() {
		System.out.println("Swallow: group - " + this);
	}

}