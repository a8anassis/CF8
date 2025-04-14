package gr.aueb.cf.ch4;

/**
 * Char output demo.
 */
public class CharPrint {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '8';

        System.out.println("char: " + ch1 + ", ordinal: " + (int) ch1);
        System.out.println("char: " + ch2 + ", ordinal: " + (int) ch2);

        System.out.printf("char: %c, ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("char: %c, ordinal: %d\n", ch2, (int) ch2);
    }
}
