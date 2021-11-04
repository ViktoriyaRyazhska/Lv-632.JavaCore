package Lesson6.ClassTasks;

public class MainTwo {
    public static void main(String[] args) {
        Line lines[] = new Line[3];

        lines[0] = new Line(new Point(2, 3), new Point(3,7));
        lines[1] = new ColorLine(new Point(2,8), new Point(5,9), "Green");

        System.out.println(lines[0].toString());
        System.out.println(lines[1].print());
    }
}
