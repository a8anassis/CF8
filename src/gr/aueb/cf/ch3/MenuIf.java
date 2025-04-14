package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με επιλογές και να ελέγχει
 * την επιλογή με if-then-else
 */
public class MenuIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Λάθος επιλογή");
                continue; // jump to while next loop immediately
            }

            if (choice == 5) {
                System.out.println("Ευχαριστούμε. ");
                break;  // φεύγει από τη while
            }

            if (choice == 1) {
                System.out.println("Η εισαγωγή έγινε επιτυχώς");
            } else if (choice == 2) {
                System.out.println("Η ενημέρωση έγινε επιτυχώς");
            } else if (choice == 3) {
                System.out.println("Η διαγραφή έγινε επιτυχώς");
            } else {    // if (choice == 4)
                System.out.println("Η αναζήτηση έγινε επιτυχώς");
            }
        }
    }
}
