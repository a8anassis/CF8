package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Πιο αναλυτική χρήση της δομής ελέγχου
 * for.
 */
public class FlexibleFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ εισάγετε start, end και step");
        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = start; i < end; i += step) {
            iterations++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
