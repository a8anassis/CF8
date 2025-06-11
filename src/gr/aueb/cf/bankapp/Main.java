package gr.aueb.cf.bankapp;

import gr.aueb.cf.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.bankapp.dao.IAccountDAO;
import gr.aueb.cf.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.bankapp.service.IAccountService;
import gr.aueb.cf.bankapp.validation.Validator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;

        while (true) {
            printMenu();
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1":
                        System.out.print("Παρακαλώ εισάγετε το iban: ");
                        String iban = scanner.nextLine();
                        System.out.println("Παρακαλώ εισάγετε το υπόλοιπο: ");
                        BigDecimal initialBalance = new BigDecimal(scanner.nextLine());
                        AccountInsertDTO accountInsertDTO = new AccountInsertDTO(iban, initialBalance);

                        // Validation
                        Map<String, String> errors;
                        errors = Validator.validate(accountInsertDTO);

                        if (!errors.isEmpty()) {
                            errors.forEach((k, v) -> System.out.println(v));
                            System.out.println("Ο λογαριασμός δεν δημιουργήθηκε. Προσπαθήστε ξανά.");
                            break;
                        }

                        accountService.createNewAccount(accountInsertDTO);
                        System.out.println("Ο λογαριασμός δημιουργήθηκε επιτυχώς");
                        break;
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    default:
                        System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
                }
            } catch (NegativeAmountException | InsufficientBalanceException | AccountNotFoundException e) {
                System.out.println("Λάθος. " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Λάθος μορφή αριθμού. Παρακαλώ εισάγετε ένα έγκυρο ποσό");
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n=== Account Service Menu ===");
        System.out.println("1. Εισαγωγή νέου λογαριασμού");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Ερώτηση Υπολοίπου");
        System.out.println("5. Εκτύπωση όλων των λογαριασμών");
        System.out.println("6. Έξοδος");
        System.out.print("Εισάγετε μία επιλογή: ");
    }
}
