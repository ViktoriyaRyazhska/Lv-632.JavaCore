
public class Application {

	public static void main(String[] args) {

		ErrorHttp something = ErrorHttp.BAD_REQUEST;
		ErrorHttp newError = ErrorHttp.METHOD_NOT_ALLOWED;
		ErrorHttp badError = ErrorHttp.UNAUTHORIZED;
		ErrorHttp unknown = ErrorHttp.FORBIDDEN;
		
		readNumber(something);
		readNumber(newError);
		readNumber(badError);
		readNumber(unknown);
	}

	static void readNumber(ErrorHttp x) {
		switch (x) {
		case BAD_REQUEST: {
			System.out.println("Error number = " + x.numberOfError);
		}
			break;
		case UNAUTHORIZED: {
			System.out.println("Error number = " + x.numberOfError);
		}
			break;
		case PAYMENT_REQUIRED: {
			System.out.println("Error number = " + x.numberOfError);
		}
			break;
		case FORBIDDEN: {
			System.out.println("Error number = " + x.numberOfError);
		}
			break;
		case NOT_FOUND: {
			System.out.println("Error number = " + x.numberOfError);
		}
			break;
		case METHOD_NOT_ALLOWED: {
			System.out.println("Error number = " + x.numberOfError);
		}
			break;

		}
	}
}