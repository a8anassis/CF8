package gr.aueb.cf.ch6;

/**
 * Διασχίζει (traverses) ένα πίνακα, δηλαδή επισκέπτεται
 * μία-μία τις θέσεις τους πίνακα και εκτυπώνει
 * την τιμή της κάθε θέσης
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] grades = {10, 8, 5, 7, 9};
        int[] arr3 = new int[] {2, 4, 6, 8, 10};

        // traverse with for
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // enhanced for
        for (int item : arr1) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int grade : grades) {
            System.out.print(grade + " ");
        }

    }
}
