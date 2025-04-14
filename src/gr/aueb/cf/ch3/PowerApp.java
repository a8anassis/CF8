package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη δύο ακεραίους, έστω
 * base και power και υπολογίζει με επαναληπτικό
 * τρόπο (while-do) τη δύναμη base^power και εκτυπώνει
 * το αποτέλεσμα στο stdout. Για παράδειγμα, αν ο χρήστης
 * δώσει base = 2 και power = 10, τότε το base^power = 1024,
 * δηλαδή 2 * 2 * 2 * ... * 2, 10 φορές που ισούται με 1024.
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1; // προσοχή, στον πολλαπλασιασμό το result αρχικοποιείται στο 1
        int i = 1;  // δείκτης για τη while

        // Εντολές και while
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους, base και power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result = result * base; // result *= base;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d^%d = %d", base, power, result);
    }
}
