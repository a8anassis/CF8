package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο από 1 - 10
 * και υπολογίζεται ως output ο πολλαπλασιασμός
 * του ακεραίου με όλους τους ακέραιους από 1-10.
 * Για παράδειγμα: αν ο χρήστης δώσει το 5 τότε ως
 * output αναμένουμε να πάρουμε:
 * 5 * 1 = 5
 * 5 * 2 = 10
 * 5 * 3 = 15
 * ...
 * ...
 * 5 * 10 = 50
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Παρακαλώ δώστε ένα αριθμό");
        num = scanner.nextInt();

        // while-do
        while (i <= 10) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        }
    }
}
