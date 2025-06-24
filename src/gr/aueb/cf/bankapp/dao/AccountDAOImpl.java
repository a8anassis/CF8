package gr.aueb.cf.bankapp.dao;

import gr.aueb.cf.bankapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public void saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);

        if (index != -1) {
            accounts.set(index, account);
            return;
        }
        accounts.add(account);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(a -> a.getIban().equals(iban));
    }

    @Override
    public Optional<Account> getByIban(String iban) {
        return accounts.stream()
                .filter(a -> a.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public boolean isIBANExists(String iban) {
        return accounts.stream()
                .anyMatch(a -> a.getIban()
                        .equals(iban));
    }
}
