package gr.aueb.cf.review_challenges;

import java.util.Arrays;

/**
 * Δίνονται δύο πίνακες με 3 βαθμολογίες κάθε ένας.
 * Συγκρίνετε τις βαθμολογίες και επιστρέψτε τους πόντους κάθε παίκτη.
 * Οι Alice και Bob αξιολογούνται σε 3 κατηγορίες (π.χ., Μουσική, Προγραμματισμός, Γρήγορη Σκέψη).
 * Κάθε κατηγορία δίνει βαθμολογία από 1 έως 100.
 *
 * Αν η Alice έχει μεγαλύτερη βαθμολογία σε μια κατηγορία, παίρνει 1 πόντο.
 * Αν ο Bob έχει μεγαλύτερη βαθμολογία, παίρνει εκείνος 1 πόντο.
 * Αν είναι ίσοι, κανείς δεν παίρνει πόντο.
 *
 * Επιστροφή: Πίνακας με 2 θέσεις [πόντοι_Alice, πόντοι_Bob]
 */
public class CompareTriplets1c {

    public static void main(String[] args) {
        int[] alice = { 10, 9, 15};
        int[] bob = {17, 10, 5};
        System.out.println(Arrays.toString(compareTriplets(alice, bob)));
    }

    public static int[] compareTriplets(int[] a, int[] b) {
        int[] points = new int[2];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) points[0]++;
            else if (a[i] < b[i]) points[1]++;
        }
        return points;
    }
}
