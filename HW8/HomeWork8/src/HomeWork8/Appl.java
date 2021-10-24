package HomeWork8;

public class Appl {

	public static void main(String[] args) {
//		Create three objects of the Wrapper type: first object should be wrapper for int type, second – for String, third - for boolean.
//		Print all three values in the console using method getValue from Wrapper class

		Wrapper<Integer> first = new Wrapper<>(23);
		Wrapper<String> second = new Wrapper<>("for String");
		Wrapper<Boolean> third = new Wrapper<>(true);
		System.out.println(first.getValue());
		System.out.println(second.getValue());
		System.out.println(third.getValue());
		
	}
}