package gr.aueb.cf.bankapp.exceptions;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException(String message) {
        super(message);
    }
}
