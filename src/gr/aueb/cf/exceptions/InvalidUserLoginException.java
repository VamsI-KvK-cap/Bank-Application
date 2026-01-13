package gr.aueb.cf.exceptions;

/**
 * Custom exception to be thrown when a user login attempt is invalid.
 */
public class InvalidUserLoginException extends Exception {
    private static final long serialVersionUID = 1234L;

    /**
     * Constructs a new InvalidUserLoginException with the specified detail message.
     * 
     * @param message the detail message.
     */
    public InvalidUserLoginException(String message) {
        super(message);
    }

    /**
     * Constructs a new InvalidUserLoginException with the specified detail message and cause.
     * 
     * @param message the detail message.
     * @param cause the cause of the exception.
     */
    public InvalidUserLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
