package gr.aueb.cf.ch7;

/**
 * Δημιουργεί ένα String όπως κάνει
 * η printf.
 */
public class StringFormat {

    public static void main(String[] args) {
        String s = "Coding";
        int num = 10;

        String formattedStr = String.format("%s:%d", s, num);
        System.out.println(formattedStr);
    }
}
