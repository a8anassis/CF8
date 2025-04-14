package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει char με Scanner.
 */
public class CharInput2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Παρακαλώ δώστε ένα χαρακτήρα");
        inputChar = scanner.nextLine().charAt(0);
        System.out.println("Input char: " + inputChar);
    }
}
