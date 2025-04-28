package gr.aueb.cf.ch6;

/**
 * Unsized array initialization.
 */
public class ArrayInit2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    // από 0 έως 9, σύνολο 10 στοιχεία

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("...");
        System.out.println(arr[arr.length - 1]);
    }
}
