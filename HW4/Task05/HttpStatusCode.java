package lesson004f;

public enum HttpStatusCode {
	BADREQUEST(400), UNAUTHORIZED(401), FORBIDDEN(403), NOTFOUND(404), METHODNOTALLOWED(405), REQUESTTIMEOUT(408),
	CONFLICT(409), PRECONDITIONFAILED(412), REQUESTENTITYTOOLARGE(413);

	int statusCode;

	HttpStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getHttpStatusCode() {
		return statusCode;
	}
}
