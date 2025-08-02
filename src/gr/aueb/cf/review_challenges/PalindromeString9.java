package gr.aueb.cf.review_challenges;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν ένα String είναι
 * παλίνδρομο (διαβάζεται το ίδιο από την αρχή και το τέλος).
 */
public class PalindromeString9 {

    public static void main(String[] args) {
        String s = "andreasaerdna";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}