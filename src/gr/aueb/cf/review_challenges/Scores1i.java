package gr.aueb.cf.review_challenges;


import java.util.*;

/**
 * Δίνεται ένας πίνακας με τους βαθμούς ενός παίκτη σε διαδοχικά παιχνίδια (π.χ., [10, 5, 20, 20, 4, 5, 2, 25, 1]). Να μετρηθούν:
 *
 * Πόσες φορές έσπασε το ρεκόρ υψηλότερου σκορ (καλύτερο ρεκόρ).
 *
 * Πόσες φορές έσπασε το ρεκόρ χαμηλότερου σκορ (χειρότερο ρεκόρ).
 *
 * Επιστροφή: Πίνακας με 2 ακεραίους [αριθμός_καλύτερων_ρεκόρ, αριθμός_χειρότερων_ρεκόρ].
 *
 * Π.	Σκορ max min maxCount	minCount	Σχόλια
 * 1	10	10	10	0	0	Αρχικές τιμές
 * 2	5	10	5	0	1	Νέα ελάχιστη τιμή (5)
 * 3	20	20	5	1	1	Νέα μέγιστη τιμή (20)
 * 4	20	20	5	1	1	Χωρίς αλλαγή
 * 5	4	20	4	1	2	Νέα ελάχιστη τιμή (4)
 * 6	5	20	4	1	2	Χωρίς αλλαγή
 * 7	2	20	2	1	3	Νέα ελάχιστη τιμή (2)
 * 8	25	25	2	2	3	Νέα μέγιστη τιμή (25)
 * 9	1	25	1	2	4	Νέα ελάχιστη τιμή (1)
 *
 * Τελικό αποτέλεσμα: [2, 4] (2 φορές έσπασε το καλύτερο ρεκόρ, 4 φορές το χειρότερο).
 */
public class Scores1i {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        System.out.println(Arrays.toString(getMaxMinScoreCounts(arr)));
    }

    public static int[] getMaxMinScoreCounts(int[] arr) {

        int maxRec = arr[0];
        int minRec = arr[0];
        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxRec) {
                maxRec = arr[i];
                maxCount++;
            }
            if (arr[i] < minRec) {
                minRec = arr[i];
                minCount++;
            }
        }
        return new int[] {maxCount, minCount};
    }
}
