package Task1;

public class Main {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("Thread 1");
        MyThread th2 = new MyThread("Thread 2");
        MyThread th3 = new MyThread("Thread 3");

        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e){
            System.out.println(e);
        }
        th3.start();
    }
}


/*
Run three threads and output there different messages for 5 times.
The third thread supposed to start after finishing working of the two previous threads.
 */
