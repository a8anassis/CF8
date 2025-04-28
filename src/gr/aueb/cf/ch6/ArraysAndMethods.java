package gr.aueb.cf.ch6;

/**
 * Demo with arrays and methods.
 * Πως περνάμε πίνακες ως παραμέτρους
 * μεθόδους.
 */
public class ArraysAndMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr, 1, arr.length - 1);
    }

    /**
     * Prints the elements of an array.
     *
     * @param arr   the input array.
     */
    public static void printArray(int[] arr) {
        arr[0] = 1000;  // Οποιαδήποτε αλλαγή στις τιμές του array διατηρείται.
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }


    /**
     * Overloaded version of for with boundaries.
     * Print an array slice from 'low' to 'high',
     * that is from low till high - 1. High is not
     * inclusive. Checks for edge cases: low < 0
     * and high > length - 1.
     *
     * @param arr       the input array.
     * @param low       the low index.
     * @param high      the high index (exclusive)
     */
    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length) {
            return;
        }

        if (low > high) {
            return;
        }

        for (int i = low; i < high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
