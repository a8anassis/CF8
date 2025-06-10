package gr.aueb.cf.bankapp.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String iban;
    private BigDecimal balance;

    public Account() {

    }

    public Account(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return Objects.equals(getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban());
    }
}
