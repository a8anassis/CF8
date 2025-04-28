package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το a^n αναδρομικά.
 */
public class PowerRecursive {

    public static void main(String[] args) {

    }

    public static int power(int a, int n) {
//        if (n == 0) return 1;
//        return a * power(a, n-1);
        return (n == 0) ? 1 : a * power(a, n-1);
    }
}
