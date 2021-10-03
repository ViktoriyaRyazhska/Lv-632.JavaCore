public class Line {
    private Point a;
    private Point b;

    Line(){}

    Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    static public void printLine (Line line){
        System.out.println(line);
    }

    @Override
    public String toString(){
        return "| Point a: "+ a + " | Point b: "+b;
    }
}
