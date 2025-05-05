package gr.aueb.cf.ch7;

/**
 * Strings are cached in  SCP (String Constant Pool)
 * or Intern Area for efficiency. In order to be
 * secure Strings are immutable.
 */
public class StringImmutable {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding"; // s2 = s1

        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);
    }
}
