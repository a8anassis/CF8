package gr.aueb.cf.ch6;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα και
 * επιστρέφει τη θέση του στοιχείου στον πίνακα
 * ή -1 αν δεν υπάρχει το στοιχείο.
 */
public class ArraySearch {

    public static void main(String[] args) {
        int position;
        int value = 233;
        int[] arr = {1, 2, 23};

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found. Position= " + (position + 1) + ", value= " + arr[position]);
        }
    }

    /**
     * Επιστρέφει τη θέση του 1ου στοιχείου του πίνακα που ισούται
     * με την τιμή αναζήτησης. Αν δεν υπάρχει το στοιχείο, επιστρέφει
     * -1.
     * @param arr       ο input πίνακας.
     * @param value     η τιμή αναζήτησης.
     * @return          το position του πίνακα που βρέθηκε το στοιχείο,
     *                  -1 otherwise.
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
