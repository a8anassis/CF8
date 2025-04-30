package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Κατηγοριοποιεί τα προβλήματα των συλλογών
 * δεδομένων (όπως οι πίνακες) σε τρεις κατηγορίες:
 * 1. Filtering
 * 2. Mapping
 * 3. Aggregate methods (+ predicates)
 */
public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 10, 11, 17, 21, 34, 50};

    }

    // Filtering

    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) {
                arrayToReturn[count++] = el;
                // count++;
            }
        }

        return Arrays.copyOf(arrayToReturn, count);
    }

    // Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    // Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        return  sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) return true;
        }
        return false;
    }

    public static boolean allEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) return false; // found an odd num
        }
        return true;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int counter = 0;

        for (int num : arr) {
            if (num % 2 == 0) counter++;
            // if (counter > 2) return true; // early exit
        }
        // return false;
        return counter > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) return true;
        }
        return false;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];    // default value is 0

        for (int num : arr) {
            if (++endings[num % 10] > 2) return true;   // early exit
//            int ending = num % 10;
//            int count = endings[ending]++;
//            if (count > 2) return true;   // early exit
        }
        return false;
    }
}
