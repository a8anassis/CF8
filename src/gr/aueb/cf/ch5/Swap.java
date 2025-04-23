package gr.aueb.cf.ch5;

/**
 * Αμοιβαία ανταλλαγή των τιμών δύο μεταβλητών.
 * Αν έχουμε για παράδειγμα α=5 και b=10, τότε
 * να γίνει a=10 και b=5.
 */
public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a=%d, b=%d\n", a, b);
        swap(a, b);
        System.out.printf("a=%d, b=%d\n", a, b);
    }

    /**
     * Mutually exchanges the values of the
     * two input variables.
     * @param a     the first input.
     * @param b     the second input.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
