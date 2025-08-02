package gr.aueb.cf.review_challenges;

/**
 * Δίνεται ένας τετραγωνικός πίνακας.
 * Να υπολογιστεί η απόλυτη διαφορά μεταξύ των αθροισμάτων των διαγωνίων του.
 * Παράδειγμα:

 *     {1, 2, 3},
 *     {4, 5, 6},
 *     {9, 8, 9}
 *
 * Κύρια Διαγώνιος (1, 5, 9):
 * 1 + 5 + 9 = 15
 *
 * Δευτερεύουσα Διαγώνιος (3, 5, 9):
 * 3 + 5 + 9 = 17
 *
 * Διαφορά:
 * |15 - 17| = 2
 */
public class DiagonalDiff1d {

    public static void main(String[] args) {
        int[][] arr = { {1, 4, 15},
                        {2, 1, 8},
                        {3, 3, 1}};
        System.out.println(diagonalDiff(arr));
    }

    public static int diagonalDiff(int[][] arr) {
        int diagonalA = 0, diagonalB = 0;
        int diff = 0;

        for (int i = 0; i < arr.length; i++) {
            diagonalA += arr[i][i];
            diagonalB += arr[i][arr.length - i - 1];
        }

        return Math.abs(diagonalA - diagonalB);
    }
}
