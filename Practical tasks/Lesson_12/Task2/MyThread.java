package Task2;

public class MyThread extends Thread {

    private String message;
    private int intervals;

    public MyThread(String message, int intervals) {
        this.message = message;
        this.intervals = intervals;
    }

    @Override
    public void run () {
        try {
            for(int i=0; i<5; i++) {
                Thread.sleep(intervals * 1000);
                System.out.println(message);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
