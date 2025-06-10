package gr.aueb.cf.bankapp.exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
