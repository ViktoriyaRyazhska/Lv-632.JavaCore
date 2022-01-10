package lesson003c;

class Student {
	private static int count = 0;
	private static int sum = 0;

	private String name;
	private int rait;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRait() {
		return rait;
	}

	public void setRait(int rait) {
		sum -= this.rait;
		this.rait = rait;
		sum += rait;
	}

	public Student(String name, int rait) {
		this.name = name;
		this.rait = rait;
		sum += rait;
		count++;
	}

	public Student(String name) {
		this.name = name;
		count++;
	}

	public Student() {
		count++;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rait=" + rait + "]";
	}

	public boolean betterStudent(Student s) {
		return this.rait > s.rait;
	}

	public static double getavgRating() {
		return ((double)sum) / count;
	}
}
