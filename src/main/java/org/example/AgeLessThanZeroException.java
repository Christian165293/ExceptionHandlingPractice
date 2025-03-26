package org.example;

// Custom exception for cases where age is less than zero
public class AgeLessThanZeroException extends Exception {
    // Default constructor with no arguments
    public AgeLessThanZeroException() {
    }

    // Constructor with a custom error message
    // @param message - the detail message that explains the error condition
    public AgeLessThanZeroException(String message) {
        super(message);
    }

    // Constructor with a cause (another throwable that triggered this exception)
    // @param cause - the Throwable that caused this exception to be thrown
    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }

    // Constructor with both a custom message and a cause
    // @param message - the detail message
    // @param cause - the Throwable that caused this exception
    public AgeLessThanZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
