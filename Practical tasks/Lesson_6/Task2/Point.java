public class Point {
    private int x;
    private int y;

    Point(){}

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    static void printPoint (Point point){
        System.out.println(point);
    }

    @Override
    public String toString() {
        return "x-" +x+ " y-" +y;
    }
}
