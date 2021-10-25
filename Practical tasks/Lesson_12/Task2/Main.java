package Task2;

public class Main {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("Hello, world", 2);             //Create new threads
        MyThread th2 = new MyThread("Peace in the peace", 3);
        th1.start();
        th2.start();

        try {                                           //join threads to main thread
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("My name is Taras");
    }
}
