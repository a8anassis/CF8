package gr.aueb.cf.ch15.custom_exceptions;

public class Main {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR12345", "Alice", "W.", "F07654321", 100);

        try {
            aliceAccount.deposit(500);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(50, "F07654321");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(100, "AB123");    // Δίνει exception

        } catch (NegativeAmountException e) {
            System.out.println("Το ποσό που καταθέσατε δεν ήταν θετικό.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Το υπόλοιπο του λογαριασμού σας δεν επαρκεί για τη συναλλαγή.");
        } catch (SsnNotValidException e) {
            System.out.println("Το ssn σας δεν είναι έγκυρο.");
        }
    }
}
