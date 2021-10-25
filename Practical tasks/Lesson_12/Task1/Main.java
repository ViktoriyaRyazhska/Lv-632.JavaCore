package Task1;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<10; i++){
            Thread.sleep(1000);
            System.out.println("I study Java");
        }
    }
}
