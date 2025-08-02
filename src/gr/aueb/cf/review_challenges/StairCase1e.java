package gr.aueb.cf.review_challenges;

/**
 * Δημιουργήστε μια σκάλα με # και κενά ( ), όπου:
 * Το ύψος της σκάλας είναι ένας ακέραιος n.
 *
 * Κάθε σκαλί έχει τον ίδιο αριθμό # με τον αριθμό της γραμμής του (πρώτη γραμμή: 1 #, δεύτερη γραμμή: 2 #, κ.ο.κ.).
 * Τα κενά ευθυγραμμίζονται στα δεξιά για να σχηματίσουν τη σκάλα.
 *
 * Παράδειγμα για n = 4:
 *
 * text
 *    #
 *   ##
 *  ###
 * ####
 */
public class StairCase1e {

    public static void main(String[] args) {
        printStair(10);
    }

    public static void printStair(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
