package Task3;

public class SomeThread implements Runnable {           //I try decided this task with only one "run" method

    private int messageNumber;                          //how many times print message
    private String message;                             //text of message
    private Thread thread;                              //it necessary if Interface Runnable is implemented (not extends of Thread class)

    public SomeThread (int messageNumber, String message){          //constructor without inner thread
        this.messageNumber=messageNumber;
        this.message=message;
        thread = new Thread();
        thread.start();
    }

    public SomeThread (int messageNumber, String message, SomeThread anotherThread){    //constructor with inner thread
        this.messageNumber=messageNumber;
        this.message=message;
        thread = new Thread();
        thread.start();
        Thread second = new Thread(anotherThread);
        second.start();
    }

    @Override
    public void run() {
        for (int i=0; i<messageNumber; i++)
        System.out.println(message);
    }
}
