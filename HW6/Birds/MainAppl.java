

public class MainAppl {
	public static void main(String[] args) {
		
		Bird[] array = new Bird[4];
		array[0] = new Eagle("Black/White","Somewhere",60,25);
		array[1] = new Swallow("Black/Grey","DontKnow",10,1);
		array[2] = new Penguin("White/Black","FarAway",15,20);
		array[3] = new Chicken("White/Red","Home",15,5);
	
	array[0].fly();
	array[1].fly();
	array[2].fly();
	array[3].fly();
	
	
	}
	
	
	
}
