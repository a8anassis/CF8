package gr.aueb.cf.ch15.custom_exceptions;

import java.time.LocalDateTime;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Public API

    /**
     * Deposits a certain amount of money.
     *
     * @param amount
     *              the amount of money to be deposited.
     * @throws NegativeAmountException
     *              if the amount is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if ( amount < 0) {
                throw new NegativeAmountException("Το ποσό " + amount + " είναι αρνητικό");
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println(LocalDateTime.now() + "Amount= " + amount + " is negative.\n" + e);
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from the {@link Account}.
     * First, checks if ssn is valid by calling {@link Account#isSsnValid(String)}.
     *
     * @param amount        the amount to withdraw.
     * @param ssn           the given ssn.
     * @throws NegativeAmountException
     *                      if amount is negative.
     * @throws InsufficientBalanceException
     *                      if balance is not sufficient.
     * @throws SsnNotValidException
     *                      if ssn is not valid.
     */
    public void withdraw(double amount, String ssn)
            throws NegativeAmountException, InsufficientBalanceException, SsnNotValidException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("Το ποσό " + amount + " είναι αρνητικό");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Το υπόλοιπο " + balance + " δεν επαρκεί");
            }

            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException("Το ssn " + ssn + " δεν είναι έγκυρο");
            }
            balance -= amount;
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.err.println(LocalDateTime.now() +  "\n" + e);
            // e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link Account}.
     *
     * @return  the {@link Account} balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the {@link Account} state in String format.
     *
     * @return  the string-representation of the {@link Account}.
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }



}
