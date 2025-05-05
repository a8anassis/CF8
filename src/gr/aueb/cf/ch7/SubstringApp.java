package gr.aueb.cf.ch7;

/**
 * Parsing of a String finding
 * a substring. Slicing.
 */
public class SubstringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";
        String subStr;
        String subStr2;

        subStr = s.substring(1);        // oding Factory
        subStr2 = s.substring(1, 3);    // od

        System.out.println(subStr);
        System.out.println(subStr2);
    }
}
