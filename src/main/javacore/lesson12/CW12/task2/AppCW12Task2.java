package lesson12.CW12.task2;

public class AppCW12Task2 {
    public static void main(String[] args) {
        Run run1 = new Run(". Hello world!", 1000);
        Run run2 = new Run(". World, world hello !", 1000);
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("require $15,000 per year.");
    }
}