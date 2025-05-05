package gr.aueb.cf.ch7;

/**
 * Δήλωση και αρχικοποίηση (populate)
 * ενός {@link String}.
 */
public class StringInit {

    public static void main(String[] args) {
        String s = "Athens";
        String str = new String("University");

        System.out.println(s);
        System.out.println("Length: " + s.length());
        System.out.printf("City: %s", str);
    }
}
