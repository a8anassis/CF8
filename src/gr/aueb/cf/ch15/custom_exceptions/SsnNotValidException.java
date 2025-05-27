package gr.aueb.cf.ch15.custom_exceptions;

public class SsnNotValidException extends Exception {

    public SsnNotValidException(String message) {
        super(message);
    }
}
