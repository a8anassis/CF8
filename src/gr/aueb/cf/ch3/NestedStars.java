package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 5 σειρές από 10 αστεράκιa
 */
public class NestedStars {

    public static void main(String[] args) {

        int i;
        int j = 1;

        while (j <= 5) {
            i = 1;

            while (i <= 10) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            j++;
        }
    }
}
