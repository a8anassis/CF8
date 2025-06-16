package gr.aueb.cf.ch19.regex;

public class RegExMain {

    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(isHello(s));
        System.out.println(isHelloOrHi(s));

        System.out.println(isHhello(s));
    }

    public static boolean isHello(String s) {
        return s.matches("hello");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("hello|hi");
    }

    public static boolean isHhello(String s) {
        return s.matches("[hH]ello");
    }

    public static boolean isStartWithUpperCase(String s) {
        return s.matches("[A-Z]coding");
    }

    public static boolean isStartWithUpperOrLowerCase(String s) {
        return s.matches("[A-Za-z]coding");
    }

    public static boolean isStartWithLetter(String s) {
        return s.matches("[A-Za-z0-9_]coding");
    }

    public static boolean anyAndDigit(String s) {
        // return s.matches(".[0-9]");
        return s.matches(".\\d");
    }

    public static boolean dotAndDigit(String s) {
        return s.matches("\\.[0-9]");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");       // dd/mm/yyyy
    }

}
