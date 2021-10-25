package lesson12.CW12.task2;

public class Run implements Runnable {
    private String message;
    private int millis;

    public Run(String message, int millis) {
        this.message = message;
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + 1 + message);
        }
    }
}