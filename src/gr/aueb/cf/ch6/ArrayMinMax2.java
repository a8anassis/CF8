package gr.aueb.cf.ch6;

/**
 * Βρίσκει το ελάχιστο ή το μέγιστο ενός πίνακα
 * υποθέτοντας ότι το αρχικό min είναι το MAXINT
 * (Integer.MAX_VALUE) και αντίστοιχα για το max,
 * το αρχικό max είναι το MIN Integer Value.
 */
public class ArrayMinMax2 {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxValue = Integer.MIN_VALUE;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
