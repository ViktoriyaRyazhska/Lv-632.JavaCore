package lesson12.HW12.task2;

public class AppHW12Task2 {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String s[]) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success!");
                    }
                }
            }
        };

        t1.start();
        Thread.yield();
//        Thread t2 = new Thread() {
//            public void run() {
        synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success!");
//                    }
//                }
                    }
                };
//        t2.start();
    }
}