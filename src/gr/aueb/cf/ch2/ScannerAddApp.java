package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το
 * stdin (keyboard) και υπολογίζει το αποτέλεσμα.
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);
    }
}
