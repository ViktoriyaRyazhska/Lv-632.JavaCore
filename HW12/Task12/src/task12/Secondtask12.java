package task12;

public class Secondtask12 {

	public static void main(String[] args) {
//	Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds, 
//		and the second - 3 seconds. 
//		After printing messages, print the text «My name is …»
	
		 
		Runnable r1 = new Mes("Hello world!", 2000);
		Thread t1 = new Thread(r1);
		Runnable r2 = new Mes("Peace in the peace", 3000);
		Thread t2 = new Thread (r2);

				t1.run();
				t2.run();
				
				try {
					  t1.join();
					  t2.join();
				} catch (InterruptedException e) {
					  e.printStackTrace();
				}
		}
	}