package Task3;

public class Main {

    public static void main(String[] args) {
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage(5, "Thread 3");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage(3, "Thread 2");
                thread3.start();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread2.start();
            }
        });

        thread1.start();
    }

    private static void printMessage(int number, String message) {
        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }
    }
}





/*
Create a thread «one», which would start the thread «two», which has to output its number
(«Thread number two») 3 times and create thread «three», which would to output
message «Thread number three» 5 times.
 */
