package gr.aueb.cf.solutions.ch13;

public class StringUtil {

    public static boolean isPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
