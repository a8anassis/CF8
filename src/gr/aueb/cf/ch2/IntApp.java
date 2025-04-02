package gr.aueb.cf.ch2;

/**
 * Demo class for Integer data types.
 */
public class IntApp {

    public static void main(String[] args) {

        System.out.printf("int, size: %d, min: %,d, max: %,d\n", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte, size: %d, min: %d, max: %d\n", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short, size: %d, min: %d, max: %d\n", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long, size: %d, min: %,d, max: %,d\n", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
