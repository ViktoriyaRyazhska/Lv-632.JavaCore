package Task2;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog (){}

    public Dog (String name,String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Dog otherDog = (Dog) obj;
        return name.equals(otherDog.name);
    }

    @Override
    public String toString() {
        return "Dog name-" + name + '\'' +
                ", breed-" + breed + '\'' +
                ", age:-" + age;
    }

    public void isOldestThan(Dog dog1, Dog dog2, Dog dog3){
        Dog oldestDog=new Dog();
        if (dog1.age>dog2.age) oldestDog=dog1;
        else oldestDog=dog2;
        if (oldestDog.age<dog3.age) System.out.println("Oldest dog: "+dog3);
        else System.out.println("Oldest dog: "+oldestDog);
    }
}

