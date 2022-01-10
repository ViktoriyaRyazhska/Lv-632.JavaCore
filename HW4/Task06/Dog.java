package lesson004h;

import java.util.Objects;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog() {
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]" + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}

	public static Dog searchSameName(Dog n, Dog o, Dog p, Dog q) {
		if (n.getName().equals(o.getName()) && n.getName().equals(p.getName()) && n.getName().equals(q.getName())) {
			return n;
		}
		if (n.getName().equals(o.getName()) && n.getName().equals(p.getName())) {
			return n;
		}
		if (n.getName().equals(o.getName())) {
			return n;
		}
		if (n.getName().equals(p.getName())) {
			return n;
		}
		if (n.getName().equals(q.getName())) {
			return n;
		}
		if (o.getName().equals(p.getName()) && o.getName().equals(q.getName())) {
			return o;
		}
		if (o.getName().equals(p.getName())) {
			return o;
		}
		if (o.getName().equals(q.getName())) {
			return o;
		}
		if (p.getName().equals(q.getName())) {
			return q;
		}
		return null;
	}

	public static Dog searchOldestDog(Dog a, Dog d) {
		return a.getAge() > d.getAge() ? a : d;
	}
}
