package gr.aueb.cf.ch7;

/**
 * Κανονική αντιγραφή με αντιγραφή δεικτών
 * γιατί τα Strings είναι immutable.
 */
public class StringCopy {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = s1; // Copy

        s2 = "Hello";
    }
}


