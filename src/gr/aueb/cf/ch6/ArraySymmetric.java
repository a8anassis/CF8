package gr.aueb.cf.ch6;

/**
 * Ελέγχει με τη χρήση δύο αλγορίθμων αν ένας
 * πίνακας ακεραίων είναι συμμετρικός ή όχι.
 */
public class ArraySymmetric {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                // return false;       // early exit
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
        //return true;
    }

    public static boolean isSymmetric(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

}
