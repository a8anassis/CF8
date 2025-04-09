package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Παρέχονται ακέραιοι αριθμοί από το
 * stdio μέχρι να βρεθεί το -1 (sentinel)
 * Υπολογίζει το πλήθος των επαναλήψεων.
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ εισάγετε ακεραίους (-1 για έξοδο)");
        num = scanner.nextInt();

        while (num != -1) {
            iterations++;
            System.out.println("Παρακαλώ δώστε τον επόμενο ακέραιο (-1 για έξοδο)");
            num = scanner.nextInt();
        }

        System.out.printf("%d επαναλήψεις", iterations);
    }
}
