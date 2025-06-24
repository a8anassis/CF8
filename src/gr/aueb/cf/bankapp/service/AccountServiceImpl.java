package gr.aueb.cf.bankapp.service;

import gr.aueb.cf.bankapp.dao.IAccountDAO;
import gr.aueb.cf.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.bankapp.core.mapper.Mapper;
import gr.aueb.cf.bankapp.model.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO accountDAO;

    public AccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public boolean createNewAccount(AccountInsertDTO dto) {
        Account account = Mapper.mapToModelEntity(dto);
        accountDAO.saveOrUpdate(account);
        return true;
    }

    @Override
    public void deposit(String iban, BigDecimal amount)
            throws NegativeAmountException, AccountNotFoundException {
        try {
            Account account = accountDAO.getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban " + iban + " not found."));

            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("Invalid amount: " + amount + ". Amount must be positive (input was negative)");
            }


            account.setBalance(account.getBalance().add(amount));
            accountDAO.saveOrUpdate(account);
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The amount=%f is negative. \n%s", LocalDateTime.now(), amount, e);
            throw e;
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban=%s not found. \n%s", LocalDateTime.now(), iban, e);
            throw e;
        }
    }

    @Override
    public void withdraw(String iban, BigDecimal amount)
            throws NegativeAmountException, InsufficientBalanceException, AccountNotFoundException {

        try {
            Account account = accountDAO.getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban " + iban + " not found."));

            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("Invalid amount: " + amount + ". Amount must be positive (input was negative)");
            }

            if (amount.compareTo(account.getBalance()) > 0) {
                throw new InsufficientBalanceException("Invalid amount " + amount +
                        ". Amount must be less or equal to balance (input was greater ");
            }
            account.setBalance(account.getBalance().subtract(amount));
            accountDAO.saveOrUpdate(account);
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban=%s not found. \n%s", LocalDateTime.now(), iban, e);
            throw e;
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The amount=%f is negative. \n%s", LocalDateTime.now(), amount, e);
            throw e;
        } catch (InsufficientBalanceException e) {
            System.err.printf("%s. The amount=%f is greater than balance. \n%s", LocalDateTime.now(), amount, e);
            throw e;
        }
    }

    @Override
    public BigDecimal getBalance(String iban)
            throws AccountNotFoundException {
        try {
            Account account = accountDAO.getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban " + iban + " not found."));
            return account.getBalance();
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban=%s not found. \n%s", LocalDateTime.now(), iban, e);
            throw e;
        }
    }

    @Override
    public List<AccountReadOnlyDTO> getAccounts() {
        return accountDAO.getAccounts()
                .stream()
                .map(Mapper::mapToReadOnlyDTO)
                .collect(Collectors.toList());

//        List<AccountReadOnlyDTO> readOnlyDTOS = new ArrayList<>();
//        List<Account> accounts = accountDAO.getAccounts();
//
//        for (Account account : accounts) {
//            AccountReadOnlyDTO readOnlyDTO = Mapper.mapToReadOnlyDTO(account);
//            readOnlyDTOS.add(readOnlyDTO);
//        }
//        return readOnlyDTOS;
    }

    public boolean isIBANExists(String iban) {
        return accountDAO.getByIban(iban).isPresent();
    }
}
