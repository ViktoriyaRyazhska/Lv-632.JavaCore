package lesson003b;

public class Runner {
	public static void main (String[] args) {
		Helper.setMessage("hello");
		Helper.print();
		// Not recommended:
		//! Helper helper = new Helper(); 
		Helper helper = Helper.getHelper();
		helper.setMessage("new message"); 
		helper.print();
	}
}
