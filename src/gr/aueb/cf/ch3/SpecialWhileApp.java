package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ειδικές (edge) περιπτώσεις της
 * while.
 */
public class SpecialWhileApp {

    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        while (i <= 0) System.out.println("Δεν μπαίνει ποτέ μέσα στη while");

        while (scanner.nextInt() != -1);    // απλώς καταναλώνει το input μέχρι να βρει -1

        while (i <= 1) {
            System.out.println("Μία μόνο φορά");
            i++;
        }

        while (true) {
            System.out.println("Εκτελείται για πάντα");
        }
    }
}
