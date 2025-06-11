package gr.aueb.cf.bankapp.core.exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
