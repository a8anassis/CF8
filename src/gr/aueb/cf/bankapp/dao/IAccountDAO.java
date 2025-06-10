package gr.aueb.cf.bankapp.dao;

import gr.aueb.cf.bankapp.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    void saveOrUpdate(Account account);
    void remove(String iban);
    Optional<Account> getByIban(String iban);
    List<Account> getAccounts();
}
