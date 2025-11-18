package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Συμβαίνει όταν αποτυγχάνει η {@link Integer#parseInt(String)}.
 */
public class ExceptionNumberFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        String inputStr = "";

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Οι χαρακτήρες είναι μη αποδεκτοί. Παρακαλώ δώστε νέο ακέραιο");
        }
        num1 = Integer.parseInt(inputStr);
        System.out.println(num1);
    }

    /**
     * Checks if the given string is an integer.
     * @param s     the string to check.
     * @return      true if the string is an integer, false otherwise.
     */
    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
