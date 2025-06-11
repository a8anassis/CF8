package gr.aueb.cf.bankapp.core.exceptions;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}
