package lesson12.HW12.task3;

public class AppHW12Task3 {
    public static void main(String[] args) {
        Message mes1 = new Message(1000, 3, "Thread");
        Message mes2 = new Message(1000, 5, "Messsageegeggeg");
        Thread thread1 = new Thread(mes1);
        Thread thread2 = new Thread(thread1);
        Thread thread3 = new Thread(mes2);

        System.out.println("Thread 3 !");
        thread3.run();
        thread3.start();
        thread2.setName("Thread 2 !");
        thread2.start();
        System.out.println(thread2.getName());
        try {
            thread1.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}