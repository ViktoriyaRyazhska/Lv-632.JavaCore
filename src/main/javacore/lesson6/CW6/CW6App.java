package lesson6.CW6;

import lesson6.CW6.model.*;

import java.util.ArrayList;
import java.util.List;

public class CW6App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Track("Mers",110,2016,33));
        cars.add(new Track("Reno",100,2018,25));
        cars.add(new Sedan("Reno",180,2018,5));
        cars.add(new Sedan("BMW",210,2013,5));

        for (Car car:cars) {
            car.run();
            car.stop();
            System.out.println(car);
        }

        List<Line> lineList = new ArrayList<>();
        lineList.add(new Line(new Point(5,3),new Point(2,3)));
        lineList.add(new ColorLine(new Point(5,8),new Point(7,9),"Green"));
        for (Line line:lineList) {
            line.print();
        }
    }
}