package Task2;

/*
Cause a deadlock.
Organize the expectations of ending a thread in main(),
and make the end of the method main() in this thread.

Організуйте очікування закінчення потоку в main(),
і зробити кінець методу main() у цьому потоці.
 */
public class Main implements Runnable{

    static int counter = 0;
    @Override
    public void run() {
        try {
            wait();
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread one = new Thread();
        one.start();
    }

}





