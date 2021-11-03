package lesson12.HW12.task1;

public class AppHW12Task1 {
    public static void main(String[] args) {
        Message mes1 = new Message(1000, "Hello Alex !");
        Message mes2 = new Message(2000, "Hello Max !");
        Thread thread1 = new Thread(mes1);
        Thread thread2 = new Thread(mes2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I stady java core");
    }
}