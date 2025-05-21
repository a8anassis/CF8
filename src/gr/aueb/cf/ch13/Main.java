package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR12345", "Alice", "W.", "F07654321", 100);

        try {
            aliceAccount.deposit(500);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(50, "F07654321");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(100, "AB123");    // Δίνει exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
