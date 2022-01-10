package lesson003b;

public class Helper {
	private static Helper instance = null;

	private  Helper() {
	}

	private static String message;

	public static void setMessage(String mes) {
		Helper.message = mes;
	}

	public static void print() {
		System.out.println(message);
	}

	public static Helper getHelper() {
		if (instance == null) {
			instance = new Helper();
		}
		return instance;
	}
}
