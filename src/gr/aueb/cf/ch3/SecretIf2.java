package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει όλες τις περιπτώσεις με if-then-else.
 */
public class SecretIf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Παρακαλώ εισάγετε το μυστικό κλειδί");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure. Try again!");
        }
    }
}
