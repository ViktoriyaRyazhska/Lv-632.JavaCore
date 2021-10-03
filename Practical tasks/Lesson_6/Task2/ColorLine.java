public class ColorLine extends Line{
    private String color;

    ColorLine(){}

    ColorLine(Point a, Point b, String color){
        super(a,b);
        this.color=color;
    }

    public void printColorLine(ColorLine colorLine) {
        System.out.println(colorLine);
    }

    @Override
    public String toString(){
        return super.toString() + " Color: " + color;
    }

}
