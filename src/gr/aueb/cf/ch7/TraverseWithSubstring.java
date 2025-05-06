package gr.aueb.cf.ch7;

/**
 * Εκτυπώνει char-by-char με τη χρήση
 * της {@link String#substring(int)}.
 */
public class TraverseWithSubstring {

    public static void main(String[] args) {
        String s = "Coding";
        traverse(s);
    }


    /**
     * Prints a String as a series of substrings
     * of length 1.
     * @param s the input String.
     */
    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1) + " ");
        }
    }
}
