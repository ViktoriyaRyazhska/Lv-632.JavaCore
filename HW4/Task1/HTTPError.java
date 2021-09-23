package Task1;

import java.util.NoSuchElementException;

public enum HTTPError {
    BadRequest(400),
    Unauthorized(401),
    PaymentRequired(402),
    Forbidden(403),
    NotFound(404);

    private final int error;

    HTTPError(int error) {
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public static HTTPError indexError(int find) {
        for (HTTPError description : values() ) {
            if (description.error == find) {
                return description;
            }
        }
        throw new NoSuchElementException(
                "Can't find your error number: " + find);
    }
}
