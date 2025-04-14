package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει με επαναληπτικό τρόπο το παραγοντικό του n.
 * Το n είναι ένας ακέραιος που δίνει ο χρήστης.
 * Το παραγοντικό του n συμβολίζεται ως n!
 * Και ισούται με 1 * 2 * 3 * ... * n. Για παράδειγμα,
 * το 3! = 1 * 2 * 3, το 0! = 1, κλπ.
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγετε το n");
        n = scanner.nextInt();

        while (i <= n) {
            facto = facto * i;  // facto *= i
            i++;
        }

        System.out.printf("%d! = %d", n, facto);
    }
}
