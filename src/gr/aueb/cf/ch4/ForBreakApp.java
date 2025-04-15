package gr.aueb.cf.ch4;

/**
 * Χρήση της break για να διακόψουμε την
 * εκτέλεση της for.
 */
public class ForBreakApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) break;
        }
    }
}
