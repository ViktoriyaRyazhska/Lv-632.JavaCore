
public class Main {
	public static void main(String[] args) {
		
		WrapperClass<Integer> isInt = new WrapperClass<>(23);
		WrapperClass<String> isString = new WrapperClass<>("Its String");
		WrapperClass<Boolean> isBool = new WrapperClass<>(true);
		System.out.println(isInt.getValue());
		System.out.println(isString.getValue());
		System.out.println(isBool.getValue());
		
	}
}
