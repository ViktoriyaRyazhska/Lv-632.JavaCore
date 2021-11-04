package lesson12.CW12.task1;

public class AppCW12Task1 {
    public static void main(String[] args) {
        Thread thread = new MyThread( 1000);
        thread.start();
    }
}