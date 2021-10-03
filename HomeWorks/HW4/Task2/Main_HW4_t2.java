package Task2;

public class Main_HW4_t2 {
    public static void main(String[] args) {

        Dog myhtar = new Dog("Myhtar", "German Shepherd", 8);
        Dog bambyla = new Dog("Bambyla", "Alabai", 10);
        Dog chinus = new Dog("Chinus", "Chihuahua", 3);

        myhtar.isOldestThan(bambyla,myhtar,chinus);

        System.out.println(myhtar.equals(bambyla.equals(chinus)));
    }
}
