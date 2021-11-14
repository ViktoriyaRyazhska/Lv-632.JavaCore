package homework12;

public class Firsthomework12 {

		public static void main(String[] args) {
//		Run three threads and output there different messages for 5 times. 
//		The third thread supposed to start after finishing working of the two previous threads.

		
			 
			Runnable r1 = new Mes("First message", 1000);
			Thread t1 = new Thread(r1);
			Runnable r2 = new Mes("Second message", 1000);
			Thread t2 = new Thread (r2);
			Runnable r3 = new Mes("Third  message", 1000);
			Thread t3 = new Thread (r3);
			
					t1.run();
					t2.run();
					
					try {
						  t1.join();
						  t2.join();
					} catch (InterruptedException e) {
						  e.printStackTrace();
					}
					t3.run();
			}
		}