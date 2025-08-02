package gr.aueb.cf.review_challenges;

import java.util.Arrays;

/**
 * Δίνεται ένας πίνακας με τα ύψη κεριών (π.χ., [3, 2, 3, 1]). Μετρήστε πόσα κεριά έχουν το μέγιστο ύψος.
 *
 * Παράδειγμα:
 *
 * Είσοδος: [4, 4, 1, 3]
 * Έξοδος: 2 (το μέγιστο ύψος είναι 4 και υπάρχουν 2 κεριά με αυτό το ύψος).
 */
public class Candles1h {

    public static void main(String[] args) {
        int[] arr = { 4, 4, 1, 3, 4, 4 };
        System.out.println(candlesCount(arr));
    }

    public static long candlesCount(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        return Arrays.stream(arr).filter(c -> c == max).count();
    }
}
