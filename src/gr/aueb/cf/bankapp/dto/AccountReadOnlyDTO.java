package gr.aueb.cf.bankapp.dto;

import java.math.BigDecimal;

public class AccountReadOnlyDTO {
    private String iban;
    private BigDecimal balance;

    public AccountReadOnlyDTO() {

    }

    public AccountReadOnlyDTO(String iban, BigDecimal balance) {
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
        return "AccountReadOnlyDTO{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
