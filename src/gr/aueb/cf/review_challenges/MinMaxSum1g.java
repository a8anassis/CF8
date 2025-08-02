package gr.aueb.cf.review_challenges;

import java.util.Arrays;

/**
 * Δίνονται 5 θετικοί ακέραιοι. Υπολογίστε:
 *
 * Το ελάχιστο άθροισμα 4 από τους 5 αριθμούς (δηλαδή, αθροίζουμε τους 4 μικρότερους).
 * Το μέγιστο άθροισμα 4 από τους 5 αριθμούς (δηλαδή, αθροίζουμε τους 4 μεγαλύτερους).
 *
 * Παράδειγμα:
 * Είσοδος: [1, 3, 5, 7, 9]
 *
 * Ελάχιστο άθροισμα: 1 + 3 + 5 + 7 = 16
 * Μέγιστο άθροισμα: 3 + 5 + 7 + 9 = 24
 * Τυπώνεται: 16 24
 *
 * Hint. Exclude one (regardless of duplicates).
 */
public class MinMaxSum1g {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1 };
        minMaxSum4From5(arr);
    }

    public static void minMaxSum4From5(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        int sum = 0;

        sum = Arrays.stream(arr).sum();

        System.out.println("MaxSum: " + (sum - min));
        System.out.println("MinSum: " + (sum - max));
    }
}
