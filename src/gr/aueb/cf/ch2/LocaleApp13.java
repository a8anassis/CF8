package gr.aueb.cf.ch2;

import java.util.Locale;

/**
 * Demonstrates the use of Localization.
 */
public class LocaleApp13 {

    public static void main(String[] args) {
        int num = 123456789;
        System.out.printf(Locale.forLanguageTag("el"), "GR locale: %,d%n", num);
        System.out.printf(Locale.US, "US locale: %,d", num);
    }
}
