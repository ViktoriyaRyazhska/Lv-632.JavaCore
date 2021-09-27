package lesson1.classhometask;

public class FlowerBedCalculation {
    final static double PI = Math.PI;
    double result = 0.0f;

    public static double getPI() {
        return PI;
    }

    public double getAreaOfCircle(double r) {
        result = getPI() * r * r;
        return result;
    }

    public double getPerimeterOfCircle(double r) {
        result = 2 * getPI() * r;
        return result;
    }
}