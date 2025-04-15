package gr.aueb.cf.ch5;

/**
 * Συγκρίνει δύο double που κανονικά θα
 * έπρεπε να είναι ίσοι αλλά λόγω του σφάλματος
 * αναπαράστασης εμφανίζονται ως άνισοι.
 */
public class DoubleInequality {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        if (actual == expected) System.out.println("Equal");
        else System.out.println("Not equal");

        System.out.printf("actual: %.20f, expected: %.20f", actual, expected);
    }
}
