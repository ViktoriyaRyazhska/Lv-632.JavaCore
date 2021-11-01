package Task1;

public class MyThread extends Thread {
    private String message;

    public MyThread(String message){
        this.message=message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
