
public abstract class Bird {
	private String feathers;
	private String layEggs;

	public void fly() {
		System.out.println("Unknown bird flyes");
	}
	
	public Bird() {}

	public Bird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}

}
