package by.pranovich.task1.exception;

public class CustomArrayException extends Exception {
    public CustomArrayException() {
    }

    public CustomArrayException(String message) {
        super(message);
    }

    public CustomArrayException(Throwable reason) {
        super(reason);
    }

    public CustomArrayException(String message, Throwable reason) {
        super(message, reason);
    }
}
