
public enum ErrorHttp {
	BAD_REQUEST(400),UNAUTHORIZED(401),PAYMENT_REQUIRED(402),FORBIDDEN(403),
	NOT_FOUND(404),METHOD_NOT_ALLOWED(405);
	
	int numberOfError;
	
	ErrorHttp(int numberOfError){
	this.numberOfError = numberOfError;
		}
}
