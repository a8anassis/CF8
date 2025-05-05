package gr.aueb.cf.ch7;

/**
 * Συνενώνει δύο ή περισσότερα Strings.
 */
public class StringConcat {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Factory";

        String s3 = s1 + s2;    // + operator in Java is overloaded
        String s4 = s1.concat(s2);

        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);  // chaining

        System.out.println("*".repeat(10));
    }
}
