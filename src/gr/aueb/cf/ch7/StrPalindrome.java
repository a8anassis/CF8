package gr.aueb.cf.ch7;

/**
 * Ελέγχει αν ένα string είναι παλινδρομικό.
 * Για παράδειγμα, το "AttAB" είναι παλινδρομικό.
 * Hint. Ο StringBuilder παρέχει τηn sb.reverse()
 * Hint. Ο StringBuilder παρέχει την sb.toString()
 */
public class StrPalindrome {

    public static void main(String[] args) {
        String s = "AttAB";
        System.out.println(isPalindrome(s));
    }

    /**
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
