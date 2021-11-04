package lesson12.HW12.task3;

public class Message implements Runnable {
    private int pause;
    private int count;
    private String message;

    public Message(int pause, int count, String message) {
        this.pause = pause;
        this.count = count;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + 1 + ". " + message);
        }
    }
}