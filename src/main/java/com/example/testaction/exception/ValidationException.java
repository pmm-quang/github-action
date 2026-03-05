package com.example.testaction.exception;

/**
 * Exception ném ra khi dữ liệu không hợp lệ.
 */
public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

}
