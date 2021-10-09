package HW8.Task2;

public class Main {

	public static void main(String[] args) {
		Wrapper<Integer> a1 =new Wrapper<>();
		Wrapper<String> a2 =new Wrapper<>();
		Wrapper<Boolean> a3 =new Wrapper<>();
		
		a1.setValue(230);
		a2.setValue("Hello");
		a3.setValue(false);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
