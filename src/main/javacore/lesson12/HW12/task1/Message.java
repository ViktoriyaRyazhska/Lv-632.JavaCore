package lesson12.HW12.task1;

public class Message implements Runnable {
    private int pause;
    private String message;

    public Message(int pause, String message) {
        this.pause = pause;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + 1 + ". " + message);
        }
    }
}
