package Task2;

public class Main {
    public static void main(String[] args) {


        Liner liner = new Liner();
        liner.setPassengers(3000);
        liner.setFloors(21);
        liner.isSailing();

        Boat boat = new Boat();
        boat.setPassengers(30);
        boat.setVolume(35);
        boat.isSailing();

        Plane plane = new Plane();
        plane.setPassengers(180);
        plane.setMaxDistance(3000);
        plane.fly();
        plane.land();

        Helicopter helicopter = new Helicopter();
        helicopter.setPassengers(2);
        helicopter.setWeight(5000);
        helicopter.setMaxHeight(3000);
        helicopter.fly();
        helicopter.land();

        Bus bus = new Bus();
        bus.setRoute("Lviv-Bukovel");
        bus.setPassengers(30);
        bus.drive();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setMaxSpeed(300);
        motorcycle.setPassengers(1);
        motorcycle.drive();

        Car car = new Car();
        car.setModel("Citroen C8");
        car.setPassengers(7);
        car.drive();
    }
}
