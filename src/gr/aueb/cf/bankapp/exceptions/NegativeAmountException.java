package gr.aueb.cf.bankapp.exceptions;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}
