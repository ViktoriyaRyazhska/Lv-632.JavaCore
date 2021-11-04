package lesson12.CW12.task1;

public class MyThread extends Thread {
    private int pause;

    public MyThread(int pause) {
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("I study Java");
        }

    }
}