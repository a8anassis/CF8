package gr.aueb.cf.bankapp.validation;

import gr.aueb.cf.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.bankapp.dao.IAccountDAO;
import gr.aueb.cf.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.bankapp.service.IAccountService;
import gr.aueb.cf.ch6.BinarySearch;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    private static final IAccountDAO accountDAO = new AccountDAOImpl();
    private static final IAccountService accountService = new AccountServiceImpl(accountDAO);


    /**
     * No instances of this class should be available.
     */
    private Validator() {

    }

    public static Map<String , String> validate(AccountInsertDTO dto) {
        Map<String, String> errors = new HashMap<>();

//        if (dto.getIban() == null || dto.getIban().trim().length() < 5) {
        if (dto.getIban() == null || dto.getIban().trim().matches("GR\\d{15}")) {
            errors.put("iban", "Το iban δεν μπορεί να είναι μικρότερο από 5 ψηφία");
        }

        if (dto.getBalance() == null || dto.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το αρχικό υπόλοιπο δεν μπορεί να είναι αρνητικό.");
        }

        if (accountService.isIBANExists(dto.getIban())) {
            errors.put("iban", "Το iban υπάρχει ήδη.");
        }

        // Θα μπορούσαμε να ελέγξουμε αν το iban υπάρχει ήδη
        return errors;
    }
}
