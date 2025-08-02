package gr.aueb.cf.review_challenges;

import java.util.Arrays;

/**
 * Δίνεται ένας πίνακας ακεραίων. Να υπολογιστούν οι αναλογίες (σε δεκαδικό με 6 ψηφία) των:
 *
 * Θετικών αριθμών (> 0).
 * Αρνητικών αριθμών (< 0).
 * Μηδενικών (== 0).
 *
 * Παράδειγμα:
 *
 * int[] arr = {1, -2, 0, 3, 0, -4};
 * Έξοδος:
 *
 * Έξοδος
 * 0.333333  // Θετικά (2/6)
 * 0.333333  // Αρνητικά (2/6)
 * 0.333333  // Μηδενικά (2/6)
 */
public class Frequencies1f {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, -1, -3};
        printFrequencies(arr);
    }

    public static void printFrequencies(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        int total = arr.length;

        if (total == 0) {
            System.out.println("Array is empty - no frequencies to calculate");
            return;
        }

        for (int item : arr) {
            if (item > 0) positives++;
            else if (item < 0) negatives++;
            else zeroes++;
        }

        System.out.printf("Positives: %.6f\n", positives / (double) total);
        System.out.printf("Negatives: %.6f\n", negatives / (double) total);
        System.out.printf("Zeroes: %.6f", zeroes / (double) total);

//        Sorter Solution με streams
//        System.out.printf("Positives: %.6f\n", Arrays.stream(arr).filter(x -> x > 0).count() / (double) total);
//        System.out.printf("Negatives: %.6f\n", Arrays.stream(arr).filter(x -> x < 0).count() / (double) total);
//        System.out.printf("Zeroes:    %.6f", Arrays.stream(arr).filter(x -> x == 0).count() / (double) total);
    }
}
