package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δώσει αριθμητή και
 * παρoνομαστή και το πρόγραμμα θα πρέπει
 * να ελέγξει αν ο παρoνομαστής είναι 0, γιατί
 * δεν μπορεί γίνει διαίρεση με το μηδέν.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Παρακαλώ δώστε τον αριθμητή");
            numerator = scanner.nextInt();

            System.out.println("Δώστε παρoνομαστή");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Παρονομαστής δεν πρέπει να είναι 0. Προσπάθήστε ξανά!");
                //break;
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);
        }
    }
}
