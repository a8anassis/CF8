package gr.aueb.cf.review_challenges;

import java.util.Arrays;

/**
 * Rotate an array left by an offset.
 */
public class LeftRotation12 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateLeft(arr, 2)));
    }

    public static int[] rotateLeft(int[] arr, int offset) {
        int[] returnedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            returnedArr[((i - offset) + arr.length) % arr.length] = arr[i];
        }
        return returnedArr;
    }
}


