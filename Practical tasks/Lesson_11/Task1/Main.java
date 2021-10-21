package Task1;

public class Main {
    public static void main(String[] args) {

        try{
            Main.squareRectangle(6,0);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static int squareRectangle(int a, int b) throws NegativeNumberException{
        if(a<=0 || b <=0) throw new NegativeNumberException("number equal of less 0");
        else {
            return a*b;
        }
    }
}
