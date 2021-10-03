public class MainL6T1 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Sedan("Volkswagen Jetta", 2008);
        cars[1] = new Sedan("Citroen C8", 2008);
        cars[2] = new Truck("Peterbilt", 1994);
        cars[3] = new Truck("Kenworth", 1998);

        for(Car car:cars){
        Car.print(car);
        }
    }
}
