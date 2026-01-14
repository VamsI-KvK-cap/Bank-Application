package gr.aueb.cf.exceptions;

/**
 * Custom exception for invalid user login attempts.
 */
public class InvalidUserLoginException extends Exception {
    private static final long serialVersionUID = 1234L;

    public InvalidUserLoginException(String message) {
        super(message);
    }

    public InvalidUserLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
