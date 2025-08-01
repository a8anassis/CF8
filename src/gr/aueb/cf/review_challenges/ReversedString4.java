package gr.aueb.cf.review_challenges;

/**
 * Γράψτε μια μέθοδο που δέχεται ένα String
 * και επιστρέφει το αντεστραμμένο του.
 */
public class ReversedString4 {

    public static void main(String[] args) {
        String s = "Athens";

        System.out.println(s);
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }
}
