package homework12;
//Cause a deadlock. Organize the expectations of ending a thread in main(), 
//and make the end of the method main() in this thread.

public class Deadlock {
public final static Object first = new Object();
public final static Object second = new Object();

public static void main(String s[]) {
   Thread t1 = new Thread() {
   public void run() {
      synchronized (first) {
         Thread.yield();
         synchronized (second) {
            System.out.println("First ending");
   }  }  }  };

	   Thread t2 = new Thread() {
		   public void run() {
		      synchronized (second) {
		         Thread.yield();
		         synchronized (first) {
		            System.out.println("Second ending");
   }  }  }  };
		
		t1.start();
		t2.start();
	}
}