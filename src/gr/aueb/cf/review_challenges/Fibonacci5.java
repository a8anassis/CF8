package gr.aueb.cf.review_challenges;

/**
 * Γράψτε μια μέθοδο που επιστρέφει τον n-οστό
 * αριθμό Fibonacci (0, 1, 1, 2, 3, 5, 8, ...).
 *
 * Παράδειγμα
 * Είσοδος: n = 0
 * Έξοδος: 0
 *
 * Είσοδος: n = 5
 * Έξοδος: 5
 *
 * Είσοδος: n = 7
 * Έξοδος: 13
 */
public class Fibonacci5 {

    public static void main(String[] args) {
        int n = 10;

        System.out.println(fibonacci(10));
    }

    /**
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int fibo = 0;

        if (n < 1) throw new IllegalArgumentException("Το n δεν μπορεί να είναι αρνητικό");

        for (int i = 1; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
}
