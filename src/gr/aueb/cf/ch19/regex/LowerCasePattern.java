package gr.aueb.cf.ch19.regex;


import java.util.regex.Pattern;

/**
 * Κάνει match 8 τουλάχιστον χαρακτήρες εκ των οποίων
 * τουλάχιστον ένας είναι lower-case.
 */
public class LowerCasePattern {

    public static void main(String[] args) {
        String s = "bU34&#PP";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])^.{8,}$");
    }
}
