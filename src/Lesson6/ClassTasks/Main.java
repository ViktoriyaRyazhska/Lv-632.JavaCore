package Lesson6.ClassTasks;

public class Main {
    public static void main(String[] args) {
        Car cars[] = new Car[4];

        cars[0] = new Truck("Daf", 120, 1999);
        cars[1] = new Sedan("Polo", 150, 2005);
        cars[2] = new Truck("Man", 100, 2007);
        cars[3] = new Sedan("Astra", 160, 2010);

        System.out.println(cars[0].toString());
        for (int i = 0; i < cars.length; i++) {


            cars[i].run();
            cars[i].stop();
        }


    }
}
