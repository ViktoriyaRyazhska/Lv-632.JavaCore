public class MainL6T2 {

    public static void main(String[] args) {

        Line [] lines = new Line[2];


        lines[0] = new Line(new Point(14,15), new Point(46,15));

        lines[1] = new ColorLine(new Point(27,43), new Point(41,57), "Green");

        for (int i=0; i<lines.length; i++){
            System.out.println(lines[i]);
        }
    }


}
