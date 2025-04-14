package gr.aueb.cf.ch4;

/**
 * Demo for surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F60A;    // U+D83D U+DE03, smiley
        System.out.println(Character.toChars(codePoint));
        System.out.println("\u20ac");   // euro sign
    }
}
